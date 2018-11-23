package com.greenfox.orientation.repository;

import com.greenfox.orientation.model.Attraction;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MyRepository extends CrudRepository<Attraction,Integer> {

    List<Attraction> findAll();


}
