# Write your MySQL query statement below
select d.name as Department,e.name as Employee,e.salary as Salary from Employee e join Department d on e.departmentId=d.id and (e.departmentId ,e.Salary) in (select departmentId ,max(Salary) from Employee group by departmentId);
