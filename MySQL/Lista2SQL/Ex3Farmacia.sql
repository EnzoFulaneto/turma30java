create database db_farmacia_do_bem ;
use db_farmacia_do_bem ; 

CREATE TABLE tb_categoria (
	id bigint NOT NULL AUTO_INCREMENT,
	Categorias varchar(255) NOT NULL,
    
	PRIMARY KEY (id)
);

insert into tb_categoria (Categorias) value ('Remedio');
insert into tb_categoria (Categorias) value ('Higiene Pessoal');
insert into tb_categoria (Categorias) value ('Cosmeticos');

select * from tb_categoria;

CREATE TABLE tb_produto (
	id bigint NOT NULL AUTO_INCREMENT,
	Nome varchar(255) NOT NULL,
    Preço bigint NOT NULL,
	Validade date NOT NULL,
	Id_Categoria bigint NOT NULL,
    
	PRIMARY KEY (id),
    foreign key (Id_Categoria) references tb_categoria (id)
);

insert into tb_produto (Nome, Preço, Validade, Id_Categoria) values ('Dorflex', 50, 10/08/2023, 1),
																  ('Desodorante', 20, 05/09/2022, 2),
                                                                  ('Batom', 25, 10/10/2021, 3),
                                                                  ('Sabonete', 7, 29/12/2026, 2),
                                                                  ('Tylenol', 15, 30/08/2022, 1),
                                                                  ('Maquiagem', 30, 22/11/2024, 3);
update tb_produto set Validade = 20231008 where id = 1;
update tb_produto set Validade = 20220905 where id = 2;
update tb_produto set Validade = 20211010 where id = 3;
update tb_produto set Validade = 20261229 where id = 4;
update tb_produto set Validade = 20220830 where id = 5;
update tb_produto set Validade = 20241122 where id = 6;

select * from tb_produto where Preço > 25;

select * from tb_produto where Preço between 3 and 40;

select * from tb_produto where tb_produto.Nome like '%B%';

select tb_produto.Nome, tb_produto.Preço, tb_categoria.Categorias
from tb_produto
inner join tb_categoria on tb_categoria.id = tb_produto.Id_Categoria
where tb_categoria.Categorias = 'Cosmeticos'
