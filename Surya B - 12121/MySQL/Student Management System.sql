create database student_ms;
use student_ms;
create table student(stud_id int primary key auto_increment, stuname varchar(25), studob date, stuaddress varchar(80), stumail varchar(30), stuphone int);
desc student;

create table course(courseid int primary key auto_increment, coursename varchar(25), coursetype varchar(30), coursemode varchar(20));
desc course;

create table teacher(teaid int primary key auto_increment, teaname varchar(25), teage int(3), teaexp date, teaphone int, teaemail varchar(30));
desc teacher;

create table department(deptid int primary key auto_increment, deptname varchar(25), address varchar(80));
desc department;

create table enrollment(enrollid int primary key auto_increment);

alter table student add  deptid int;
alter table student add constraint foreign key(deptid) references department(deptid);
desc student;

alter table course add teaid int;
alter table course add constraint foreign key(teaid) references teacher(teaid);

alter table teacher add deptid int;
alter table teacher add constraint foreign key(deptid) references department(deptid);

alter table enrollment add courseid int;
alter table enrollment add coursename varchar(25);
alter table enrollment add stuid int;
desc enrollment;
alter table enrollment drop column coursename;

alter table enrollment add constraint foreign key(courseid) references course(courseid);
alter table enrollment add constraint student_fk_3 foreign key(coursename) references course(coursename);
alter table enrollment add constraint student_fk_2 foreign key(stuid) references student(stud_id);