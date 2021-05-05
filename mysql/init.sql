CREATE DATABASE desafio2db;

use desafio2db;

CREATE TABLE modulo(id INT NOT NULL AUTO_INCREMENT, nome VARCHAR(255), PRIMARY KEY(id));

INSERT INTO modulo(nome) VALUES ('Docker');
INSERT INTO modulo(nome) VALUES ('RabbitMQ');
INSERT INTO modulo(nome) VALUES ('Autenticação entre os microsserviços');
