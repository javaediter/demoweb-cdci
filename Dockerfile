FROM openjdk:21-jdk-oracle

RUN adduser demoapp

USER demoapp

WORKDIR /home/demoapp

COPY target/*.jar demoapp.jar

RUN echo '#! /bin/bash \njava -Xms512m -Xmx1024m -jar demoapp.jar' >> entrypoint.sh && chmod +x entrypoint.sh

EXPOSE 8081

ENTRYPOINT ["/home/demoapp/entrypoint.sh"]
