FROM openjdk:17
EXPOSE 8080
ADD target/jenkinsdeneme.war jenkinsdeneme.war
ENTRYPOINT ["java","-jar","/jenkinsdeneme.war"]