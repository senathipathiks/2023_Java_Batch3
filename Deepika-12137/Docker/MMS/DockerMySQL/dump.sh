#dump.sh
mysqladmin -uroot -pjsppassword create mms
mysql -uroot -pjsppassword mms < mms.sql 
#end of dump.sh