FROM openjdk:8
COPY ./CalculatorDevops-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java","-jar","CalculatorDevops-1.0-SNAPSHOT-jar-with-dependencies.jar"]