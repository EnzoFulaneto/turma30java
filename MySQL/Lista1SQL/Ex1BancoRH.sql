create database db_rh

use db_rh

create table tb_funcionarios (
	id_funcionario bigint (9) auto_increment,
    nome varchar (55) not null,
    genero char(1) not null,
    salario float (9) not null,
    cargo varchar (55) not null,
    
    primary key (id_funcionario)
);

insert into tb_funcionarios (nome, genero, salario, cargo) values ('João', 'M' , 1500 , 'Limpeza');
insert into tb_funcionarios (nome, genero, salario, cargo) values ('Marcos', 'M' , 2600, 'Sub-Gerente');
insert into tb_funcionarios (nome, genero, salario, cargo) values ('Carla', 'F', 2100, 'Atendente');
insert into tb_funcionarios (nome, genero, salario, cargo) values ('Pedro', 'M', 6000, 'Gerente Internacional');

select * from tb_funcionarios where salario > 2000
select * from tb_funcionarios where salario < 2000
    