FROM amazoncorretto:21-alpine
VOLUME /tmp
ARG JAR_FILE=target/product-api-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT [ "java","-jar","/app.jar" ]