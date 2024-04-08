FROM openjdk:21-jdk-slim
COPY target/todo-app-backend-0.0.1-SNAPSHOT.jar todo-app-backend-1.0.0.jar
CMD [ "java", "-jar", "todo-app-backend-1.0.0.jar" ]