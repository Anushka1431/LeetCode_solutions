# Write your MySQL query statement below
SELECT w.id 
from Weather w 
join Weather v 
on DATEDIFF(w.recordDate, v.recordDate)=1 
WHERE  w.temperature>v.temperature;