package DAO;
import MAPPED_obj.Bill;
import MAPPED_obj.Customer;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class Dao {
    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence");
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    public void save(Customer customer) {
        entityManager.getTransaction().begin();
        entityManager.persist(customer);
        entityManager.getTransaction().commit();
    }
    public void savebill(Bill bill) {
        entityManager.getTransaction().begin();
        entityManager.persist(bill);
        entityManager.getTransaction().commit();
    }


    public Customer findById(int id) {
        Customer customer = entityManager.find(Customer.class, id);
        return customer;
    }
    public List<Customer> findAll() {
        return entityManager.createQuery("SELECT c FROM Cusomer c", Customer.class).getResultList();
    }
    public List<Bill> findAllbill() {
        return entityManager.createQuery("SELECT c FROM Bill c", Bill.class).getResultList();
    }
    public void delete(Customer customer) {
        entityManager.getTransaction().begin();
        entityManager.remove(customer);
        entityManager.getTransaction().commit();
    }
    public void close() {
        entityManager.close();
        entityManagerFactory.close();
    }

}
