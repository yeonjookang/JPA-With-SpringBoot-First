package jpabook.jpashop.domain;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Member {
    @Id @GeneratedValue
    @Column(name="MEMBER_ID")
    private Long id;

    @Column(name="NAME")
    private String name;

    @Embedded
    private Address address;

    @OneToMany(mappedBy = "member")
    @Column(name="ORDERS")
    private List<Order> orders = new ArrayList<>();
}
