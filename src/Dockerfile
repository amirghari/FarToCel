FROM maven:latest
WORKDIR FarToCel
COPY pom.xml /FarToCel/
COPY . /FarToCel/
RUN mvn package
#CMD ["java", "-jar", "target/dockerdemo.jar"]
ENTRYPOINT ["java", "-jar", "target/interconversions.jar"]