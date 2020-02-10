insert into  usuarios (id, apellido, email, enabled, nombre, password, username) values (1,"Garcia", "foxone4@gmail.com", true, "Christian","Heinsohn_88", "foxone");
insert into  usuarios(id, apellido, email, enabled, nombre, password, username) values (2,"Castro", "locos@gmail.com", true, "Julian","Garza.", "stonexx");
insert into  usuarios(id, apellido, email, enabled, nombre, password, username) values (3,"Uchiha", "pipones@gmail.com", true, "Carlos","Carlos.", "Carlinhos");
insert into  usuarios(id, apellido, email, enabled, nombre, password, username) values (4,"Santander", "loaliza@gmail.com", true, "Juan","Rata.", "Pepeluchas");

insert into role (id, nombre)  values(1, "ROLE_USER");
insert into role (id, nombre)  values(2, "ROLE_ADMIN");


insert into usuariox_role (id_usuario, id_role)  values(1, 1);
insert into usuariox_role (id_usuario, id_role)  values(2, 1);
insert into usuariox_role (id_usuario, id_role)  values(3, 1);
insert into usuariox_role (id_usuario, id_role)  values(4, 1);
insert into usuariox_role (id_usuario, id_role)  values(1, 2);