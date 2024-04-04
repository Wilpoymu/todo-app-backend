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
### User (Usuario):
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
- `createdAt`: Fecha en que se creó la tarea.
- `dueDate`: Fecha de vencimiento de la tarea (opcional).
- `status`: Estado de la tarea (por ejemplo, "pendiente", "en progreso", "completada").
- `priority`: Prioridad de la tarea (opcional).
- `project`: Proyecto al que pertenece la tarea.
- `assignedTo`: Usuario al que se le ha asignado la tarea.
- `tags`: Conjunto de etiquetas asociadas a la tarea.
- `comments`: Conjunto de comentarios asociados a la tarea.
- Otros campos opcionales como `updatedAt`, `completedAt`, etc.

### Project (Proyecto):
- `id`: Identificador único del proyecto.
- `name`: Nombre del proyecto.
- `description`: Descripción del proyecto.
- `startDate`: Fecha de inicio del proyecto.
- `endDate`: Fecha de finalización del proyecto (opcional).
- `users`: Conjunto de usuarios asociados al proyecto.
- `tasks`: Conjunto de tareas asociadas al proyecto.
- Otros campos opcionales como `createdAt`, `updatedAt`, etc.

### Tag (Etiqueta):
- `id`: Identificador único de la etiqueta.
- `name`: Nombre de la etiqueta.
- `color`: Color asociado con la etiqueta (opcional).
- `tasks`: Conjunto de tareas asociadas a la etiqueta.
- Otros campos opcionales como `description`, `createdAt`, etc.

### Comment (Comentario):
- `id`: Identificador único del comentario.
- `content`: Contenido del comentario.
- `createdAt`: Fecha en que se creó el comentario.
- `task`: Tarea a la que está asociado el comentario.
- Otros campos opcionales como `updatedAt`, `modifiedBy`, etc.



