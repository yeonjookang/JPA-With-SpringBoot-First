package jpabook.jpashop;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
@Setter
@Entity
public class Member {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    @ManyToOne
    @JoinColumn(name="TEAM_ID")
    private Team team;
}
