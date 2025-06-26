# Project Theater Spring with Swagger API

Scripts SQL

```sh
CREATE DATABASE IF NOT EXISTS teatro_db
  DEFAULT CHARACTER SET utf8mb4
  DEFAULT COLLATE utf8mb4_general_ci;
```

```sh
USE teatro_db;

CREATE TABLE IF NOT EXISTS diretor_teatral (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL
);


CREATE TABLE IF NOT EXISTSa peca_teatral (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    titulo VARCHAR(150),
    ano_estreia INT,
    diretor_id BIGINT,
    FOREIGN KEY (diretor_id) REFERENCES diretor_teatral(id)
);
```
