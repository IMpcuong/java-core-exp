SELECT * FROM subject;

SELECT max(credit) as max_cre, subject.* FROM subject;

SELECT max(mark.Mark) as HighestScore, subject.*
FROM mark 
RIGHT JOIN subject 
ON mark.SubId = subject.SubId;

SELECT student.*, (mark.Mark / mark.ExamTimes) as Avg_Mark
FROM mark
JOIN student
ON mark.StudentID = student.StudentID
ORDER BY Avg_Mark DESC;