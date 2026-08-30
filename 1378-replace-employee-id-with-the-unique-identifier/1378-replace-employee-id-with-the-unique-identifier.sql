# Write your MySQL query statement below
SELECT unique_id,name
FROM Employees AS c
LEFT JOIN EmployeeUNI AS e
ON c.id = e.id;