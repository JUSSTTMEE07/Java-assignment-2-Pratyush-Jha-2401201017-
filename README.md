<div align="center">

# 🎓 Student Management System (Java) 

Robust, console-based CRUD app to manage students, built with core Java. 

![Status](https://img.shields.io/badge/status-active-brightgreen) ![Java](https://img.shields.io/badge/Java-8%2B-orange) ![Platform](https://img.shields.io/badge/platform-CLI-blue) 

</div>

---

## ✨ Features
- ✅ Add, update, delete, and list students
- 🧭 Search students by id or name
- 🧩 Simple `model` + `service` design for clarity
- 💾 In-memory storage for easy testing and demos

## 🗂️ Project Structure
```text
University assignments/Assignment2_StudentManagementSystem
├─ src/
│  ├─ MainApp.java                  # Entry point (CLI)
│  ├─ model/
│  │  ├─ Person.java               # Base model
│  │  └─ Student.java              # Student entity
│  └─ service/
│     ├─ RecordActions.java        # CRUD operations
│     └─ StudentManager.java       # Coordination/business logic
├─ bin/                             # Compiled .class files (ignored)
└─ README.md                        # You are here ✍️
```

> Note: There may be duplicate sources under `src/model/.../service` from intermediate work. Use the `src/` top-level as the canonical source path.

## 🧰 Requirements
- Java 8 or newer (JDK)
- Windows PowerShell, CMD, or any terminal

## 🚀 Build & Run

Compile to `bin/` and run the CLI app.

```bash
# From project root
# 1) Create bin dir if missing
mkdir bin 2> NUL

# 2) Compile sources to bin
javac -d bin -sourcepath src src/MainApp.java

# 3) Run the program
java -cp bin MainApp
```

If you prefer using PowerShell:
```powershell
mkdir bin -ErrorAction SilentlyContinue
javac -d bin -sourcepath src src/MainApp.java
java -cp bin MainApp
```

## 🕹️ Usage (CLI)
When you run the app, you’ll see a menu similar to:

```text
===== Student Management System =====
1. Add Student
2. Update Student
3. Delete Student
4. List Students
5. Search Student
0. Exit
```

Follow the prompts to perform actions. Typical flow:
- ➕ Add a student (id, name, age, course, etc.)
- 📝 Update a student by id
- 🗑️ Delete a student by id
- 📄 List all students
- 🔎 Search by id or name

## 🧪 Example
```text
Enter choice: 1
Enter id: 101
Enter name: Alice
Enter age: 20
Enter course: CS
Student added successfully ✅

Enter choice: 4
ID   NAME    AGE  COURSE
101  Alice   20   CS
```

## 🧱 Design Notes
- `model` holds data classes: `Person` → `Student`
- `service` encapsulates operations and state: `StudentManager`, `RecordActions`
- `MainApp` wires everything and handles the console loop and input validation

## 📦 Git & Project Hygiene
- `.gitignore` excludes `bin/`, build outputs, IDE files
- Source lives in `src/`; commit only `.java` files and docs

## 🧭 Roadmap Ideas
- 💽 Persist data to file/DB
- 🧪 Add unit tests (JUnit)
- 🧹 Input validation and error messages
- 🧰 Export/import CSV

## 🤝 Contributing
PRs are welcome. For larger changes, open an issue to discuss the approach first.

## 📝 License
Educational use; adapt as needed for assignments and learning.

## 🔗 Links
- Repository: `https://github.com/JUSSTTMEE07/Java-assignment-2-Pratyush-Jha-2401201017-`


📘 Course Details

**Course Name:** Java Programming
**Course Code:** ENCS201 / ENCA203 / ENBC205
**Department:** School of Engineering & Technology (SOET)
**Faculty:** Dr. Manish Kumar
**Student Name:** Pratyush Jha
**Roll No.:** 2401201017
**Session:** 2025–26 (3rd Semester)

### 📚 Acknowledgment

This project was developed as part of the **Java Programming** course at **K.R. Mangalam University**, under the guidance of **Dr. Manish Kumar**.


---

Made with ❤️ for learning Java.

# Java-assignment-2-Pratyush-Jha-2401201017-
