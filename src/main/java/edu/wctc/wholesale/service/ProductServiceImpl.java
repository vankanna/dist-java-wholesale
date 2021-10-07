package edu.wctc.wholesale.service;

import edu.wctc.wholesale.entity.Product;
import edu.wctc.wholesale.exception.ResourceNotFoundException;
import edu.wctc.wholesale.repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl {
    @Autowired
    private ProductRepository productRepository;

    List<Product> getAllProducts() {
        List<Product> list = new ArrayList<>();
        productRepository.findAll().forEach(list::add);
        return list;
    }

    Product getProduct(int id) throws ResourceNotFoundException {
        return productRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Product", "id", id));
    }

}
