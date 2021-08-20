create database db_pizzaria_legal ;
use db_pizzaria_legal;

CREATE TABLE tb_categoria (
	id bigint NOT NULL AUTO_INCREMENT,
	categoria varchar(255) NOT NULL,
	PRIMARY KEY (id)
);

CREATE TABLE tb_pizza (
	id bigint NOT NULL AUTO_INCREMENT,
	Sabor varchar(255) NOT NULL,
	Azeitona char(1) NOT NULL,
	Recheio_Extra BOOLEAN NOT NULL,
	Id_Categoria bigint NOT NULL,
	Preço bigint NOT NULL,
    
	PRIMARY KEY (id),
    foreign key (Id_Categoria) references tb_categoria (id)
);

insert into tb_categoria (categoria) value ('Queijo');
insert into tb_categoria (categoria) value ('Sem Queijo');



select * from tb_pizza ;

insert into tb_pizza (Sabor, Azeitona, Recheio_extra, id_categoria, Preço) values ('Frango com Catupiry', 'N', true, '1', 40);
insert into tb_pizza (Sabor, Azeitona, Recheio_extra, id_categoria, Preço) values ('Calabresa com Cebola', 'S', true, '2', 40);
insert into tb_pizza (Sabor, Azeitona, Recheio_extra, id_categoria, Preço) values ('Mussarela', 'N', false, '1', 40);
insert into tb_pizza (Sabor, Azeitona, Recheio_extra, id_categoria, Preço) values ('Portuguesa', 'S', true, '2', 50);
insert into tb_pizza (Sabor, Azeitona, Recheio_extra, id_categoria, Preço) values ('4 Queijos', 'N', false, '1', 50);
insert into tb_pizza (Sabor, Azeitona, Recheio_extra, id_categoria, Preço) values ('Camarão', 'S', true, '2', 70);


select * from tb_pizza where Preço > 45;

select * from tb_pizza where Preço between 29 and 60;

select * from tb_pizza where tb_pizza.Sabor like '%C%';

select * from tb_pizza 
	inner join tb_categoria on tb_categoria.id = tb_pizza.id_categoria;

select * from tb_pizza where id_categoria = 1;



