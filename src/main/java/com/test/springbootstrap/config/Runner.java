package com.test.springbootstrap.config;

import com.test.springbootstrap.dao.GameDao;
import com.test.springbootstrap.dao.PlattformDao;
import com.test.springbootstrap.model.Game;
import com.test.springbootstrap.model.Plattform;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Configuration
public class Runner implements CommandLineRunner {

    Logger logger = LoggerFactory.getLogger(Runner.class);

    @Autowired
    private GameDao gameRepo;
    @Autowired
    private PlattformDao plattformRepo;



    @Override
    public void run(String... args) {

        logger.info("create data");
        Game game = new Game();
        game.setPublisher("EA");
        game.setRelase(new Date());
        game.setTitel("Rain Bow Six");
        gameRepo.save(game);
        logger.debug(game.toString());


        Game game2 = new Game();
        game2.setPublisher("Nintendo");
        game2.setRelase(new Date());
        game2.setTitel("The Legend of Zelda: Ocarina of Time");
        gameRepo.save(game2);
        logger.debug(game2.toString());


        Game game3 = new Game();
        game3.setPublisher("CD Projekt");
        game3.setRelase(new Date());
        game3.setTitel("The Witcher");
        gameRepo.save(game3);
        logger.debug(game3.toString());

        Game game4 = new Game();
        game4.setPublisher("Nintendo");
        game4.setRelase(new Date());
        game4.setTitel("Super Mario 64");
        gameRepo.save(game4);
        logger.debug(game4.toString());



        List<Plattform> plattformList = new ArrayList<>();
        plattformList.add(
                new Plattform("Nitendo",60, gameRepo.findByTitel("The Legend of Zelda: Ocarina of Time").get(0))
        );
        plattformList.add(
                new Plattform("Nitendo Switch",250, gameRepo.findByTitel("Super Mario 64").get(0))
        );
        plattformList.add(
                new Plattform("Nitendo ",399,gameRepo.findByTitel("The Legend of Zelda: Ocarina of Time").get(0))
        );
        plattformList.add(
                new Plattform("Playstation 4",450,gameRepo.findByTitel("The Witcher").get(0))
        );
        plattformList.add(
                new Plattform("XBOX One",399,gameRepo.findByTitel("The Witcher").get(0))
        );
        plattformRepo.saveAll(plattformList);



    }
}
