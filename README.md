# Java-Task-Tracker
A simple backend  task tracker built using Java, JDBC, MYSQL and Docker

## Features

- ADD Tasks
- View Tasks
- Priority Levels
- DeadLines
- MYSQL Database Integration
- Dockerized MYSQL

## Tech Stack

- Java
- JDBC
- MYSQL
- Docker
- VSCode

## Database Schema

```sql
CREATE TABLE tasks(
    id INT PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(100) NOT NULL,
    completed BOOLEAN DEFAULT FALSE,
    priority VARCHAR(20),
    deadline DATE
);
```

## How to Run

1. Start MYSQL Docker Container
2. Create 'tasktracker' Database
3. Add MYSQL JDBC Connector jar
4. Run Main.java



