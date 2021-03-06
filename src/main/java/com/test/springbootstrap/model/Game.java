package com.test.springbootstrap.model;

import lombok.*;
import org.springframework.hateoas.Identifiable;

import javax.persistence.*;
import java.util.Date;
import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Game implements Identifiable<Long> {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Setter
    private Long id;

    @Setter @Getter
    private String titel;

    @Setter @Getter
    private Date relase;

    @Setter @Getter
    private String publisher;


    @OneToMany(mappedBy = "game", cascade=CascadeType.ALL)
    @Setter @Getter
    private List<Plattform> plattforms;

    @Override
    public Long getId() {
        return id;
    }
}
