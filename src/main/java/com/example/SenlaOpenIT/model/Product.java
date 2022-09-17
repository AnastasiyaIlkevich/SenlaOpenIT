package com.example.SenlaOpenIT.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.Instant;
import java.util.List;


@Entity
@Table(name = "products")
@Setter
@Getter
@NoArgsConstructor
@ToString
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "price")
    private  Long price;
    @Enumerated
    private Status productStatus;
    @Column(name = "creat_at")
    private Timestamp createAt;



    @OneToMany(mappedBy="orderId", cascade = CascadeType.DETACH)
    private List<OrderItem> listOrderItem;

    @PreUpdate
    public void preUpdate() {
        createAt = new Timestamp(Instant.now().toEpochMilli());
    }
}
