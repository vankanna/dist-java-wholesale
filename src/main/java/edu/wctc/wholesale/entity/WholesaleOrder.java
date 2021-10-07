package edu.wctc.wholesale.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Data
@NoArgsConstructor
public class WholesaleOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private int id;

    @Column(name = "purchase_order_num")
    private String purchaseOrderNumber;

    @Column(name = "terms")
    private String term;

    @OneToMany
    @JoinColumn(name = "cutomer_id")
    private Customer customer;

    @OneToMany
    @Column(name = "product_id")
    private Product product;

    @Column(name = "purchase_date")
    private Date purchaseDate;

    @Column(name = "shipped_date")
    private Date shippedDate;

}
