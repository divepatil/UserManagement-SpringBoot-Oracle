# User Management System (Spring Boot + Oracle SQL)

A full-stack web application for managing user records, built with Java and Oracle Database.

## 🚀 Features
* **User Registration:** Create new user accounts.
* **Login System:** Secure access to the dashboard.
* **Dashboard:** View all registered users in a clean table.
* **CRUD Operations:** Ability to Edit and Delete user records.
* **Oracle Integration:** Automated table creation via Hibernate.

## 🛠️ Tech Stack
* **Backend:** Java 17, Spring Boot, Spring Data JPA
* **Database:** Oracle SQL (ojdbc11)
* **Frontend:** HTML5, CSS3, Thymeleaf
* **Build Tool:** Maven

## 📋 How to Run
1. Clone this repository.
2. Open **Eclipse IDE** and Import as a **Maven Project**.
3. Update `src/main/resources/application.properties` with your Oracle **username** and **password**.
4. Run `UserManagementAppApplication.java` as a **Spring Boot App**.
5. Visit `http://localhost:8080/register` in your browser.
