select gobun, goname, gotel
from gogek
where regexp_like (goname, '^.��');

select gobun, goname, gotel
from gogek
where regexp_like (gotel, '[7]{2}');

