package jpabook.jpashop.domain.item;

import jakarta.persistence.*;
import jdk.jfr.Enabled;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="dtype")
public abstract class Item {
    @Id @GeneratedValue
    @Column(name="ITEM_ID")
    private Long id;

    @Column(name="NAME")
    private String name;

    @Column(name="PRICE")
    private int price;

    @Column(name="STOCKQUANTITY")
    private int stockQuantity;

}
