package com.test.springbootstrap.dao;

import com.test.springbootstrap.model.Game;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "video-games", path = "best-games-ever")
public interface GameDao extends PagingAndSortingRepository<Game, Long> {

    List<Game> findByTitel(@Param("titel") String titel);


    @RestResource(path = "titelStartsWith", rel = "titelStartsWith")
    List<Game> findByTitelStartsWith(@Param("titel") String titel);



}
