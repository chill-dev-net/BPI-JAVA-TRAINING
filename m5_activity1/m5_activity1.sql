
CREATE TABLE students (
	id SERIAL PRIMARY KEY NOT NULL,
	name VARCHAR(50) NOT NULL,
	age INT,
	email VARCHAR(100) UNIQUE
);

CREATE TABLE courses (
   id SERIAL NOT NULL,
   student_id INT,
   course_name VARCHAR(50),
   grade VARCHAR(2),
   PRIMARY KEY (id),
   FOREIGN KEY (student_id) REFERENCES students(id)
);

INSERT INTO students (name, age, email)
VALUES
('Juan Dela Cruz', 20, 'juan@example.com'),
('Maria Santos',   21, 'maria@example.com'),
('Pedro Reyes',    22, 'pedro@example.com'),
('Ana Lopez',      19, 'ana@example.com'),
('Jose Garcia',    23, 'jose@example.com');

INSERT INTO courses (STUDENT_ID, COURSE_NAME, GRADE)
VALUES (1, 'English', 80),
       (4, 'Physics', 97),
       (3, 'Math', 92);

select * from students;
select * from courses;