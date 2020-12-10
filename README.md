# calculator

This application was created with Java 11, Spring Boot and Angular

## Development

Before you can build this project, you must install and configure the following dependencies on your machine:

1. [Node.js]

After installing Node, you should be able to run the following command to install development tools.
You will only need to run this command when dependencies change in [package.json](package.json).

    npm install

I use npm scripts and [Webpack][] as build system.

Run the following command from src/main/webapp to start project.

    npm start

2. To Start the server use the following command:

    mvn spring-boot:run

## Testing

To launch your application's tests, run:

    ./mvnw verify
