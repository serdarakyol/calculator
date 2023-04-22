FROM eclipse-temurin:17-jdk-focal

WORKDIR /app

COPY .mvn/ /app/.mvn/
COPY mvnw mvnw.cmd pom.xml /app/
COPY src/ /app/src/
COPY libs/ /app/libs/

# install custom dependency
RUN /app/mvnw install:install-file -Dfile=libs/tracer-1.0.0.jar -DgroupId=io.corp.calculator -DartifactId=tracer -Dversion=1.0.0 -Dpackaging=jar
RUN /app/mvnw dependency:go-offline

CMD ["./mvnw", "spring-boot:run"]
