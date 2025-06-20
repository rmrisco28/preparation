CREATE DATABASE pre;
USE pre;

CREATE TABLE board
(
    id         INT AUTO_INCREMENT NOT NULL,
    title      VARCHAR(255)       NOT NULL ,
    content    VARCHAR(255)       NOT NULL ,
    author     VARCHAR(255)       NOT NULL ,
    created_at datetime           NOT NULL DEFAULT NOW(),
    CONSTRAINT pk_board PRIMARY KEY (id)
);