FROM maven:3.6.0-jdk-8-alpine
VOLUME /tmp
COPY src /src
COPY pom.xml pom.xml
RUN mvn  clean test install 
EXPOSE 8080
#ENTRYPOINT ["/bin/bash", "init.sh" ]
ENTRYPOINT ["java","-jar","target/Lifo-0.0.1-SNAPSHOT.jar"]
