package edu.wctc.wholesale.service;

import edu.wctc.wholesale.entity.WholesaleOrder;
import edu.wctc.wholesale.exception.ResourceNotFoundException;

import java.util.List;

public interface WholesaleOrderService {
    List<WholesaleOrder> getAllWholesaleOrders();

    WholesaleOrder getWholesaleOrder(int id) throws ResourceNotFoundException;


}
