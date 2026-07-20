# OAuth2 Authentication Server

A secure OAuth2 Authentication Server built using Spring Boot and Spring Security OAuth2. This project demonstrates user authentication, authorization, JWT token generation, and protected REST APIs.

# 🚀 Features
- User Registration
- User Login
- OAuth2 Authentication
- JWT Token Generation
- Role-Based Authorization
- Protected REST APIs
- MySQL Database Integration
- Spring Security Configuration
- REST API Testing using Postman

# 🛠 Technologies Used
- Java 21
- Spring Boot 3
- Spring Security
- Spring Authorization Server (OAuth2)
- JWT (JSON Web Token)
- Maven
- MySQL
- JPA (Hibernate)
- Lombok
- Postman
- IntelliJ IDEA / VS Code

# 📥 Software Required

Install the following software before running the project.

- Software	                 Version
- JDK	                         21
- MySQL Server	              8.x
- Maven                     	3.9+
- Git	                       Latest
- IntelliJ IDEA / VS Code  	 Latest
- Postman	                   Latest

# 📦 Clone Repository
git clone https://github.com/Ankita-meshram/Oauth2-server.git
cd Oauth2-server

# ⚙️ Configure Database

Create a MySQL database.

CREATE DATABASE oauth2_db;

Update application.properties

spring.datasource.url=jdbc:mysql://localhost:3306/oauth2_db
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

# Run the Project
Using Maven
mvn clean install
mvn spring-boot:run

OR

./mvnw spring-boot:run
Using IntelliJ IDEA
Open the project.
Wait for Maven dependencies to download.
Run the main Spring Boot application class.
Server starts on:
http://localhost:8080

## Project Structure

```
src
├── main
│   ├── java
│   │   └── com.ankita.oauth
│   │       ├── config
│   │       ├── controller
│   │       ├── dto
│   │       ├── entity
│   │       ├── repository
│   │       ├── security
│   │       └── service
│   │
│   └── resources
│       ├── static
│       │   └── css
│       ├── templates
│       │   ├── login.html
│       │   ├── register.html
│       │   └── dashboard.html
│       └── application.properties
```
# 🔑 API Testing

Use Postman to test the APIs.

Example Endpoints

POST /register
POST /login
GET /profile
GET /users

Protected APIs require a valid JWT Access Token.

# 📌 Maven Commands

Clean Project

mvn clean

Compile Project

mvn compile

Run Tests

mvn test

Package Project

mvn package

Run Application

mvn spring-boot:run

# 📥 Git Commands

Clone Repository

git clone https://github.com/Ankita-meshram/Oauth2-server.git

Check Status

git status

Add Files

git add .

Commit Changes

git commit -m "Initial Commit"

Push Code

git push origin main

Pull Latest Changes

git pull origin main

# 👩‍💻 Author

Ankita Meshram

GitHub: https://github.com/Ankita-meshram

# ⭐ Future Improvements
- Refresh Token
- Google Login
- GitHub Login
- Email Verification
- Password Reset
- Docker Support
- Swagger Documentation
- Role Management
- Token Revocation

# 📄 License

This project is developed for educational and learning purposes.
