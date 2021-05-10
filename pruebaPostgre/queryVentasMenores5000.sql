Select cajeros.cajero codigo_cajero, cajeros.nomapels nombre_cajero
from cajeros
left join venta
on cajeros.cajero=venta.cajero
left join productos ON productos.producto = venta.producto
group by cajeros.cajero
having sum(productos.precio::numeric) < 5000