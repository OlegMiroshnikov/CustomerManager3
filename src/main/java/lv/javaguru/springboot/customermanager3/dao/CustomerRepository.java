package lv.javaguru.springboot.customermanager3.dao;

import lv.javaguru.springboot.customermanager3.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {
}
