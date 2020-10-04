FROM java:8

VOLUME /tmp

COPY springboot.jar springboot.jar

RUN bash -c "touch /springboot.jar"

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "springboot.jar" ]