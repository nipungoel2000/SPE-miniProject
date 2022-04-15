FROM openjdk:8
COPY ./target/calc-devOps-1.0-SNAPSHOT.jar ./
WORKDIR ./
CMD ["java","-jar","calc-devOps-1.0-SNAPSHOT.jar"]