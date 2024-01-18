use final;
desc buildings;
select * from buildings;
select * from classrooms;
select * from buildings inner join classrooms on buildings.BuildingID=classrooms.buildingID;




select * from buildings right join classrooms on buildings.BuildingID=classrooms.buildingID;

select * from faculty;
select * from interns;

select * from faculty cross join interns on faculty.PersonID=interns.PersonID;

create database Relevantz;
use relevantz;
create table employee(ename varchar(15), eid int(8) primary key, emobile int(10), eplace varchar(20));
desc employee;
select * from employee;
create table design(position varchar(20), eid int(8) primary key, skilled varchar(20), LPA int(8));
select * from design;

select * from employee cross join design;

create table curriculum(degree varchar(10), eid int(10) primary key, hobby varchar(20));
select * from curriculum;

select * from employee inner join design on employee.eid = design.eid
 inner join curriculum on employee.eid = curriculum.eid;


select * from design where LPA=(select min(LPA) from design);
select avg(LPA) from design;
select * from design where LPA<(select avg(LPA) from design);
update design set LPA =LPA+LPA*2 where skilled =(select skilled from design where skilled="Cloud");
select * from design;
update   set LPA = LPA * 2 where eid = (select eid from design where skilled = 'Cloud');

