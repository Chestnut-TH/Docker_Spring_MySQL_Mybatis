CREATE DATABASE IF NOT EXISTS sample;

CREATE TABLE user(
    id INTEGER,
    name varchar(16)
);

INSERT INTO user(id, name) VALUES(1, 'Tarou');