# Use an official OpenJDK image as the base
FROM openjdk:11

# Set the working directory inside the container
WORKDIR /app

# Install Gradle
RUN apt-get update && apt-get install -y gradle

# Copy the project files
COPY . .

# Build the project using Gradle
RUN gradle build

# Expose port (if your application runs on a specific port, e.g., 8080)
EXPOSE 8080

# Set the entry point to run the Java application
CMD ["java", "-jar", "build/libs/<your-app>.jar"]
