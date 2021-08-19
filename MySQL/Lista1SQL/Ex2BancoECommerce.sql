create database db_ecommerce

use db_ecommerce

create table tb_produtos (
	id_produto bigint (9) auto_increment,
    produto varchar (55) not null,
    cor varchar(20) not null,
    preco float (9) not null,
    categoria varchar (55) not null,
    
    primary key (id_produto)
);

insert into tb_produtos (produto, cor, valor, marca, categoria) values ('Tênis', 'Preto', 700, 'Nike', 'Calçados');
insert into tb_produtos (produto, cor, valor, marca, categoria) values ('Camiseta', 'Rosa', 100, 'Adidas', 'Vestuário');
insert into tb_produtos (produto, cor, valor, marca, categoria) values ('Calça de Moletom', 'Azul', 200, 'Hering', 'Vestuário');
insert into tb_produtos (produto, cor, valor, marca, categoria) values ('Chinelo', 'Branco', 70, 'Jordan', 'Calçados');



select * from tb_produtos where valor > 500
select * from tb_produtos where valor < 500

update tb_produtos set cor = 'Amarelo' where id_produto = 2;