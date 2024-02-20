FROM tomcat:8.0-alpine

COPY src/main/webapp /usr/local/tomcat/webapps/webapp.war

EXPOSE 8080

CMD ["catalina.sh", "run"]