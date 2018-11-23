package com.greenfox.orientation.model;

import java.util.List;

public class ListOfAttractions {

    List<Attractions> list;

    public ListOfAttractions() {
    }

    public ListOfAttractions(List<Attractions> list) {
        this.list = list;
    }

    public List<Attractions> getList() {
        return list;
    }

    public void setList(List<Attractions> list) {
        this.list = list;
    }
}
