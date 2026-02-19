# 📚 Amazon Top 50 Bestselling Books (2009–2019) – Java Project

This project is built using Java and demonstrates Object-Oriented Programming (OOP), file handling, and data processing using a real-world Kaggle dataset.

The dataset contains information about Amazon's Top 50 bestselling books from 2009 to 2019 (550 records).

---

## 📊 Dataset Information

Each book contains the following attributes:

- **Name** – Title of the book  
- **Author** – Name of the author  
- **User Rating** – Average rating (3.3 to 4.9)  
- **Reviews** – Number of user reviews  
- **Price** – Price of the book ($0 to $105)  
- **Year** – Year appeared on bestseller list  
- **Genre** – Fiction / Non-Fiction  

---

## 🏗️ Project Structure

One_Book_DataBase/
│
├── Book.java
├── DatasetReader.java
├── Driver.java
├── data.csv
└── .gitignore


---

## ⚙️ Technologies Used

- Java
- Object-Oriented Programming (OOP)
- ArrayList
- HashSet
- File Handling (BufferedReader)
- CSV Parsing

---

## 🚀 Features Implemented

✔️ Total number of books by an author  
✔️ List all authors in dataset  
✔️ List all books by a specific author  
✔️ Filter books by user rating  
✔️ Display book prices by author  

---

## 🧠 OOP Concepts Used

- Encapsulation
- Class & Object modeling
- Constructor usage
- Getter methods
- Separation of concerns (Model, Reader, Driver)

---

## ▶️ How to Run

1. Open terminal inside project folder

2. Compile:

javac *.java


3. Run:

java Driver


---

## 📌 Example Output


Total books by George Orwell: 1
Books by George Orwell:
1984 (Signet Classics)
Books with rating 4.7:
...
Books and Prices by George Orwell:
1984 (Signet Classics) - $6



---

## 📈 Future Improvements

- Add sorting (by price, rating, reviews)
- Add menu-driven console interface
- Optimize search using HashMap
- Convert into GUI application
- Convert into Spring Boot REST API

---

## 📚 Dataset Source

Kaggle – Amazon Top 50 Bestselling Books (2009–2019)

---

## 👨‍💻 Author

Shivam Jaiswal  
Low Level Design – Assignment 1

