
INSERT INTO 
	cajeros(nomapels)
VALUES
	('ANDRES'),
	('DANIEL'),
	('ALEJANDRO'),
	('LILIANA'),
	('LAURA'),
	('EDGAR'),
	('BEATRIZ'),
	('ELIZABETH'),
	('KARLA'),
	('CESAR');

INSERT INTO maquinas_registradoras
	(piso)
VALUES
	(1),
	(2),
	(3);

INSERT INTO productos(nombre,precio)
VALUES
('TELEVISION',5000),
('CELULAR',1500),
('MINICOMPONENTE',3000),
('VENTILADOR',500),
('REFRIGERADOR',4500),
('ESTUFA',2900),
('LAVADORA',3100);

INSERT INTO venta 
	(cajero,maquina,producto)
VALUES
(1,2,1),
(4,1,1),
(5,2,1),
(6,3,1),
(7,2,2),
(8,1,2),
(9,2,3),
(2,3,4),
(3,3,4),
(4,1,5),
(5,3,6),
(6,3,6),
(7,3,7),
(8,3,3),
(9,2,4),
(10,1,5),
(1,3,4),
(2,1,5),
(3,3,6),
(4,2,3),
(2,1,2),
(5,2,7),
(6,3,1),
(7,3,2),
(8,2,4)
