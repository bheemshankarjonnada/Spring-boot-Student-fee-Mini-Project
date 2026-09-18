# Spring Boot Student Fee Project

## 📌 Overview
This is a mini Spring Boot project that demonstrates:
- REST API development
- Layered architecture (Model, Repository, Service, Controller)
- Dependency Injection
- Payment processing using multiple strategies (Card 💳, UPI 📱)

## ⚙️ Tech Stack
- Java
- Spring Boot
- Maven
- REST API

## 🚀 How to Run
1. Clone the repository:
   ```bash
   git clone https://github.com/bheemshankarjonnada/Spring-boot-Student-fee-Mini-Project.git
2.Navigate into the project folder :
cd Spring-boot-Student-fee-Mini-Project

3.cd Spring-boot-Student-fee-Mini-Project
mvn spring-boot:run

🌐 Example API Call
GET http://localhost:8080/fees?name=Bheem&age=20&amount=1000&method=cardPayment

Response:
Student Bheem (Age: 21) saved successfully! | Bheem paid ₹1000.0 using UPIPayment 📱

