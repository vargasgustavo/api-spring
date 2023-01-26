use empresa

create table produtos(
	codigo int primary key,
	nome varchar(50),
	preco_unitario decimal(5,2),
	quant_estoque int
)

insert into produtos values (1,'Sabonete',5,100)
insert into produtos values (2,'Sabão',3,199)
insert into produtos values (3,'Maionese',6.78,20)
insert into produtos values (4,'Oleo',3.21,500)
insert into produtos values (5,'Pão de Forma',8.56,20)

select * from produtos
