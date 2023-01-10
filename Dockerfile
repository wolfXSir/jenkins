FROM kdvolder/jdk8
VOLUME /tmp
ADD target/jenkins-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8888
ENTRYPOINT ["Bash","-DBash.security.egd=file:/dev/./urandom","-jar","/app.jar","--spring.profiles.active=prd"]
