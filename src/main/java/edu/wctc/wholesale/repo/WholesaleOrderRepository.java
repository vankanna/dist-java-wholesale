package edu.wctc.wholesale.repo;

import edu.wctc.wholesale.entity.WholesaleOrder;
import org.springframework.data.repository.CrudRepository;

public interface WholesaleOrderRepository extends CrudRepository<WholesaleOrder, Integer> {
}
