INSERT INTO regiones(id, nombre) VALUES (1, 'Sudamerica');
INSERT INTO regiones(id, nombre) VALUES (2, 'Centroamerica');
INSERT INTO regiones(id, nombre) VALUES (3, 'Norteamerica');
INSERT INTO regiones(id, nombre) VALUES (4, 'Europa');
INSERT INTO regiones(id, nombre) VALUES (5, 'Asia');
INSERT INTO regiones(id, nombre) VALUES (6, 'Africa');
INSERT INTO regiones(id, nombre) VALUES (7, 'Oceania');
INSERT INTO regiones(id, nombre) VALUES (8, 'Antartida');

INSERT INTO cliente (region_id, nombre,apellido,email,create_at) VALUES (2, 'Marco', 'Ramos', 'marco@gmail.com', '2023-01-02');
INSERT INTO cliente (region_id, nombre,apellido,email,create_at) VALUES (8, 'Christopher', 'Lopez', 'chris@gmail.com', '2023-01-03');
INSERT INTO cliente (region_id, nombre,apellido,email,create_at) VALUES (3, 'Carlos', 'Cantu', 'carlos@gmail.com', '2023-01-04');
INSERT INTO cliente (region_id, nombre,apellido,email,create_at) VALUES (2, 'Oziel', 'Herrera', 'osoH@gmail.com', '2023-01-05');
INSERT INTO cliente (region_id, nombre,apellido,email,create_at) VALUES (5, 'Ivan', 'Hernandez', 'ivan22@gmail.com', '2023-01-06');
INSERT INTO cliente (region_id, nombre,apellido,email,create_at) VALUES (3, 'Alexander', 'Rodriguez', 'charun@gmail.com', '2023-01-07');
INSERT INTO cliente (region_id, nombre,apellido,email,create_at) VALUES (1, 'Pedro', 'Garza', 'pedro@gmail.com', '2023-01-08');
INSERT INTO cliente (region_id, nombre,apellido,email,create_at) VALUES (3, 'Lucero', 'Aleman', 'luci@gmail.com', '2023-01-09');
INSERT INTO cliente (region_id, nombre,apellido,email,create_at) VALUES (1, 'Gerardo', 'Trejo', 'gerarcristo@gmail.com', '2023-01-10');
INSERT INTO cliente (region_id, nombre,apellido,email,create_at) VALUES (8, 'Porfirio', 'Rojas', 'pilo@gmail.com', '2023-01-11');
INSERT INTO cliente (region_id, nombre,apellido,email,create_at) VALUES (7, 'Luis', 'Rodriguez', 'luisG@gmail.com', '2023-01-12');
INSERT INTO cliente (region_id, nombre,apellido,email,create_at) VALUES (4, 'Lauro', 'Rodriguez', 'lauroR@gmail.com', '2023-01-13');

INSERT INTO `usuarios` (username, password, enabled, nombre, apellido, email) VALUES ('marco', '$2a$10$jjSene6rCSuBnNQl/89oteUG0IRLI27nccyCszFizjyrJyxHTlZNu', 1, 'Marco', 'Ramos', 'marco@gmail.com');
INSERT INTO `usuarios` (username, password, enabled, nombre, apellido, email) VALUES ('admin', '$2a$10$Ka7uwjTiclqlAB.eazU62u0DKyOzOUqtW2sy5jY.z0MnS99r5a0Za', 1, 'John', 'Doe', 'johndoe@gmail.com');

INSERT INTO `roles` (nombre) VALUES ('ROLE_USER');
INSERT INTO `roles` (nombre) VALUES ('ROLE_ADMIN');

INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES (1, 1);
INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES (2, 2);
INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES (2, 1);

/*Populate tables productos*/
INSERT INTO productos (nombre, precio, create_at) VALUES ('Panasonic Pantalla LCD', 259990, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES ('Sony Camara Digital DSC-W320B', 123490, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES ('Apple Ipod shuffle', 1499990, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES ('Sony Notebook Z110', 37990, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES ('Hewlett Packard Multifuncional F2280', 69990, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES ('Bianchi Bicicleta Aro 26', 69990, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES ('Mica Comoda 5 cajones', 299990, NOW());

 /*Creamos algunas facturas*/
INSERT INTO facturas (descripcion, observacion, cliente_id, create_at) VALUES ('Facturas de equipos de Oficina', null, 1, NOW());
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES (1, 1, 1);
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES (2, 1, 4);
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES (1, 1, 5);
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES (1, 1, 7);

INSERT INTO facturas (descripcion, observacion, cliente_id, create_at) VALUES ('Facturas Bicicleta', 'Alguna nota', 1, NOW());
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES (3, 2, 6);
 

