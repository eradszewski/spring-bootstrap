package com.test.springbootstrap.config;

import com.test.springbootstrap.dao.GameDao;
import com.test.springbootstrap.dao.PlattformDao;
import com.test.springbootstrap.model.Game;
import com.test.springbootstrap.model.Plattform;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
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

        logger.info("Create Data");
        Game game = new Game();
        game.setPublisher("EA");
        game.setRelase(new Date());
        game.setTitel("Rain Bow Six");
        gameRepo.save(game);
        logger.debug(game.toString());


        Game game2 = new Game();
        game2.setPublisher("Riot");
        game2.setRelase(new Date());
        game2.setTitel("Leage of Leagends");
        gameRepo.save(game2);
        logger.debug(game2.toString());

        List<Plattform> plattformList = new ArrayList<>();
        plattformList.add(
                new Plattform("Nitendo Switch",250, gameRepo.findByTitel("Rain Bow Six").get(0))
        );
        plattformList.add(
                new Plattform("XBOX One",399,gameRepo.findByTitel("Leage of Leagends").get(0))
        );
        plattformList.add(
                new Plattform("Playstation 4",450,gameRepo.findByTitel("Leage of Leagends").get(0))
        );

        plattformRepo.saveAll(plattformList);



    }
}
