select productos.nombre, count (venta.producto) ventas from venta
left join productos 
on venta.producto=productos.producto
group by productos.nombre
order by ventas DESC