package com.greenfox.orientation.repository;

import com.greenfox.orientation.model.Attractions;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MyRepository extends CrudRepository<Attractions, Integer> {

    List<Attractions> findAll();

    Attractions findAllById(Integer id);

    @Query(value = "SELECT distinct * FROM attractions group by category order by  price LIMIT 3", nativeQuery = true)
    List<Attractions> myORderedlist();


}
