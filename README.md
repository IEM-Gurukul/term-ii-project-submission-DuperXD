# 📚 Library Management System

## 📖 Overview

This project is a **console-based Library Management System** developed using **Java and Object-Oriented Programming (OOP)** concepts.
It automates basic library operations such as managing books, registering members, issuing and returning books, and maintaining records efficiently.

---

## ❗ Problem Statement

Many libraries still rely on manual or semi-automated systems, which can lead to inefficiencies such as difficulty in tracking issued books, maintaining member records, and enforcing borrowing limits.
Manual processes are prone to human errors, data inconsistency, and delays.

This project provides a **structured and automated solution** using Java and OOP principles to improve efficiency, accuracy, and maintainability of library operations.

---

## 🚀 Core Features

* Add and manage books
* Register student and faculty members
* Issue books with validation checks
* Return books and update availability
* Enforce borrowing limits based on member type
* Display all books and members
* Menu-driven console interface
* Exception handling for invalid operations

---

## 🧠 OOP Concepts Used

### 🔹 Abstraction

* Implemented using the abstract class `Member`

### 🔹 Inheritance

* `StudentMember` and `FacultyMember` extend `Member`

### 🔹 Polymorphism

* Method overriding of `getBorrowLimit()` for different member types

### 🔹 Encapsulation

* Private data members with controlled access via methods

### 🔹 Exception Handling

* Custom exceptions such as:

  * `BookNotFoundException`
  * `MemberNotFoundException`
  * `BookUnavailableException`

### 🔹 Collections

* `HashMap` for storing books and members
* `ArrayList` for tracking borrowed books

---

## 🏗️ System Architecture

The system follows a **modular layered architecture**:

### 1. Model Layer

* `Book`
* `Member` (abstract)
* `StudentMember`
* `FacultyMember`

### 2. Service Layer

* `LibraryService`
  Handles all business logic (add, issue, return, display)

### 3. Exception Layer

* Custom exception classes for error handling

### 4. Main Layer

* `LibraryApp`
  Provides menu-driven user interaction

---

## ▶️ How to Run

### 🔹 Step 1: Clone the Repository

```bash
git clone https://github.com/IEM-Gurukul/term-ii-project-submission-DuperXD.git
cd term-ii-project-submission-DuperXD
```

### 🔹 Step 2: Compile

```bash
cd src
javac librarymanagement\main\LibraryApp.java
```

### 🔹 Step 3: Run

```bash
java librarymanagement.main.LibraryApp
```

---

## 📌 Future Enhancements

* File-based data persistence
* Database integration (MySQL)
* Graphical User Interface (GUI)
* Book search functionality
* Fine calculation system

---

## 👨‍💻 Author

**Rohil Kumar De**
Roll No: 85
Course: Advanced Programming (OOPS)
