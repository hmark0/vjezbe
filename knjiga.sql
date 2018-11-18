drop database if exists knjiga;
create database knjiga;
use knjiga;
create table mk(
    id 	int not null primary key auto_increment,
    osoba int
);
create table korisnik(
    id 	int not null primary key auto_increment,
    user varchar(50),
    pass varchar(50),
    mk int
);
create table osoba(
  id 	int not null primary key auto_increment,
  ime varchar(50),
  prezime varchar(50),
  dob datetime,
  vjera varchar(50),
  ozenjen boolean,
  oib char(11),
  JMBG char(13)
);
create table obrazac(
    id  int not null primary key auto_increment,
    ime varchar(50),
    prezime varchar(50),
    oib char(11),
    osoba int
);
create table popunio(
    korisnik int,
    obrazac int,
    popunio boolean
);
alter table mk add foreign key (osoba) references osoba(id); 
alter table korisnik add foreign key (mk) references mk(id); 
alter table obrazac add foreign key (osoba) references osoba(id); 
alter table popunio add foreign key (korisnik) references korisnik(id);
alter table popunio add foreign key (obrazac) references obrazac(id);
