FROM openjdk:17

WORKDIR /app

# Copy source code and libraries
COPY src/ src/
COPY lib/ lib/

# Compile all Java files with all jars in classpath
RUN mkdir out && javac -cp "lib/*" -d out src/airlinemanagementsystem/*.java

# Run the application
CMD ["java", "-cp", "out:lib/*", "airlinemanagementsystem.Login"]
