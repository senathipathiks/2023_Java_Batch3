#dump.sh
mysqladmin -uroot -psam@6383587926 create jsp
mysql -uroot -psam@6383587926 jsp < jsp_backup.sql 
#end of dump.sh