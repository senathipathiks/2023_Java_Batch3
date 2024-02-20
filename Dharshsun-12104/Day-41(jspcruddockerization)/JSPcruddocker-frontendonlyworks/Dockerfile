FROM tomcat:8.0-alpine

COPY JSPCRUD.war /usr/local/tomcat/webapps/webapp.war
# COPY mysql.jar /WEB-INF/lib/mysql.jar
EXPOSE 8080

CMD ["catalina.sh", "run"]