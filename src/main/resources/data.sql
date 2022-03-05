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
('Joao',1),
('Mariae',2),
('Nicolau',2),
('Zidane',3);

INSERT INTO CONTA (id_Tipo_Conta, saldo, cliente_id) VALUES
(1,0,1),
(2,100,1),
(1,52.5,2),
(2,1000000,3);