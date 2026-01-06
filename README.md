🚗 ParkFlow
Microservices-Based Smart Parking Management System

Built a backend-focused Parking Lot Management System using microservices architecture, emphasizing real-world workflows, fault tolerance, and role-based access control.

✨ Why ParkFlow?

Modern parking systems demand:

Scalability
High availability
Clean domain separation
Graceful failure handling

ParkFlow solves these challenges by modeling parking as a distributed microservice ecosystem.

🧩 Problem Statement

Design and implement a parking system that can:

✅ Dynamically allocate parking slots
✅ Generate and manage parking tickets
✅ Calculate parking charges at exit
✅ Handle service failures without breaking user flow
✅ Secure admin and user operations

🏗️ Architecture Overview

ParkFlow follows a microservices architecture with single-responsibility services and fault-tolerant communication.

Each service is:

Independently deployable
Loosely coupled
Designed around real-world parking domains

| Service             | Responsibility                            |
| ------------------- | ----------------------------------------- |
| **User Service**    | Vehicle entry & exit APIs                 |
| **Parking Service** | Central orchestration & ticket generation |
| **Slot Service**    | Parking slot allocation & release         |
| **Pricing Service** | Parking fee calculation                   |
| **Admin Service**   | Admin-only privileged operations          |
| **Eureka Server**   | Service discovery                         |

📷 High-Level Architecture Diagram



⚙️ Tech Stack

☕ Java 17 🌱 Spring Boot 🔐 Spring Security ♻️ Resilience4j (Circuit Breaker) 
🧭 Eureka Service Discovery 🌐 REST APIs 🧰 Maven 🧑‍💻 Git & GitHub

🧠 Key Design Decisions

✅ REST-based communication for clarity and simplicity
✅ No JWT / DB auth to avoid over-engineering
✅Circuit breakers only where user experience matters
✅Pricing calculated at exit to mimic real parking flow
✅Focus was on architecture clarity, not feature bloat.

♻️ Fault Tolerance & Resilience

To ensure smooth user experience even during failures:

Implemented Circuit Breaker pattern using Resilience4j

Added fallback responses for critical services

🔌 Slot Service Fallback

💰 Pricing Service Fallback

🔐 Security Implementation

Role-based authorization (USER / ADMIN)

In-memory authentication for simplicity

Separate security configurations for user and admin services

👤 User Authentication

🛡️ Admin Authorization

⚔️ Challenges & Solutions
Challenge	Solution
Service failure	Circuit breaker with fallback
Over-engineering risk	Scoped features intentionally
Securing APIs	Role-based access control
🚀 Future Enhancements

🔑 JWT-based authentication
🗄️ Database persistence (MySQL)
🚪 API Gateway
⚙️ Centralized configuration server
📊 Admin dashboard UI

📸 Screenshots
🧠 Complete Architecture Diagram
🧭 Eureka Dashboard
📬 API Responses (Postman)
🚗 User Entry
🚪 User Exit
⭐ Admin Special Entry
🔥 Circuit Breaker in Action

▶️ How to Run Locally

1.Start Eureka Server
2.Start all microservices
3.Test APIs using Postman
