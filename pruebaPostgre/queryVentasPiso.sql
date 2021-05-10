Select 
maquinas_registradoras.piso,
count(case maquinas_registradoras.piso when 1 then 1 when 2 then 1 when 3 then 1 else null end)piso
from 
maquinas_registradoras 
left join venta
on maquinas_registradoras.maquina=venta.maquina
group by 
maquinas_registradoras.piso
order by maquinas_registradoras.piso ASC