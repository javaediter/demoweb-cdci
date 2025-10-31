FROM openjdk:21-jdk-oracle

RUN adduser demoapp

WORKDIR /home/demoapp

COPY target/*.jar demoapp.jar

ENV JAVA_OPTS="-Xms256m -Xmx512m"

EXPOSE 8081

USER demoapp

ENTRYPOINT ["sh", "-c", "java $JAVA_OPTS -jar demoapp.jar"]
