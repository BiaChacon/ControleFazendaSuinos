
CREATE TABLE IF NOT EXISTS BAIA (
  id INTEGER NOT NULL AUTO_INCREMENT PRIMARY KEY,
  Tamanho DOUBLE NOT NULL,
  Limpeza BOOLEAN,
);

CREATE TABLE IF NOT EXISTS SUINO (
    id INTEGER NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(50) NOT NULL, 
    DataNascimento DATE NOT NULL, 
    DataAquisicao DATE NOT NULL,
);

CREATE TABLE IF NOT EXISTS PORCOBAIA (
  idPorco INTEGER NOT NULL,
  idBaia INTEGER NOT NULL,
  PRIMARY KEY(idPorco, idBaia),
);

ALTER TABLE PORCOBAIA ADD CONSTRAINT IF NOT EXISTS fk_Porco FOREIGN KEY (idPorco) REFERENCES SUINO(id) ON DELETE CASCADE ON UPDATE CASCADE;

ALTER TABLE PORCOBAIA ADD CONSTRAINT IF NOT EXISTS fk_Baia FOREIGN KEY (idBaia) REFERENCES BAIA(id) ON DELETE CASCADE ON UPDATE CASCADE;