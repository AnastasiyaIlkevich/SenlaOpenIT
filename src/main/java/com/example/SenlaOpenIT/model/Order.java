package com.example.SenlaOpenIT.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "orders")
@Setter
@Getter
@NoArgsConstructor
@ToString
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Long id;
    @Column(name = "user_id")
    private Long userId;
    @Column(name = "status")
    private String status;
    @Column(name = "create_at")
    private String createdAt;

    @OneToMany(mappedBy="orderId", cascade = CascadeType.DETACH)
    private List<OrderItem> listOrderItem;
}
