#dump.sh
mysqladmin -uroot -proot create sms
mysql -uroot -pjsppassword sms < sqlbackup.sql 
#end of dump.sh