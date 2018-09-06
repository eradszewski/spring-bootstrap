package com.test.springbootstrap.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.hateoas.Identifiable;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Plattform implements Identifiable<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Setter
    private Long id;

    @Getter @Setter
    private String name;

    @Getter @Setter
    private int preis;

    @ManyToOne
    @Setter @Getter
    private Game game;

    @Override
    public Long getId() {
        return id;
    }


    public Plattform(String name, int preis, Game game) {
        this.name = name;
        this.preis = preis;
        this.game = game;
    }
}
