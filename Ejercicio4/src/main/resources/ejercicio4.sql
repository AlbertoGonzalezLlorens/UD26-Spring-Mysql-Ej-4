drop database if exists ejercicio4;
create database ejercicio4;
use ejercicio4;

drop table if exists facultad;
create table facultad(
codigo int auto_increment primary key,
nombre nvarchar(100)
);

insert into facultad(nombre) value ('facultad 1');
insert into facultad(nombre) value ('facultad 2');
insert into facultad(nombre) value ('facultad 3');

drop table if exists investigadores;
create table investigadores(
dni varchar(8) primary key,
nomapels nvarchar(255),
facultad int,
foreign key (facultad) references facultad(codigo) on delete set null on update cascade
);

insert into investigadores(dni,nomapels,facultad) value ('1111111A','Investigador 1',1);
insert into investigadores(dni,nomapels,facultad) value ('1111111B','Investigador 2',2);
insert into investigadores(dni,nomapels,facultad) value ('1111111C','Investigador 3',3);

drop table if exists equipos;
create table equipos(
numserie char(4) primary key,
nombre nvarchar(100),
facultad int,
foreign key (facultad) references facultad(codigo) on delete set null on update cascade
);

insert into equipos(numserie,nombre,facultad) value ('AAA1','Equipo1',1);
insert into equipos(numserie,nombre,facultad) value ('AAA2','Equipo2',2);
insert into equipos(numserie,nombre,facultad) value ('AAA3','Equipo3',3);

drop table if exists reserva;
create table reserva(
id int auto_increment primary key,
dni varchar(8),
numserie char(4),
comienzo date,
fin date,
foreign key (dni) references investigadores(dni) on delete cascade on update cascade,
foreign key (numserie) references equipos(numserie) on delete cascade on update cascade
);

insert into reserva(dni,numserie,comienzo,fin) value ('1111111A','AAA1','2022-01-01','2022-02-02');
insert into reserva(dni,numserie,comienzo,fin) value ('1111111B','AAA2','2022-02-02','2022-03-03');
insert into reserva(dni,numserie,comienzo,fin) value ('1111111C','AAA3','2022-03-03','2022-04-04');