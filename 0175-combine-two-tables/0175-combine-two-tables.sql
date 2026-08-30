# Write your MySQL query statement below
SELECT firstName, lastName,city, state
FROM Person AS c
LEFT JOIN Address AS p
ON c.personID = p.personId;