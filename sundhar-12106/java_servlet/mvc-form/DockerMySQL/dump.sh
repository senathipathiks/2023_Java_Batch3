#dump.sh
mysqladmin -uroot -proot create jsptutorial
mysql -uroot -proot jsptutorial < db.sql
#end of dump.sh