create database db_escola

use db_escola

create table tb_estudantes (
	id_estudante bigint (9) auto_increment,
    nome varchar (55) not null,
    sala varchar (3) not null,
    nota int (9) not null,
    serie varchar (2) not null,
    
    primary key (id_estudante)
);

ALTER TABLE tb_estudantes drop sala, add column sala varchar (5)

insert into tb_estudantes (nome, sala, nota, serie) values ('Pedro', 'D-21', 6, '2º');
insert into tb_estudantes (nome, sala, nota, serie) values ('Sara', 'D-05', 9, '1º');
insert into tb_estudantes (nome, sala, nota, serie) values ('Charles', 'D-08', 4, '3º');
insert into tb_estudantes (nome, sala, nota, serie) values ('José', 'D-11', 10, '1º');

select * from tb_estudantes where nota > 7
select * from tb_estudantes where nota < 7

update tb_estudantes set nota = 2 where id_estudante = 1;