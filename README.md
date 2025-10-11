# 🚗 Car Rental API – Spring Boot

![Java](https://img.shields.io/badge/Java-17-blue)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.2-green)
![H2 Database](https://img.shields.io/badge/H2-Database-lightgrey)

---

## 📌 About the Project
This is a **Spring Boot REST API** for managing **clients** and **cars** available for rent.  
It allows creating, reading, updating, and deleting clients and cars, demonstrating a **full CRUD** implementation and a **1 client → N cars** relationship.  
The project uses an **in-memory H2 database** for easy testing and can be easily adapted to MySQL or PostgreSQL.

---

## ⚙️ Features

- **Clients**
  - `GET /clients` – List all clients
  - `GET /clients/{id}` – Retrieve client by ID
  - `POST /clients` – Create a new client
  - `PUT /clients/{id}` – Update an existing client
  - `DELETE /clients/{id}` – Delete a client

- **Cars**
  - `GET /cars` – List all cars
  - `GET /cars/{id}` – Retrieve car by ID
  - `POST /cars` – Create a new car and associate with a client
  - `PUT /cars/{id}` – Update an existing car
  - `DELETE /cars/{id}` – Delete a car

- Relationship: **1 client → N cars**
- H2 in-memory database for quick testing
- Modular structure: `model`, `repository`, `service`, `controller`

---

## 🧩 Project Structure

```text
src/
└─ main/
   └─ java/
      └─ dev.ricardolopestomaz.cadastro_pessoa_springboot/
         ├─ clients/
         │  ├─ model/        # ClientsModel
         │  ├─ repository/   # ClientsRepository
         │  ├─ service/      # ClientsService
         │  └─ controller/   # ClientsController
         └─ cars/
            ├─ model/        # CarsModel
            ├─ repository/   # CarsRepository
            ├─ service/      # CarsService
            └─ controller/   # CarsController
resources/
└─ application.properties   # Spring Boot and H2 configuration
```

## 🚀 How to Run

### Clone the repository:
```bash
git clone https://github.com/ricardolopestomaz/person-registration-springboot.git
cd person-registration-springboot
```
### Build and run the project:
```bash
mvn spring-boot:run
```
## Access the API using Postman, Insomnia, or cURL:
- GET http://localhost:8080/clientes
- GET http://localhost:8080/carros

## Access the H2 console:
- http://localhost:8080/h2-console
- JDBC URL: jdbc:h2:mem:meubanco
- User: sa
- Password: (leave blank)

## 📦 Example JSON Requests
### Create Client
```json
{
  "nome": "Ricardo",
  "sobrenome": "Lopes",
  "email": "ricardo@example.com",
  "dataDeNascimento": "1990-05-15"
}
```

### Create Car and Associate with Client
```json
{
  "modelo": "Civic",
  "marca": "Honda",
  "placa": "ABC-1234",
  "cor": "Black",
  "tipoCombustivel": "Gasoline",
  "quilometragem": 12000,
  "cliente": { "id": 1 }
}
```

### Client JSON Response with Cars
```json
{
  "id": 1,
  "nome": "Ricardo",
  "sobrenome": "Lopes",
  "email": "ricardo@example.com",
  "dataDeNascimento": "1990-05-15",
  "carros": [
    {
      "id": 1,
      "modelo": "Civic",
      "marca": "Honda",
      "placa": "ABC-1234",
      "cor": "Black",
      "tipoCombustivel": "Gasoline",
      "quilometragem": 12000
    }
  ]
}
```
💡 Notes

- Use `POST /carros` to associate a car with an existing client.
- Do not include a list of cars when creating a client; create cars separately and link via the client id.
- H2 is for testing purposes only; replace with MySQL/PostgreSQL for production.

📧 Contact

**Ricardo Lopes Tomaz**  
[ricardolptz42@gmail.com](mailto:ricardolptz42@gmail.com)  
[LinkedIn](https://br.linkedin.com/in/ricardo-lopes-tomaz-19053b297)


