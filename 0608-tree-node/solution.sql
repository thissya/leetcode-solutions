# Write your MySQL query statement below
select id,
case 
    when p_id is Null then 'Root'
    when id in (select p_id from Tree) then 'Inner'
    else 'Leaf' 
    end as Type
from Tree
