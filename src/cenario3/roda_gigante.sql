CREATE TABLE Pessoa (
    id_pessoa INT PRIMARY KEY,
    nome VARCHAR(20),
    idade INT
);

INSERT INTO Pessoa (id_pessoa, nome, idade) VALUES
(1, 'Paulo', 42),
(2, 'João', 5),
(3, 'Maria', 12),
(4, 'Pedro', 13),
(5, 'Henrique', 10);

CREATE TABLE Gondola (
    id_gondola INT PRIMARY KEY,
    lugar_1 VARCHAR(20),
    lugar_2 VARCHAR(20)
);

INSERT INTO Gondola (id_gondola) VALUES
(1), (2), (3), (4), (5), (6), (7), (8), (9), (10), (11), (12), (13), (14), (15), (16), (17), (18);

UPDATE Gondola SET lugar_1 = 'João', lugar_2 = 'Paulo' WHERE id_gondola = 2;
UPDATE Gondola SET lugar_1 = 'Maria' WHERE id_gondola = 3;
UPDATE Gondola SET lugar_1 = 'Pedro' WHERE id_gondola = 13;