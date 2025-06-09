# LAB11 - Spring Boot Security Form Login Example

This project demonstrates a simple user registration and login system using Spring Boot, Spring Security, Thymeleaf, and H2 in-memory database. It supports user registration, login, role-based access control, and displays a user dashboard.

## Features

- User registration with validation
- Secure password storage (BCrypt)
- Login with email and password
- Role-based access (USER, ADMIN)
- Thymeleaf templates for UI
- H2 in-memory database with sample data
- Spring Security integration

## How to Run

1. **Clone the repository** (if not already):
   ```
   git clone <repo-url>
   cd LAB11
   ```

2. **Build and run the application**:
   - Using Maven Wrapper:
     ```
     ./mvnw spring-boot:run
     ```
   - Or with Maven installed:
     ```
     mvn spring-boot:run
     ```

3. **Access the application**:
   - Open your browser and go to: [http://localhost:8080/login](http://localhost:8080/login)

4. **Sample Users** (from `data.sql`):
   - **admin@gmail.com** / password (ADMIN)
   - **test@gmail.com** / password (USER)
   - **abc@gmail.com** / password (USER)
   - **def@gmail.com** / password (USER, ADMIN)

5. **H2 Console** (for development/debugging):
   - [http://localhost:8080/h2-console](http://localhost:8080/h2-console)
   - JDBC URL: `jdbc:h2:mem:testdb`
   - User: `sa`
   - Password: *(leave blank)*

## Notes

- Registration assigns the `ROLE_USER` by default.
- You can register new users or login with the sample accounts.
- The project uses Spring Boot 3.x and Java 17.

---
