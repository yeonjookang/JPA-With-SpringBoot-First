package jpabook.jpashop.domain;

import jakarta.persistence.*;
import jpabook.jpashop.domain.item.Item;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class OrderItem {

    @Id
    @GeneratedValue
    @Column(name="ORDER_ID")
    private Long id;

    @ManyToOne
    @JoinColumn(name="ITEM_ID")
    @Column(name="ITEM")
    private Item item;

    @ManyToOne
    @JoinColumn(name = "ORDER_ID")
    @Column(name="ORDER")
    private Order order;

    @Column(name="ORDER_PRICE")
    private int orderPrice;

    @Column(name="COUNT")
    private int count;
}
