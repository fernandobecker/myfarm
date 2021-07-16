# myfarm

# Spring Boot, Postgres, JPA, Rest API Tutorial

Build Restful CRUD API for a simple farm application using Spring Boot, Postgres and JPA.

## Requirements

1. Java - 1.8.x

2. Maven - 3.x.x

## Setup

**1. Clone the application**

```bash
git clone git@github.com:fernandobecker/myfarm.git
```

**2. Build Docker**

```bash
docker-compose up
```

**3. Build and run the app using maven**

```bash
mvn spring-boot:run
```

The app will start running at <http://localhost:8080>.

## Explore Rest APIs SWagger

http://localhost:8080/swagger

The app defines following CRUD APIs.

    GET /animals/all
    
    GET /animals/{id}

You can test them using postman or any other rest client.
