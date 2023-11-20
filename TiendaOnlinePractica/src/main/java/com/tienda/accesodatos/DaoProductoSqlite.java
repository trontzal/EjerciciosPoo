package com.tienda.accesodatos;

import java.sql.Connection;
import java.time.LocalDate;

import com.tienda.entidades.Producto;

public class DaoProductoSqlite implements DaoProducto {

	private String url;

	static {
		try {
			Class.forName("org.sqlite.JDBC");
		} catch (ClassNotFoundException e) {
			throw new AccesoDatosException("No se ha podido cargar el driver", e);
		}
	}

	public DaoProductoSqlite(String url) {
		this.url = url;
	}

	@Override
	public Iterable<Producto> ObtenerTodos() {
		try (Connection con = obtenerConexion();
				
	}

	@Override
	public Producto ObtenerPorId(Long Id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Producto Insertar(Producto objeto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Producto Modificar(Producto objeto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void Borrar(Long Id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Iterable<Producto> obtenerPorNombreParcial(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Producto> obtenerCaducados() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Producto> obtenerCaducados(LocalDate fecha) {
		// TODO Auto-generated method stub
		return null;
	}

}
