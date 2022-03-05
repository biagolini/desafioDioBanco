INSERT INTO TIPO_CONTA (description) VALUES
('Poupança'),
('Conta Corrente');

INSERT INTO AGENCIA (nome) VALUES
('Centro'),
('Zona Norte'),
('Zona Sul'),
('Zona Leste'),
('Zona Oeste');

INSERT INTO CLIENTE (nome, agencia_id) VALUES
('Joao Silva',1),
('Maria Oliveira',2),
('Nicolau Almeida',2),
('Zidane Martins',3);

INSERT INTO CONTA (id_Tipo_Conta, saldo, cliente_id,is_active) VALUES
(1,0,1,true),
(2,100,1,true),
(1,52.5,2,true),
(1,0,2,true),
(2,1000000,3,true);