package com.greenfox.orientation.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Attraction {

    @Id
    @GeneratedValue
    Integer id;
    String atractionName;
    String city;
    String category;
    Integer price;
    Float longitude;
    Float latitude;
    Float recommendedAge;
    Integer duration;

    public Attraction() {
    }

    public Attraction(String atractionName, String city, String category, Integer price, Float longitude, Float latitude, Float recommendedAge, Integer duration) {
        this.atractionName = atractionName;
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

    public String getAtractionName() {
        return atractionName;
    }

    public void setAtractionName(String atractionName) {
        this.atractionName = atractionName;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getRecommendedAge() {
        return recommendedAge;
    }

    public void setRecommendedAge(float recommendedAge) {
        this.recommendedAge = recommendedAge;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
