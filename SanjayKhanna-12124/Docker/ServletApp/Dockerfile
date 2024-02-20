FROM tomcat:10.1.0

COPY JSPCRUDProject1.war /usr/local/tomcat/webapps/app.war

ADD mysql-connector-j-8.3.0.jar  /usr/local/tomcat/webapps/

EXPOSE 8080

CMD ["catalina.sh", "run"]
