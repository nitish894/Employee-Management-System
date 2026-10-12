# Employee Management System

A console-based Employee Management System developed using Java, JDBC, and MySQL. This project allows users to manage employee records and perform database operations through a Java application.

## Features

- Add new employee records
- View employee details
- Update existing employee information
- Delete employee records
- Store employee data in a MySQL database
- Connect Java to MySQL using JDBC
- Execute SQL queries through Java
- Handle database operations and exceptions

## Technologies Used

- **Programming Language:** Java
- **Database:** MySQL
- **Database Connectivity:** JDBC (Java Database Connectivity)
- **IDE:** IntelliJ IDEA
- **Version Control:** Git and GitHub

## Project Structure

```text
Employee-Management-System/
├── src/
│   └── com/
│       └── nitish/
│           └── emp/
│               ├── Employeeint.java
│               ├── Employeeimp.java
│               └── DBConnection.java
├── README.md
└── .gitignore
```

*Note: Adjust the folder and file names above to match your actual project.*

## Prerequisites

Before running this project, make sure you have:

- JDK installed
- MySQL Server installed
- IntelliJ IDEA installed
- MySQL Connector/J added to the project

## Database Setup

1. Open MySQL Workbench.
2. Create a database for the project:

```sql
CREATE DATABASE employeeDB;
```

3. Create the employee table according to the fields used in your Java code.
4. Configure the database URL, username, and password in your JDBC connection class.

Example JDBC URL:

```text
jdbc:mysql://localhost:3306/employeeDB
```

**Security note:** Do not upload your actual MySQL password or private employee data to GitHub.

## How to Run the Project

1. Clone the repository:

```bash
git clone https://github.com/nitish894/Employee-Management-System.git
```

2. Open the project in IntelliJ IDEA.
3. Configure your MySQL database connection.
4. Add MySQL Connector/J to your project dependencies.
5. Ensure that MySQL Server is running.
6. Run the main Java class.
7. Use the console menu to perform the available employee operations.

## Learning Outcomes

- Core Java and object-oriented programming
- JDBC database connectivity
- SQL queries and CRUD operations
- PreparedStatement and ResultSet
- Exception handling
- Connecting a Java application to MySQL

## Future Improvements

- Add employee search functionality
- Add input validation
- Improve exception handling
- Implement employee login and role-based access
- Add a graphical user interface

## Author

**Nitish Kumar Mahato**

GitHub: [nitish894](https://github.com/nitish894)

## License

This project was developed for educational purposes and Java database programming practice.
