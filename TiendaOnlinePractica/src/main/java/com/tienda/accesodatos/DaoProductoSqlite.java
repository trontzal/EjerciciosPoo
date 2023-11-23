package com.tienda.accesodatos;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.tienda.entidades.Producto;

public class DaoProductoSqlite implements DaoProducto {
	private static final String url = "jdbc:sqlite:/home/trontzal/sqlite/amazonia.db";
	private static final String SQL_SELECT = "SELECT id, codigo_barras, nombre, precio, fecha_caducidad, unidades FROM productos";

	static {
		try {
			Class.forName("org.sqlite.JDBC");
		} catch (ClassNotFoundException e) {
			throw new AccesoDatosException("No se ha podido cargar el driver", e);
		}
	}

	@Override
	public Iterable<Producto> ObtenerTodos() {
		List<Producto> productos = new ArrayList<>();

		try (Connection con = obtenerConexion();
				PreparedStatement pst = con.prepareStatement(SQL_SELECT);
				ResultSet rs = pst.executeQuery()) {

			while (rs.next()) {
				// Crear un producto a partir de los datos recuperados de la base de datos
				Producto producto = filaAProducto(rs);
				productos.add(producto);
			}

		} catch (SQLException e) {
			throw new AccesoDatosException("Error al obtener todos los productos", e);
		}

		return productos;
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

	private Connection obtenerConexion() {
		try {
			return DriverManager.getConnection(url);
		} catch (SQLException e) {
			throw new AccesoDatosException("No se ha podido establecer la conexion con la base de datos", e);
		}
	}

	private Producto filaAProducto(ResultSet rs) throws SQLException {
		Long id = rs.getLong("id");
		String codigoBarras = rs.getString("codigo_barras");
		String nombre = rs.getString("nombre");
		BigDecimal precio = rs.getBigDecimal("precio");
		LocalDate fechaCaducidad = rs.getDate("fecha_caducidad").toLocalDate();
		Integer unidades = rs.getInt("unidades");

		return new Producto(id, codigoBarras, nombre, precio, fechaCaducidad, unidades);
	}

}
