# Student Management System

## 📌 Project Overview

The Student Management System is a console-based Java application developed to practice Core Java concepts and object-oriented programming. It allows users to manage student records through a menu-driven interface.

This project helped me understand how to work with classes and objects, collections, loops, conditional statements, and CRUD operations in Java.

## ✨ Features

- **Add Student:** Enter student ID, name, department, and marks.
- **View Students:** Display student records.
- **Search by ID:** Find a student using their unique ID.
- **Search by Name:** Search for a student by name.
- **Update Student:** Modify existing student details.
- **Delete Student:** Remove a student record using the student ID.
- **Menu-Driven Interface:** Perform operations through a console menu.

## 🛠️ Technologies Used

- Java
- Java Collections Framework
- ArrayList
- Iterator
- Scanner
- IntelliJ IDEA

## 📚 Core Java Concepts Practiced

- Classes and Objects
- Constructors
- Encapsulation
- Getters and Setters
- `toString()` method
- ArrayList and Collections
- Enhanced `for` loop
- Iterators
- Conditional statements and switch
- Loops
- CRUD operations

## 📂 Project Structure

```text
StudentManagementSystem/
├── src/
│   └── com/
│       └── studentmanagement/
│           ├── Student.java
│           ├── StudentService.java
│           └── Main.java
└── README.md
```

- `com/studentmanagement/Student.java`: Defines the student data and provides methods to access and modify student details.
- `StudentService.java`: Contains the student management logic.
- `com/studentmanagement/Main.java`: Provides the menu-driven interface and handles user input.

*Note: The service-layer refactoring is a work in progress, so the current implementation may still contain some management logic in `com/studentmanagement/Main.java`.*

## ▶️ How to Run the Project

1. Install the Java Development Kit (JDK 17 or a compatible version).
2. Clone or download this repository.
3. Open the project in IntelliJ IDEA or another Java IDE.
4. Run the `com/studentmanagement/Main.java` file.
5. Follow the instructions displayed in the console.

## 🚀 Future Improvements

- Complete separation of business logic using the service layer.
- Add input validation and exception handling.
- Prevent duplicate student IDs.
- Store student records in a database using JDBC.
- Integrate PostgreSQL for persistent storage.
- Develop a graphical user interface.

## 🎯 Learning Objective

The main objective of this project is to strengthen Core Java fundamentals and build a foundation for developing larger Java applications using object-oriented programming and clean code practices.

## 👨‍💻 Author

Developed as a Core Java practice project.
