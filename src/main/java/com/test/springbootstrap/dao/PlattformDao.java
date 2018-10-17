package com.test.springbootstrap.dao;

import com.test.springbootstrap.model.Plattform;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(path = "plattform")
public interface PlattformDao extends PagingAndSortingRepository<Plattform, Long> {

    List<Plattform> findByName(@Param("name") String name);




}
