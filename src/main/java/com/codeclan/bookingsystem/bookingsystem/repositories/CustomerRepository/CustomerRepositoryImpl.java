package com.codeclan.bookingsystem.bookingsystem.repositories.CustomerRepository;

import com.codeclan.bookingsystem.bookingsystem.models.Customer;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

public class CustomerRepositoryImpl implements CustomerRepositoryCustom {

    @Autowired
    EntityManager entityManager;

    @Transactional
    public List<Customer> findCustomersBookingWithCourseId(Long courseId){
        List<Customer> results = null;

        try {
            Session session = entityManager.unwrap(Session.class);
            Criteria cr = session.createCriteria(Customer.class);
            cr.createAlias("bookings", "bookingAlias");
            cr.add(Restrictions.eq("bookingAlias.course.id", courseId));
            results = cr.list();
        }
        catch (HibernateException ex) {
            ex.printStackTrace();
        }
        return results;
    }


}
