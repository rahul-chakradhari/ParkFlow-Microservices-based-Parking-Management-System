🚗 ParkFlow
Microservices-Based Smart Parking Management System

Built a backend-focused Parking Lot Management System using microservices architecture, emphasizing real-world workflows, fault tolerance, and role-based access control.

✨ Why ParkFlow?

Modern parking systems demand:

Scalability<br>
High availability<br>
Clean domain separation<br>
Graceful failure handling<br>

ParkFlow solves these challenges by modeling parking as a distributed microservice ecosystem.

🧩 Problem Statement

Design and implement a parking system that can:<>

✅ Dynamically allocate parking slots<br>
✅ Generate and manage parking tickets<br>
✅ Calculate parking charges at exit<br>
✅ Handle service failures without breaking user flow<br>
✅ Secure admin and user operations<br>

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

📷 High-Level Architecture Diagram<br><br>
<img width="1263" height="797" alt="architecture" src="https://github.com/user-attachments/assets/a04f98af-e7a9-46a5-ba88-219908fbede0" />

⚙️ Tech Stack

☕ Java 17 🌱 Spring Boot 🔐 Spring Security ♻️ Resilience4j (Circuit Breaker) 
🧭 Eureka Service Discovery 🌐 REST APIs 🧰 Maven 🧑‍💻 Git & GitHub

🧠 Key Design Decisions

✅ REST-based communication for clarity and simplicity<br>
✅ No JWT / DB auth to avoid over-engineering<br>
✅Circuit breakers only where user experience matters<br>
✅Pricing calculated at exit to mimic real parking flow<br>
✅Focus was on architecture clarity, not feature bloat.<br>

♻️ Fault Tolerance & Resilience

To ensure smooth user experience even during failures:

Implemented Circuit Breaker pattern using Resilience4j

Added fallback responses for critical services

🔌 Slot Service Fallback<br><br>
<img src="https://github.com/user-attachments/assets/5bfd7841-91cf-47ab-9c8a-d1cd0a749e1d" />

💰 Pricing Service Fallback<br><br>
<img src="https://github.com/user-attachments/assets/0d1c7482-15ac-4218-9c5f-58f1bc1d8845" />

🔐 Security Implementation

Role-based authorization (USER / ADMIN)
In-memory authentication for simplicity
Separate security configurations for user and admin services

👤 User Authentication<br><br>
<img src="https://github.com/user-attachments/assets/3e2b1f27-03e8-4e60-80c0-6e33048bc9b9" />

🛡️ Admin Authorization<br><br>
<img src="https://github.com/user-attachments/assets/41c57d44-144f-41a5-9868-6e0512e237f5" />

⚔️ Challenges & Solutions<br>
| Challenge             | Solution                      |
| --------------------- | ----------------------------- |
| Service failure       | Circuit breaker with fallback |
| Over-engineering risk | Scoped features intentionally |
| Securing APIs         | Role-based access control     |

🚀 Future Enhancements<br>
🔑 JWT-based authentication<br>
🗄️ Database persistence (MySQL)<br>
🚪 API Gateway<br>
⚙️ Centralized configuration server<br>
📊 Admin dashboard UI<br>

📸 Screenshots<br>
🧠 Complete Architecture Diagram<br><br>
<img width="9135" height="8230" alt="full diagram" src="https://github.com/user-attachments/assets/aa8528a7-76bb-436e-ae97-902a57cb8add" />

🧭 Eureka Dashboard<br><br>
<img width="1920" height="1080" alt="eureka dashboard" src="https://github.com/user-attachments/assets/f912a820-a09b-4c09-b33b-6015631d4d27" />

📬 API Responses (Postman)<br>
🚗 User Entry<br><br>
<img src="https://github.com/user-attachments/assets/5c872509-f27e-4cbb-9a21-c9e9b0965de6" />

🚪 User Exit<br><br>
<img src="https://github.com/user-attachments/assets/0c277908-3c1b-4b48-b297-b4ff0b9f1afb" />

⭐ Admin Special Entry<br<br>>
<img src="https://github.com/user-attachments/assets/9a1dd4b3-4d17-4461-89a0-4bd5936011f0" />

🔥 Circuit Breaker in Action<br><br>
<img src="https://github.com/user-attachments/assets/e5ab5faa-2192-4347-a90d-4bf995284446" />

▶️ How to Run Locally

1.Start Eureka Server<br>
2.Start all microservices<br>
3.Test APIs using Postman

👨‍💻 Author

Rahul Chakradhari
Java Backend Developer | Microservices | Spring Boot

📍 Location:Bengaluru , Karnataka 
📞 Phone: +91 83058 25263
📧 Email: rahulchakradhari10september@gmail.com
🔗 LinkedIn: [https://www.linkedin.com/in/rahulchakradhari](https://www.linkedin.com/in/rahul-chakradhari-17a437217/)
💻 GitHub: [https://github.com/](https://github.com/rahul-chakradhari)


⭐ If you found this project useful
Feel free to ⭐ star the repository or reach out for collaboration, feedback, or opportunities.
