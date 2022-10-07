FROM openjdk:11
EXPOSE 80

ADD /target/github-cicd-actions-0.0.1-SNAPSHOT.jar devopstest.jar

ENTRYPOINT ["java","-jar","devopstest.jar"]