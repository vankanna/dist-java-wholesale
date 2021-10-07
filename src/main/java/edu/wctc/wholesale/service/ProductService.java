package edu.wctc.wholesale.service;

import edu.wctc.wholesale.entity.Product;
import edu.wctc.wholesale.exception.ResourceNotFoundException;

import java.util.List;

public interface ProductService {
    List<Product> getAllProduct();

    Product getProduct(int id) throws ResourceNotFoundException;
}
