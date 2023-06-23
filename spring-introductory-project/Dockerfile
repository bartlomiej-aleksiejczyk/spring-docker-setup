
FROM openjdk:17-alpine
WORKDIR /app/spring-introductory-project

#Debug
COPY . /app/spring-introductory-project
#EndDebug

#COPY mvnw pom.xml /app/spring-introductory-project/

RUN /app/spring-introductory-project/mvnw dependency:go-offline
 
#COPY src /app/spring-introductory-project/src

#Debug
#COPY target /app/spring-introductory-project/target
#RUN echo $(ls -a /app/spring-introductory-project/)
#EndDebug
CMD ["/app/spring-introductory-project/mvnw", "spring-boot:run"]