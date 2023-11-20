package com.tienda.accesodatos;

import java.time.LocalDate;

import com.tienda.entidades.Producto;

public interface DaoProducto extends Dao<Producto> {
	Iterable<Producto> obtenerPorNombreParcial(String nombre);
	Iterable<Producto> obtenerCaducados();
	Iterable<Producto> obtenerCaducados(LocalDate fecha);
}
