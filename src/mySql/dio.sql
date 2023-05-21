CREATE TABLE pessoas (
    id NOT NULL PRIMARY KEY AUTOINCREMENT,
    nome VARCHAR(30) NOT NULL,
    nascimento DATE 
)
INSERT INTO pessoas (nome, nascimento) VALUES ('Vitor ','1999-03-26')
INSERT INTO pessoas (nome, nascimento) VALUES ('Tulio ','1998-09-12')
INSERT INTO pessoas (nome, nascimento) VALUES ('Suzy ','1996-12-22')