package com.tienda.presentacion.consola;

import com.tienda.accesodatos.DaoProducto;
import com.tienda.accesodatos.DaoProductoSqlite;
import com.tienda.entidades.Producto;

public class PresentacionConsola {
	public static void main(String[] args) {
		DaoProducto dao = new DaoProductoSqlite();

		for(Producto p: dao.ObtenerTodos()) {
			System.out.println(p);
		}
	}
}
