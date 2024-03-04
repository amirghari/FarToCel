FROM maven:latest
WORKDIR FarToCel
COPY pom.xml //
COPY . /FarToCel/
RUN mvn package
#CMD ["java", "-jar", "target/dockerdemo.jar"]
ENTRYPOINT ["java", "-jar", "target/interconversions.jar"]