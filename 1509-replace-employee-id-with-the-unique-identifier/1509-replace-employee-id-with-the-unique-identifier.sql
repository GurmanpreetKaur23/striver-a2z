# Write your MySQL query statement below
-- ID FROM EMPLOYEES TABLE
SELECT 
EmployeeUNI.unique_id , Employees.name 
FROM Employees

LEFT JOIN

EmployeeUNI ON 
Employees.id = EmployeeUNI.id



