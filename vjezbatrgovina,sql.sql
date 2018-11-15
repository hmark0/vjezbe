drop database if exists trgovina;
create database trgovina;
use trgovina;
create table racun(
    id int not null primary key auto_increment,
    redni_broj int not null,
    datum datetime, 
    operater int not null
);
create table operater (
    id int not null primary key  auto_increment,
    ime varchar(50) not null,
    prezime varchar(50) not null,
    no_bolovanju boolean

);
create table stavka (
    racun int not null,
    proizvod int not null,
    kolicina int        
);
create table proizvod (
    id int not null primary key auto_increment,
    naziv varchar(50),
    jedinica_mjere decimal(7,3)
    cijena decimal(8,2)   
);
alter table racun add foreign key (operater) references operater(id); 
alter table stavka add foreign key (racun) references racun(id);
alter table stavka add foreign key (proizvod) references proizvod(id);  

insert into racun(id,redni_broj,datum,operater) values
(null, 1,2018-11-15,null), 
(null, 2,2018-11-15,null), 
(null, 3,2018-11-15,null);
insert into operater(id, ime, prezime, no_bolovanju) values
(null,'Slavko','Slaven', true),
(null,'Slavko','Slavenic', false);
insert into stavka(racun,proizvod,kolicina) values
(null,kruh,1),
(null,mlijeko,12),
(null,med,2),
(null,jogurt,1),
(null,cvijet,3),
(null,pekmez,2),
(null,brasno,1),
(null,lopta,10),
(null,piletina,1),
(null,sok,2);
insert into proizvod(id,naziv,jedinica_mjere,cijena) values
(null,,)