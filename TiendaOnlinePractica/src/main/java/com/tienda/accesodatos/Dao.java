package com.tienda.accesodatos;

public interface Dao<T> {
	Iterable<T> ObtenerTodos();
	T ObtenerPorId(Long Id);
	
	T Insertar(T objeto);
	T Modificar(T objeto);
	void Borrar(Long Id);
}
