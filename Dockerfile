# Use a base image with Java (JDK 21 as per your Jenkins config)
FROM eclipse-temurin:21

# Create app directory
WORKDIR /app

# Copy source code and libraries
COPY src/ src/
COPY lib/ lib/

# Compile Java code
RUN javac -cp "lib/*" -d out src/airlinemanagementsystem/*.java

# Set the main class to run (update if your main class is different)
CMD ["java", "-cp", "out;lib/*", "airlinemanagementsystem.Login"]
