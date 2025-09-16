# Use an OpenJDK image
FROM eclipse-temurin:17-jdk-alpine

# Set work directory
WORKDIR /app

# Copy project files
COPY . .

# Build the project
RUN ./mvnw clean package -DskipTests

# Expose port
EXPOSE 8080

# Run the jar
CMD ["java", "-jar", "target/sayhello-api-0.0.1-SNAPSHOT.jar"]