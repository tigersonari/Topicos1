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


INSERT INTO Manga (id, titulo, volume, autor, editora) VALUES (901,'Shingeki no Kyojin', 1, 'Hajime Isayama', 'Kodansha');
INSERT INTO Manga (id, titulo, volume, autor, editora) VALUES (902,'Shingeki no Kyojin', 2, 'Hajime Isayama', 'Kodansha');
INSERT INTO Manga (id, titulo, volume, autor, editora) VALUES (903,'Naruto Shippuden', 1, 'Masashi Kishimoto', 'Shueisha');
INSERT INTO Manga (id, titulo, volume, autor, editora) VALUES (904,'Naruto Shippuden', 2, 'Masashi Kishimoto', 'Shueisha');
INSERT INTO Manga (id, titulo, volume, autor, editora) VALUES (905,'Sakamoto Days', 1, 'Yuto Suzuki', 'Shueisha');
INSERT INTO Manga (id, titulo, volume, autor, editora) VALUES (906,'Sakamoto Days', 2, 'Yuto Suzuki', 'Shueisha');
INSERT INTO Manga (id, titulo, volume, autor, editora) VALUES (907,'Akane Banashi', 1, 'Yuki Suenaga', 'Shueisha');
INSERT INTO Manga (id, titulo, volume, autor, editora) VALUES (908,'Akane Banashi', 2, 'Yuki Suenaga', 'Shueisha');
INSERT INTO Manga (id, titulo, volume, autor, editora) VALUES (909,'Jujutsu Kaisen', 1, 'Gege Akutami', 'Shueisha');
INSERT INTO Manga (id, titulo, volume, autor, editora) VALUES (910,'Jujutsu Kaisen', 2, 'Gege Akutami', 'Shueisha');