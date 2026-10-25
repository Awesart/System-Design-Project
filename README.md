# D&D API + Auth - Scalable System-Design-Project
The project is meant to be a learning opportunity in system design and scalability in backend systems with a Spring 
BOOT REST API and eventual implementation of AWS, message queues and background worker support.

## Description
Project represents how to scale up a basic CRUD API with barebones Frontend. The main focus being on a backend design
that is scalable and uses production level/enterprise level design. The data that is being worked with in this project
is a basic Dungeons and Dragons Character Manager. 

## Getting Started

### Dependencies
- Spring Dependency Management - Ver. 1.17
- Spring Framework Boot - Ver. 4.1.1
- Java 17
- PostGre SQL Driver
- Docker Compose
- Gradle Build System\

### How to Build and Run

#### Build and Run with IDE 
- Use IntelliJ IDE and build with the dev file that is configurable in src/main/java/resources/application-dev.properties
- Before building make sure Docker Desktop is working and on. 

#### Build and Run in Terminal
- To do a basic build and run, use the line below.
```Shell
    $ ./gradlew bootRun
```

- Otherwise to build with a specified profile.
```Shell
    $ ./gradlew bootRun --args='--spring.profiles.active=dev'
```

## Authors
Ahmed Al-Saedy

## Version History
* 0.0.1 - SNAPSHOT
    * Initial Release