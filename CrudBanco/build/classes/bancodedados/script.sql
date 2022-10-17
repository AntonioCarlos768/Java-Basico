CREATE TABLE sala (
    numero INT PRIMARY KEY,
    bloco INT NOT NULL,
    descricao VARCHAR(50)
);

CREATE TABLE responsavel
(
    siape INT PRIMARY KEY,
    nome VARCHAR(50) NOT NULL,
    departamento VARCHAR(20) NOT NULL,
    cpf CHAR(14),
    funcao VARCHAR(20)
);

CREATE TABLE patrimonio
(
    numero INT PRIMARY KEY,
    descricao VARCHAR(100) NOT NULL,
    valor DOUBLE,
    dataaquisicao DATE NOT NULL,
    datadesfaz DATE,
    numsala int,
    siaperesp int,
    FOREIGN KEY (numsala) REFERENCES sala(numero),
    FOREIGN KEY (siaperesp) REFERENCES responsavel(siape)
);


INSERT INTO sala 
      VALUES (1,1,"Laboratorio de Informática");

SELECT * FROM sala;