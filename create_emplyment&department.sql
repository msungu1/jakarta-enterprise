use adse2401;

-- Create the department table
CREATE TABLE Department
(
	DepartmentID varchar(80) charset utf8mb4 collate utf8mb4_general_ci not null
    comment 'The department''s unique id',

	DepartmentName varchar(120) charset utf8mb4 collate utf8mb4_general_ci not null 
    comment 'The department''s name',
    primary key (DepartmentID)
)Engine=InnoDB default charset=utf8mb4 comment = 'Table used to store department details.';

-- Create the Employee table
CREATE TABLE Employee
(
	EmployeeID varchar(50) charset utf8mb4 collate utf8mb4_general_ci not null
    comment 'The employees''s unique id',
    Name varchar(150) charset utf8mb4 collate utf8mb4_general_ci not null
    comment 'The employees''s name',
    Age int not null comment 'The employee''s age',
    DepartmentID varchar(80) charset utf8mb4 collate utf8mb4_general_ci not null
    comment 'The department the emploee works in',
    CTC decimal(10,2) not null comment 'The employee''s salary / cost to company',
    primary key (EmployeeID),
    foreign key (DepartmentID) references Department(DepartmentID)
)Engine=InnoDB default charset=utf8mb4 comment = 'Table used to store employee details.';

-- Insert Employee records
INSERT INTO Employee (EmployeeID, Name, Age, DepartmentID, CTC)
VALUES
  ('E001', 'Alice Johnson', 30, 'Dept001', 55000.00),
  ('E002', 'Bob Smith', 45, 'Dept003', 72000.00),
  ('E003', 'Catherine Lee', 28, 'Dept002', 48000.00),
  ('E004', 'David Kim', 35, 'Dept004', 65000.00),
  ('E005', 'Eleanor Stone', 42, 'Dept005', 58000.00),
  ('E006', 'Frank Liu', 38, 'Dept006', 60000.00),
  ('E007', 'Grace Patel', 31, 'Dept007', 61000.00);
SELECT * FROM Employee;

-- Add records for the Department table
INSERT INTO Department (DepartmentID, DepartmentName)
VALUES
  ('Dept001', 'Sales'),
  ('Dept002', 'HR'),
  ('Dept003', 'IT'),
  ('Dept004', 'Finance'),
  ('Dept005', 'Marketing'),
  ('Dept006', 'Administration'),
  ('Dept007', 'Accounts');
SELECT * FROM Department;