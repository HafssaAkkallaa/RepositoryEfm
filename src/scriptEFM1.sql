create database if not exists DBEFM1;
use DBEFM1;

create table Rue
(
  code_rue int primary key auto_increment,
  nom_rue varchar(50)
);

create table Immeuble
(
  num_immeuble int primary key auto_increment,
  nb_etage_total int,
  code_rue int,
  FOREIGN KEY (code_rue) REFERENCES Rue(code_rue)
);
create table Etage
(
  num_etage int primary key auto_increment,
  nb_appartement_tot int,
  num_immeuble int,
  FOREIGN KEY (num_immeuble) REFERENCES Immeuble(num_immeuble)
);
create table Appartement
(
  lettre_appartement varchar(50) primary key ,
  nb_pieces_total int,
  num_etage int,
  FOREIGN KEY (num_etage) REFERENCES Etage(num_etage)
);

insert into Rue values ( 1,"retaha");
insert into Rue values ( 2,"hmama");
insert into Rue values ( 3,"hawmaTanjawa" );
insert into Rue values ( 4,"wilaya" );

insert into Immeuble values ( 1, 8,1);
insert into Immeuble values ( 2, 7,2);
insert into Immeuble values ( 3, 1,3);
insert into Immeuble values ( 4, 5,4);

insert into Etage values ( 1,3,2);
insert into Etage values ( 2,2,1);
insert into Etage values ( 3,4,3);
insert into Etage values ( 4,1,4);

insert into Appartement values( "2",6,1);
insert into Appartement values( "1",7,4);
insert into Appartement values( "3",2,3);
insert into Appartement values( "4",4,2);
