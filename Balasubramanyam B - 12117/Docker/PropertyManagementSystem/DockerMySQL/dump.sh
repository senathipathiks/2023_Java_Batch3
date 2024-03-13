#dump.sh
mysqladmin -uroot -proot create pms
mysql -uroot -proot pms < jsp_backup.sql 
#end of dump.sh