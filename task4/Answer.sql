select u.username, td.training_id
from users u
join training_details td on td.user_id = u.user_id
join training_details td2 on td2.user_id = td.user_id
and td2.user_training_id != td.user_training_id
and td2.training_date = td.training_date
group by u.username, td.training_id, td.training_date
order by td.training_date
