package lv.javaguru.springboot.customermanager3.service;

import lv.javaguru.springboot.customermanager3.dao.CustomerRepository;
import lv.javaguru.springboot.customermanager3.model.Customer;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

@Service
public class CustomerServiceImpl {

    private static final Logger logger = LoggerFactory.getLogger(CustomerServiceImpl.class);

    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Transactional
    public void addCustomer(Customer customer) {
        customerRepository.save(customer);
        logger.info("Customer successfully saved. Customer details: " + customer);
    }

    @Transactional
    public void updateCustomer(Customer customer) {
        customerRepository.save(customer);
        logger.info("Customer successfully update. Customer details: " + customer);
    }

    @Transactional
    public void removeCustomer(int id) {
        Customer customer = customerRepository.findOne(id);
        if (customer != null) {
            customerRepository.delete(id);
        }
        logger.info("Customer successfully removed. Customer details: " + customer);
    }

    @Transactional
    public Customer getCustomerById(int id) {
        Customer customer = customerRepository.findOne(id);
        logger.info(customer.toString());
        return customer;
    }

    @Transactional
    public List<Customer> listCustomers() {
        List<Customer> customerList = (List) customerRepository.findAll();
        for (Customer customer : customerList) {
            logger.info("Customer list: " + customer);
        }
        return customerList;
    }
}
