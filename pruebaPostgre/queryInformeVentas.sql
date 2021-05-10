Select 
cajeros.nomapels, productos.nombre, 
productos.precio,
maquinas_registradoras.piso,
maquinas_registradoras.maquina 
from cajeros 
left join venta 
on cajeros.cajero=venta.cajero
left join productos
on productos.producto=venta.producto
left join maquinas_registradoras ON maquinas_registradoras.maquina = venta.maquina
order by productos.nombre, maquinas_registradoras.piso, maquinas_registradoras.maquina