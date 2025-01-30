# Use an official OpenJDK image as the base
FROM openjdk:11

# Set the working directory inside the container
WORKDIR /app

# Install Gradle
RUN apt-get update && apt-get install -y gradle

# Copy the project files
COPY . .

RUN gradle dist --exclude-task test

# Build the project using Gradle
RUN gradle build

