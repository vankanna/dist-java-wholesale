package edu.wctc.wholesale.service;

import edu.wctc.wholesale.entity.WholesaleOrder;
import edu.wctc.wholesale.exception.ResourceNotFoundException;
import edu.wctc.wholesale.repo.WholesaleOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class WholesaleOrderServiceImpl {
    @Autowired
    private WholesaleOrderRepository wholesaleOrderRepository;

    List<WholesaleOrder> getAllWholeSaleOrders() {
        List<WholesaleOrder> list = new ArrayList<>();
        wholesaleOrderRepository.findAll().forEach(list::add);
        return list;
    }

    WholesaleOrder getWholesaleOrder(int id) throws ResourceNotFoundException {
        return wholesaleOrderRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Wholesale Order", "id", id));
    }

}
