package edu.wctc.wholesale.service;

import edu.wctc.wholesale.entity.Customer;
import edu.wctc.wholesale.exception.ResourceNotFoundException;

import java.util.List;

public interface CustomerService {
    List<Customer> getAllProduct();

    Customer getProduct(int id) throws ResourceNotFoundException;
}
