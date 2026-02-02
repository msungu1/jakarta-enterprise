-- Switch to the class database
USE adse2401;

-- Create a students table

CREATE TABLE Student
(
	Student_No varchar(20) charset utf8mb4 collate utf8mb4_general_ci not null comment 'The student''s Unique number',
    Name varchar(80) charset utf8mb4 collate utf8mb4_general_ci not null comment 'The student''s name',
    Birthdate date not null comment 'The student''s date of birth',
    Gender char(1) not null comment 'The students binary gender using m:male or f:female',
    primary key(student_no)
)Engine=InnoDB default charset=utf8mb4 comment 'Table to store student details.';

-- Show the detail of the columns from the students table
desc Student;

-- Insert / add records / tupules / rows to the student table
INSERT INTO Student
VALUES
('EICN-ADSE-S0001', 'John Prince', '2020-01-02', 'M'),
('EICN-ADSE-S0002', 'Hamid Abdi', '2020-07-07', 'F'),
('EICN-ADSE-S0003', 'Robert Mzungu', '2020-04-029', 'M'),
('EICN-ADSE-S0004', 'Mohammed Ahmed', '2020-08-19', 'M'),
('EICN-ADSE-S0005', 'Fred Alvin', '2020-10-10', 'F'),
('EICN-ADSE-S0006', 'Johnathan Kanaiya', '2020-3-11', 'F'),
('EICN-ADSE-S0007', 'Hasan Dossa', '2020-04-07', 'M'),
('EICN-ADSE-S0008', 'Peter Njuguna', '2020-04-09', 'M'),
('EICN-ADSE-S0009', 'Ahmed Abdi', '2020-01-05', 'M'),
('EICN-ADSE-S0010', 'Sama Osam', '2020-07-16', 'M');

SELECT * FROM Student


