CREATE DATABASE springdemo;

USE springdemo;

CREATE TABLE employees(
	employee_id INT PRIMARY KEY,
    first_name VARCHAR(50),
    last_name varchar(50),
    department_id INT,
    salary DOUBLE,
    sales DOUBLE
);

INSERT INTO employees (employee_id,first_name,last_name,department_id,salary,sales) 
		VALUES
			(1, 'John', 'Doe', 10, 50000, 1500), 
			(2, 'Jane', 'Smith', 10, 60000, 2000), 
			(3, 'Alice', 'Johnson', 20, 55000, 2500), 
			(4, 'Bob', 'Brown', 30, 70000, 3000), 
			(5, 'Carol', 'Wilson', 30, 75000, 3500);

SELECT * FROM employees;






