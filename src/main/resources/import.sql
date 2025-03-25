-- This file allow to write SQL commands that will be emitted in test and dev.
-- The commands are commented as their support depends of the database
-- insert into myentity (id, field) values(1, 'field-1');
-- insert into myentity (id, field) values(2, 'field-2');
-- insert into myentity (id, field) values(3, 'field-3');
-- alter sequence myentity_seq restart with 4;

insert into estado (nome, sigla, regiao) values('Acre', 'AC', 2);
insert into estado (nome, sigla, regiao) values('Alagoas', 'AL', 3);
insert into estado (nome, sigla, regiao) values('Amapá', 'AP', 2);
insert into estado (nome, sigla, regiao) values('Amazonas', 'AM', 2);
insert into estado (nome, sigla, regiao) values('Bahia', 'BA', 3);
insert into estado (nome, sigla, regiao) values('Ceará', 'CE', 3);
insert into estado (nome, sigla, regiao) values('Tocantins', 'TO', 2);

insert into municipio (nome, id_estado) values('Palmas', 2);
insert into municipio (nome, id_estado) values('Araguaina', 2);
insert into municipio (nome, id_estado) values('Gurupi', 2);
insert into municipio (nome, id_estado) values('São Paulo', 4);

/*alterar configuração no postgree para que não seja mais case sensitive*/