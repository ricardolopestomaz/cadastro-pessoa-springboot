# Person Registration API

![Status](https://img.shields.io/badge/status-in%20progress-yellow)

A Spring Boot project implementing a **REST API** for registering, updating, retrieving, and deleting people.

---

## 📌 About the Project

This project provides a simple RESTful API for managing people records.  
It demonstrates CRUD operations (Create, Read, Update, Delete) using **Spring Boot**, **Spring Data JPA**, and an in-memory H2 database.  
The project is intended as a **portfolio piece** and learning resource for building backend APIs in Java.

---

## ⚙️ Features

- REST endpoints for managing people:
  - `GET /people` – List all people
  - `GET /people/{id}` – Retrieve a person by ID
  - `POST /people` – Add a new person
  - `PUT /people/{id}` – Update a person
  - `DELETE /people/{id}` – Delete a person
- Data validation and error handling.
- Integration with H2 in-memory database for easy testing.
- Uses Spring Data JPA for repository operations.
- Easy to extend for real databases like MySQL or PostgreSQL.

---

## 🧩 Project Structure

- `model/` – Entity classes representing database tables.
- `repository/` – Interfaces for database operations using Spring Data JPA.
- `service/` – Business logic and validations.
- `controller/` – REST API endpoints.
- `resources/application.properties` – Spring Boot configuration.
- `pom.xml` – Maven dependencies and project setup.

---

## 🚀 How to Run

1. Clone the repository:
    ```bash
    git clone https://github.com/ricardolopestomaz/person-registration-springboot.git
    cd person-registration-springboot
    ```
2. Build and run the project:
    ```bash
    mvn spring-boot:run
    ```
3. Access the API using Postman, cURL, or any HTTP client:
    ```
    GET http://localhost:8080/people
    ```

---

## 📧 Contact

Ricardo Lopes Tomaz
📧 ricardolptz42@gmail.com  
[LinkedIn](https://www.linkedin.com/in/ricardo-lopes-tomaz-19053b297?originalSubdomain=br)
