USE quanlysinhvien;

SELECT * 
FROM student
WHERE student.StudentName LIKE "h%";

SELECT *
FROM class
WHERE EXTRACT(MONTH FROM class.StartDate) = 12;

SELECT * 
FROM subject
WHERE subject.Credit >= 3 and subject.Credit <= 5;

UPDATE student
SET student.ClassID = "2"
WHERE student.StudentName = "Hung";

SELECT student.StudentName as Name, subject.SubName as Subject, mark.Mark as Mark
FROM student JOIN subject JOIN mark
ON student.StudentID = mark.StudentID and mark.SubId = subject.SubId
ORDER BY (
	CASE 
		WHEN Mark THEN Mark 
        ELSE Name 
	END
);