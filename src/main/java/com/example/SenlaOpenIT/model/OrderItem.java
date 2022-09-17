package com.example.SenlaOpenIT.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "orders_items")
@Setter
@Getter
@NoArgsConstructor
@ToString
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "order_id")
    private Long orderId;
    @Column(name = "product_id")
    private Long productId;
    @Column(name = "quantity")
    private Long quantity;


    @ManyToOne
    @JoinColumn(name = "id")
    private Order order;

    @ManyToOne
    @JoinColumn(name = "id")
    private Product product;
}
