# Write your MySQL query statement below
select p.product_id ,coalesce((select new_price from Products where p.product_id=product_id and change_date<='2019-08-16' order by change_date desc limit 1),10) as price
from (select distinct product_id from Products)p;
