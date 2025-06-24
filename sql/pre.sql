CREATE DATABASE pre;
USE pre;

# 테이블
CREATE TABLE board
(
    id         INT AUTO_INCREMENT NOT NULL,
    title      VARCHAR(255)       NOT NULL,
    content    VARCHAR(255)       NOT NULL,
    author     VARCHAR(255)       NOT NULL,
    created_at datetime           NOT NULL DEFAULT NOW(),
    CONSTRAINT pk_board PRIMARY KEY (id)
);

# 사용자
CREATE TABLE member
(
    id       VARCHAR(255) NOT NULL,
    name     VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL,
    phone    VARCHAR(255) NOT NULL,
    CONSTRAINT pk_member PRIMARY KEY (id)
);

SHOW DATABASES;
