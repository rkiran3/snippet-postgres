# Start with a base image
FROM adoptopenjdk:11-jre-hotspot

# Set variable to use later
ARG JAR_FILE=*.jar

# Copy the built application to container
COPY target/sandbox-0.0.1-SNAPSHOT.jar application.jar

# Command to start application
ENTRYPOINT ["java", "-jar", "application.jar"]
