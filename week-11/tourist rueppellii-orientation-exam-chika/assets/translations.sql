DROP DATABASE IF EXISTS another_orientation_exam;

CREATE DATABASE another_orientation_exam;

USE another_orientation_exam;

CREATE TABLE words (
    id INT NOT NULL AUTO_INCREMENT,
    hungarian VARCHAR(100),
    czech VARCHAR(100),
    count INT,
    PRIMARY KEY (id));

INSERT INTO words(hungarian, czech, count)
VALUES ("korte", "hruska", 0),
       ("gep", "stroj", 0),
       ("fagylalt", "zmrzlina", 0),
       ("haz", "dum", 0),
       ("magyar", "madarsky", 0),
       ("cseh", "cesky", 0),
       ("szep", "hezky", 0),
       ("hetvege", "vikend", 0);

CREATE TABLE hibernate_sequence (
    next_val BIGINT(20)
);

INSERT INTO hibernate_sequence VALUES (9);
