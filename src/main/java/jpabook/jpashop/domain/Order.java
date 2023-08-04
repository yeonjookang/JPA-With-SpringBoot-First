package jpabook.jpashop.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "ORDERS")
@Getter @Setter
public class Order {
    @Id @GeneratedValue
    @Column(name="ORDER_ID")
    private Long id;

    @ManyToOne
    @JoinColumn(name="MEMBER_ID")
    private Member member;

    @OneToMany(mappedBy = "order")
    @Column(name="ORDER_ITEM")
    private List<OrderItem> orderItems=new ArrayList<>();

    @OneToOne
    @JoinColumn(name="DELIVERY_ID")
    @Column(name="DELIVERY")
    private Delivery delivery;

    @Column(name="ORDERDATE")
    private LocalDateTime orderDate;

    @Enumerated(EnumType.STRING)
    @Column(name="STATUS")
    private OrderStatus status;
}
