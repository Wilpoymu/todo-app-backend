# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.2.4/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.2.4/maven-plugin/reference/html/#build-image)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/3.2.4/reference/htmlsingle/index.html#data.sql.jpa-and-spring-data)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/3.2.4/reference/htmlsingle/index.html#using.devtools)
* [Docker Compose Support](https://docs.spring.io/spring-boot/docs/3.2.4/reference/htmlsingle/index.html#features.docker-compose)
* [Spring Security](https://docs.spring.io/spring-boot/docs/3.2.4/reference/htmlsingle/index.html#web.security)
* [Spring Web](https://docs.spring.io/spring-boot/docs/3.2.4/reference/htmlsingle/index.html#web)

### Guides
The following guides illustrate how to use some features concretely:

* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
* [Securing a Web Application](https://spring.io/guides/gs/securing-web/)
* [Spring Boot and OAuth2](https://spring.io/guides/tutorials/spring-boot-oauth2/)
* [Authenticating a User with LDAP](https://spring.io/guides/gs/authenticating-ldap/)
* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)

### Docker Compose support
This project contains a Docker Compose file named `compose.yaml`.
In this file, the following services have been defined:

* postgres: [`postgres:latest`](https://hub.docker.com/_/postgres)

Please review the tags of the used images and set them to the same as you're running in production.

File Structure:
```
src
└── main
    ├── java
    │   └── com
    │       └── yourcompany
    │           └── yourapplication
    │               ├── controller
    │               │   ├── UserController.java
    │               │   ├── TaskController.java
    │               │   ├── ProjectController.java
    │               │   ├── TagController.java
    │               │   └── CommentController.java
    │               ├── model
    │               │   ├── User.java
    │               │   ├── Task.java
    │               │   ├── Project.java
    │               │   ├── Tag.java
    │               │   └── Comment.java
    │               ├── repository
    │               │   ├── UserRepository.java
    │               │   ├── TaskRepository.java
    │               │   ├── ProjectRepository.java
    │               │   ├── TagRepository.java
    │               │   └── CommentRepository.java
    │               └── YourApplicationApplication.java
    └── resources
        └── application.properties
```

### Application Properties
```properties
### User:
- `id`: Unique identifier of the user.
- `name`: User's name.
- `email`: User's email address.
- `password`: User's password (preferably stored securely, e.g., hashed).
- Other optional fields such as `createdAt`, `lastLogin`, etc.

### Task:
- `id`: Unique identifier of the task.
- `name`: Name of the task.
- `description`: Description of the task.
- `createdAt`: Date when the task was created.
- `dueDate`: Due date of the task (optional).
- `status`: Status of the task (e.g., "pending", "in progress", "completed").
- `priority`: Priority of the task (optional).
- Other optional fields such as `updatedAt`, `completedAt`, etc.

### Project:
- `id`: Unique identifier of the project.
- `name`: Name of the project.
- `description`: Description of the project.
- `startDate`: Start date of the project.
- `endDate`: End date of the project (optional).
- Other optional fields such as `createdAt`, `updatedAt`, etc.

### Tag:
- `id`: Unique identifier of the tag.
- `name`: Name of the tag.
- `color`: Color associated with the tag (optional).
- Other optional fields such as `description`, `createdAt`, etc.

### Comment:
- `id`: Unique identifier of the comment.
- `content`: Content of the comment.
- `createdAt`: Date when the comment was created.
- `user`: Reference to the user who created the comment.
- `task`: Reference to the task to which the comment is associated.
- Other optional fields such as `updatedAt`, `modifiedBy`, etc.



