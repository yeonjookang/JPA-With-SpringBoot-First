package jpabook.jpashop;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
public class Team {
    @Id
    @GeneratedValue
    @Column(name="TEAM_ID")
    private Long id;

    @Column(name="TEAMNAME")
    private String name;

    @OneToMany(mappedBy="team")
    private List<Member> members=new ArrayList<>();
}
