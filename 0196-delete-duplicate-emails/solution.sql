# Write your MySQL query statement below
delete p2 from person p1 join person p2 where p1.email=p2.email and p1.id < p2.id;
