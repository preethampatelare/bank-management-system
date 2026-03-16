# Bank Management System (Spring Boot)

A backend banking system built using **Java, Spring Boot, JPA, and MySQL**.

## Features
- Customer Management
- Bank Account Creation
- Deposit Money
- Withdraw Money
- Transaction History

## Tech Stack
- Java
- Spring Boot
- Spring Data JPA
- MySQL
- Maven
- REST APIs

## API Endpoints

### Customer APIs
POST /customers  
GET /customers  
GET /customers/{id}  
DELETE /customers/{id}

### Account APIs
POST /accounts  
GET /accounts/{id}

### Transaction APIs
POST /accounts/{id}/deposit?amount=1000  
POST /accounts/{id}/withdraw?amount=500

## Run the Project

```bash
mvn spring-boot:run

Server runs on:

http://localhost:8080