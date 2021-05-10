Select cajeros.cajero codigo_cajero, cajeros.nomapels nombre_cajero, 
count(venta.cajero) venta,
sum(productos.precio) importe_venta from cajeros
left join venta
on cajeros.cajero=venta.cajero
left join productos ON productos.producto = venta.producto
group by cajeros.cajero
order by cajeros.cajero Desc