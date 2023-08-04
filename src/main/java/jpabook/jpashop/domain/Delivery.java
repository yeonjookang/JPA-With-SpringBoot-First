package jpabook.jpashop.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Delivery {
    @Id
    @GeneratedValue
    @Column(name="DELIVERY_ID")
    private Long id;

    @OneToOne(mappedBy = "delivery")
    @Column(name="ORDER")
    private Order order;

    @Embedded
    @Column(name="ADDRESS")
    private Address address;

    @Enumerated(EnumType.STRING)
    @Column(name="DELIVERY_STATUS")
    private DeliveryStatus status;
}
