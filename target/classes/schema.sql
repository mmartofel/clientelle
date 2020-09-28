drop sequence if exists hibernate_sequence;
create sequence hibernate_sequence start with 1 increment by 1;

    create table delikwent (
       id integer not null,
        imie varchar(30),
        nazwisko varchar(100),
        pesel varchar(11),
        rating varchar(20),
        fotka varchar(20),
        primary key (id)
    );