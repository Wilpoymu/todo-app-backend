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
    │               │   ├── AppUserController.java
    │               │   ├── TaskController.java
    │               │   └── ProjectController.java
    │               ├── model
    │               │   ├── AppUser.java
    │               │   ├── Task.java
    │               │   └── Project.java
    │               ├── repository
    │               │   ├── AppUserRepository.java
    │               │   ├── TaskRepository.java
    │               │   └── ProjectRepository.java
    │               ├── services
    │               │   ├── AppUserService.java
    │               │   ├── AppUserServiceImplement.java
    │               │   ├── ProjectService.java
    │               │   ├── ProjectServiceImplement.java
    │               │   ├── TaskService.java
    │               │   └── TaskServiceImplement.java
    │               └── YourApplicationApplication.java
    └── resources
        └── application.properties
```

## Application Properties
### AppUser (Usuario):
- `id`: Identificador único del usuario.
- `name`: Nombre del usuario.
- `email`: Dirección de correo electrónico del usuario.
- `projects`: Conjunto de proyectos a los que pertenece el usuario.
- `tasks`: Conjunto de tareas asignadas al usuario.
- Otros campos opcionales como `createdAt`, etc.

### Task (Tarea):
- `id`: Identificador único de la tarea.
- `name`: Nombre de la tarea.
- `description`: Descripción de la tarea.
- `project`: Proyecto al que pertenece la tarea.

### Project (Proyecto):
- `id`: Identificador único del proyecto.
- `name`: Nombre del proyecto.
- `description`: Descripción del proyecto.
- `tasks`: Conjunto de tareas asociadas al proyecto.
- Otros campos opcionales como `createdAt`, `updatedAt`, etc.
