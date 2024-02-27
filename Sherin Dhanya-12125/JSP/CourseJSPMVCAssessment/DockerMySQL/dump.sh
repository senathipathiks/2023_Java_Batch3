#dump.sh
mysqladmin -uroot -pjsppassword create jspmvc
mysql -uroot -pjsppassword jspmvc < jsp_backup.sql 
#end of dump.sh