(select u.name as results from Users u join MovieRating m on u.user_id=m.user_id group by u.name order by count(*) desc,u.name limit 1)
union all
(select m1.title as results from Movies m1 join MovieRating m2 on m1.movie_id=m2.movie_id where month(m2.created_at)=02 and year(m2.created_at)=2020 group by m1.title order by avg(m2.rating) desc,m1.title limit 1);
