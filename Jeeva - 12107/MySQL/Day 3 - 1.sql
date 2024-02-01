create database DB;
use  DB;
create table employee(empid int(8),
	first_name varchar(25), last_name varchar(25), hourly_pay decimal(5,2));
insert into employee() values(12121, "Surya", "Boobalan", 75.75),
								(12120, "Kiruba", "karan", 75.75), 
                                (12122, "Prasanth", "Baskaran", 75.75),
                                (12123, "Prem", "Kumar", 75.75),
                                (12124, "Vignesh", "Velusamy", 75.75),
                                (12125, "Jothi", "Lingam", 75.75),
                                (12126, "Sanajy", "Khanna", 75.75),
                                (12127, "Abishek", "Balasubrmani", 75.75);

drop table employee;
select first_name from employee where empid = 12121;

insert into employee() values(12119, "Dharsun" , "Kumar", 89.9);
select * from employee;

update employee set hourly_pay = 89 where empid = 12121;

set autocommit = off;

commit;

drop table employee;
select * from employee;
rollback;


create table timesheet(dateod date, timeod time, datetimeod datetime);

insert into timesheet values(current_date(), current_time(), current_timestamp());

select * from timesheet;

create table product(
product_id int(8),
product_name varchar(25),
price decimal(4,2)
);

select * from product;

alter table product add constraint unique(product_name);

select * from product;

insert into product values(100, "Ham Burger", 3.99), (101, "fries", 1.89), (102, "soda", 1.00), (103, "ice cream", 1.49);

insert into product values(100, "Chicken Burger",5.99);

alter table product modify price decimal(4,2) not null;

insert into product values(105, "cookie", 4.55);