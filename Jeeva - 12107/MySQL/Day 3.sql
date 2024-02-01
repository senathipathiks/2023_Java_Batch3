use db;
select * from product;
insert into product(product_id, product_name) value(111, "straw" ), (112, "Tissue" ), (113, "Cups");
delete from product where product_id >=111;
 
 alter table product alter price set default 0;
 
  alter table transaction alter amount set default 0;
 use db;
 create table transaction(trans_id int primary key auto_increment,payee varchar(25) default "Unknown", amount decimal(5,2) default 0);
 
alter table transaction auto_increment = 9643;
 

 insert into transaction( payee) values( "nandhini");
 
 select * from transaction;
  alter table transaction add payee varchar(25);
 delete from transaction;
 
 drop table transaction;
 
 
 create table customer(customer_id int primary key auto_increment, first_name varchar(25), last_name varchar(25));
 
 select * from customer;
 
 insert into customer(first_name, last_name) values("Ragnar", "Lothbrok"), ("SamaraSimha" , "Reddy"), ("Blast" , "Mohan");
 
 drop table transaction;
 
 create table transaction(trans_id int primary key auto_increment, amount decimal(5,2), customer_id int, foreign key(customer_id) references customer(customer_id));
 desc transaction;

insert into transaction(amount, customer_id) values(8.9, 1);
select * from transaction;