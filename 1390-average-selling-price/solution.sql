# Write your MySQL query statement below
select o.product_id as product_id , 
case 
    when sum(e.units) is null then 0
    else round(sum(e.units*o.price)/sum(e.units),2) 
    end as average_price 
from Prices as o left join UnitsSold as e 
on o.product_id=e.product_id 
    and e.purchase_date between o.start_date and o.end_date 
group by o.product_id order by o.product_id; 
