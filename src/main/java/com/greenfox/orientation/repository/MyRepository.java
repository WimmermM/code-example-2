package com.greenfox.orientation.repository;

import com.greenfox.orientation.model.Attractions;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MyRepository extends CrudRepository<Attractions,Integer> {

    List<Attractions> findAll();


}
