## CRUD App with Spring Boot

This application is built with Spring Boot and allows end user to save notes, technical details so that it can used upon subsequent restarts.

Prerequisites:

- Spring Boot
- Java 11
- Postgres (setup and create user)

## Clone and Configure Project

To install this application, 
    
    $ git clone https://github.com/rkiran3/snippet-postgres

#### Settings
    
Project settings can be found in `src/main/resources/application.properties` 

### To run application

    $ mvn spring-boot:run

## Commands to build and test in Docker

Use the Docker file to create a docker image

    $ docker image rm sandbox-0.0.1:latest

Build image to test.

    $ docker build -t sandbox-0.0.1 .  

    $ docker image prune -fa # to remove all images
## License

MIT License,  see [LICENSE](LICENSE.txt).