# OpenJDK image
FROM openjdk:20

# Set the working directory inside the container
WORKDIR /app

# Copy the built JAR file into the container
COPY Fetch_OA-0.0.1-SNAPSHOT.jar app.jar

# Expose the application port (change if necessary)
EXPOSE 8080

# Command to run the application
CMD ["java", "-jar", "app.jar"]

