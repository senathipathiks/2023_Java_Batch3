create database Ordertrack;
use Ordertrack;
create table product(productid varchar(10) primary key not null, productname varchar(1), price int(10), inventorystock int(4));
desc product;

create table purchase(purchaseid varchar(10) primary key not null, purchasename varchar(15) unique, supplierid varchar(10), productquantity varchar(5), purchasedate date);
desc purchase;

create table supplier(supplierid varchar(10) primary key, suppliername varchar(15));
desc supplier;

create table productorder(orderid varchar(10) primary key, productid varchar(10), purchasedate date);
desc productorder;

select * from product;
insert into product values(2, "MI Trimmer", 2790, 78);


select * from product where price like 'T%';


use sakila;

select * from actor where actor_id between 1 and 45;

use sakila;

select * from address;

select max(address_id) from address;

select sum(address_id) from address;

select * from payment;

select * from payment order by customer_id desc;



select sum(amount) from payment where amount>2;
select avg(amount) from payment where amount>2;
select * from address;

select district, count(*) from address group by district having district="England";

select * from payment;

update payment set amount=6.99 where staff_id=2;

update payement set amount=20.00 , payment_id=2

update payment set amount=amount+amount*0.3 where staff_id=2;

delete from payment where payment_id=2;
use ordertrack;

select * from product;

create table stock(quantity int(200), productname varchar(20), productprice int(200));
desc table stock;

alter table stock auto_increment=1;

CREATE TABLE Persons (
    Personid int NOT NULL AUTO_INCREMENT,
    LastName varchar(255) NOT NULL,
    FirstName varchar(255),
    Age int,
    PRIMARY KEY (Personid)
);

select * from persons;
use world;

select * from countrylanguage;

use sakila;
select * from payment;

create view employeepayment as select staff_id, payment_id, amount from payment where amount>4;

select * from employeepayment;

drop view employeepayment;




