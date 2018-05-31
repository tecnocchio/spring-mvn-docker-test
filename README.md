## Argos test

The aim of the test is to complete a project to expose the data in the NumbersDAO over a web service. There are 3 parts of the project which need to be completed, the implementation, some build configuration and some deployment configuration. You should make a fork of this project and supply us with a link to a repository containing commits which complete all 3 parts.

### Part 1. - Implementation
Once implemented, you should be able to perform a GET request on `/numbers` with a query param of `name` in order to get the number for the given name.

e.g. a `GET` to `http://localhost:8080/numbers?name=bob` would return `123456`.

The behaviour for any other request is undefined.

It is expected that you will add new classes but you shouldn't have to change the DAOs.

### Part 2. - Building
You can build the project using the [mvn](https://maven.apache.org/) build tool by running `mvnw install`

There are some integration tests already provided in the `src/integrationTests/java` directory which, once the functionality is implemented, should pass.

The mvn configuration file (pom.xml) needs to be extended such that these tests are executed as part of the mvn build process.

### Part 3. - Deploying
spring-boot provides an embedded container which can be started by simply running the built jar (e.g. `java -jar target/spring-test-0.0.1-SNAPSHOT.jar` )

This application will be deployed in docker. Please write a Dockerfile which can be used to build an image for this application. Once written, it should be possible to execute the following to find bob's number:

```
docker build . -t spring-test-app
docker run -d -p8080:8080 --name spring-test-app spring-test-app 
#wait for a few seonds for the service to start
curl http://localhost:8080/numbers?name=bob
docker rm -f spring-test-app
```

Note that if this is run on windows using docker-toolbox, it won't be served on localhost. (Use `docker-machine ip` to find what it is or see [the docker-machine docs](https://docs.docker.com/machine/get-started/#run-containers-and-experiment-with-machine-commands) for more info)
