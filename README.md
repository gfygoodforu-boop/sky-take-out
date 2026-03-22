# 🍔 Sky Take-Out System

A full-stack online food ordering system built with **Spring Boot + Vue**, featuring **Redis caching**, **WebSocket real-time updates**, and **JWT-based authentication**.

---

## 📸 Preview

> Screenshots can be added here

- User ordering interface
- Admin management dashboard

---

## 🚀 Features

### 👤 User Side
- Browse dishes and categories
- Add items to shopping cart
- Place orders
- Simulated online payment
- View and manage order history

### 🛠 Admin Side
- Manage dishes and categories
- Manage orders (accept, reject, dispatch)
- Manage employees
- View business statistics dashboard

### ⚡ System Features
- Redis caching for performance optimization
- WebSocket for real-time order notifications
- JWT-based authentication and authorization
- RESTful API design
- Layered architecture (Controller / Service / Mapper)

---

## 🏗 Tech Stack

### Backend
- Java 11
- Spring Boot
- MyBatis
- MySQL
- Redis
- WebSocket
- JWT

### Frontend
- Vue.js *(frontend project not included in this repository)*
- Element UI

### Other
- Maven
- Git & GitHub

---

## 📂 Project Structure

```text
sky-take-out
├── sky-common     # Common utilities and constants
├── sky-pojo       # Entity classes and DTO/VO objects
├── sky-server     # Core business logic and backend services
├── sql
│   └── sky.sql    # Database initialization script
├── README.md
└── pom.xml
