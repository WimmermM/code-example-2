DROP DATABASE IF EXISTS AlopexOrientationExam;

CREATE DATABASE AlopexOrientationExam;

USE AlopexOrientationExam;

CREATE TABLE attractions (
    id INT NOT NULL AUTO_INCREMENT,
    attr_name VARCHAR(80),
    city VARCHAR(30),
    category VARCHAR(30),
    price INT,
    longitude FLOAT,
    latitude FLOAT,
    recommended_age FLOAT,
    duration INT,
    PRIMARY KEY (id));

INSERT INTO attractions(attr_name, city, category, price, longitude, latitude, recommended_age, duration)
VALUES ('Svetozor', 'Prague', 'restaurant', 110, 50.0818326, 14.4230702, 3, 60),
       ('Narodni Muzeum', 'Prague', 'museum', 300, 50.0807999, 14.4253662, 3, 120),
       ('Havelska Koruna', 'Prague', 'restaurant', 120, 50.085568,14.4208075, 3, 60),
       ('Frantiskanska zahrada', 'Prague', 'park', 0, 50.0832293, 14.4239375, 3, 30),
       ('Prague Zoo', 'Prague', 'park', 400, 50.1178458, 14.3971201, 3, 180);

CREATE TABLE hibernate_sequence (
    next_val BIGINT(20)
);

INSERT INTO hibernate_sequence VALUES (6);
