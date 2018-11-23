package com.greenfox.orientation.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Attractions {

    @Id
    @GeneratedValue
    Integer id;
    String attrName;
    String city;
    String category;
    Integer price;
    Float longitude;
    Float latitude;
    Float recommendedAge;
    Integer duration;

    public Attractions() {
    }

    public Attractions(String attrName, String city, String category, Integer price, Float longitude, Float latitude, Float recommendedAge, Integer duration) {
        this.attrName = attrName;
        this.city = city;
        this.category = category;
        this.price = price;
        this.longitude = longitude;
        this.latitude = latitude;
        this.recommendedAge = recommendedAge;
        this.duration = duration;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAttrName() {
        return attrName;
    }

    public void setAtractionName(String attrName) {
        this.attrName = attrName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Float getLongitude() {
        return longitude;
    }

    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }

    public Float getLatitude() {
        return latitude;
    }

    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }

    public Float getRecommendedAge() {
        return recommendedAge;
    }

    public void setRecommendedAge(Float recommendedAge) {
        this.recommendedAge = recommendedAge;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }
}
