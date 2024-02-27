create database assessment;
use assessment;
show tables;
desc student;
desc course;
desc teacher;
desc department;
desc enrollement;
ALTER TABLE `assessment`.`student` 
CHANGE COLUMN `stuid` `stuid` VARCHAR(10) NOT NULL ;

ALTER TABLE enrollment ADD CONSTRAINT FOREIGN KEY(sid) REFERENCES student(stuid);
ALTER TABLE course ADD CONSTRAINT FOREIGN KEY(teaid) REFERENCES teacher(teaid);
ALTER TABLE enrollment ADD CONSTRAINT FOREIGN KEY(courseid) REFERENCES course(courseid);
ALTER TABLE student ADD CONSTRAINT FOREIGN KEY(deptid) REFERENCES department(deptid);
ALTER TABLE teacher ADD CONSTRAINT FOREIGN KEY(deptid) REFERENCES department(deptid);
drop table course;
use assessment;
insert into course values('1901','SQL','full time','offline',01);


