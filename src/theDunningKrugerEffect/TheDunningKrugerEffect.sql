select id, name,
       perceived_skill_level - actual_skill_level as skill_overestimation,
       case
           when perceived_skill_level - actual_skill_level <= 2 then 'Mild case of overconfidence'
           when perceived_skill_level - actual_skill_level <= 5 then 'Moderate case of overconfidence'
           when perceived_skill_level - actual_skill_level <= 7 then 'Serious case of overconfidence'
           else 'Extreme case of Dunning-Kruger effect detected!'
           end as overconfidence_category
from users where perceived_skill_level > actual_skill_level
order by skill_overestimation DESC,
         id DESC