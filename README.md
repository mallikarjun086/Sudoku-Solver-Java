# 🧩 Sudoku Solver (Java)

### Prodigy Infotech Internship — Task 04

---

## 📌 Project Overview

The **Sudoku Solver** is a console-based Java application developed as part of the **Prodigy Infotech Internship Program (Task-04)**.

The program automatically solves a partially filled Sudoku puzzle using a **Backtracking Algorithm**, ensuring that all Sudoku constraints are satisfied.

This project demonstrates algorithmic problem solving, recursion, and efficient validation techniques used in real-world software development.

---

## 🚀 Features

* ✅ Automatic Sudoku puzzle solving
* ✅ Backtracking algorithm implementation
* ✅ Row, column, and 3×3 subgrid validation
* ✅ Optimized recursive logic
* ✅ Clean console-based interface
* ✅ Structured and modular Java code

---

## 🛠️ Technologies Used

* **Java**
* Object-Oriented Programming (OOP)
* Recursion & Backtracking
* Data Structures & Algorithms
* Scanner Class for user input

---

## 🧠 Algorithm Explanation

The solver uses a **Backtracking Algorithm**:

1. Locate an empty cell.
2. Try numbers from 1 to 9.
3. Check if placement is valid:

   * Row constraint
   * Column constraint
   * 3×3 grid constraint
4. If valid → continue recursively.
5. If no number works → backtrack and try another possibility.

---

## ⏱ Time Complexity

Worst Case Complexity:

O(9ⁿ)

Where **n** represents the number of empty cells.

Backtracking significantly reduces computation time by pruning invalid possibilities early.

---

## 📂 Project Structure

```text
Sudoku-Solver-Java/
│
├── SudokuSolver.java
├── README.md
└── .gitignore
```

---

## ▶️ How to Run the Project

### Compile

```bash
javac SudokuSolver.java
```

### Run

```bash
java SudokuSolver
```

---

## 🧪 Example Input

Use `0` for empty cells:

```
5 3 0 0 7 0 0 0 0
6 0 0 1 9 5 0 0 0
0 9 8 0 0 0 0 6 0
8 0 0 0 6 0 0 0 3
4 0 0 8 0 3 0 0 1
7 0 0 0 2 0 0 0 6
0 6 0 0 0 0 2 8 0
0 0 0 4 1 9 0 0 5
0 0 0 0 8 0 0 7 9
```

---

## 💡 Learning Outcomes

* Understanding backtracking algorithms
* Applying recursion for constraint problems
* Writing optimized validation logic
* Improving problem-solving skills using Java

---

## 👨‍💻 Author

**Mallikarjun Gala**
Prodigy Infotech Intern

---

## ⭐ Acknowledgement

Developed as part of the **Prodigy Infotech Internship Program** to enhance algorithmic thinking and Java programming skills.
