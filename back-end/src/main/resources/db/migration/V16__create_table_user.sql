CREATE TABLE tb_user (
id UUID PRIMARY KEY,
username varchar(50) UNIQUE,
password varchar(50),
email varchar(255) UNIQUE
);