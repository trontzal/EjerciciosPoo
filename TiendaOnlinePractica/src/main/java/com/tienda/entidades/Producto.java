package com.tienda.entidades;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Producto {
	private Long id;
	private String nombre;
	private String descripcion;
	private BigDecimal precio;
	private LocalDate fecha_caducidad;

	public Producto(Long id, String nombre, String descripcion, BigDecimal precio, LocalDate fecha_caducidad) {
		setId(id);
		setNombre(nombre);
		setDescripcion(descripcion);
		setPrecio(precio);
		setFecha_caducidad(fecha_caducidad);

	}

	public Producto(Producto producto) {
		this(producto.getId(), producto.getNombre(), producto.getDescripcion(), producto.getPrecio(),
				producto.getFecha_caducidad());
	}

	public Producto(String nombre, String descripcion, BigDecimal precio, LocalDate fecha_caducidad) {
		this(null, nombre, descripcion, precio, fecha_caducidad);
	}

	public Producto(Long id, String nombre, BigDecimal precio, LocalDate fecha_caducidad) {
		this(id, nombre, null, precio, fecha_caducidad);
	}

	public Producto(Long id, String nombre, String descripcion, BigDecimal precio) {
		this(id, nombre, descripcion, precio, null);
	}

	public Producto() {
		this(null, "Desconocido", null, BigDecimal.ZERO);
	}

	// Setter y getters generados
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if (nombre == null || nombre.trim().length() == 0) {
			throw new RuntimeException("No se admiten nombre vacios");
		}
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		if (precio == null || precio.compareTo(BigDecimal.ZERO) < 0) {
			throw new RuntimeException("El precio es obligatorio y no puede ser menos que cero");
		}
		this.precio = precio;
	}

	public LocalDate getFecha_caducidad() {
		return fecha_caducidad;
	}

	public void setFecha_caducidad(LocalDate fecha_caducidad) {
		// En un futuro agregar que la fecha no pueda ser anterior a la actual
		this.fecha_caducidad = fecha_caducidad;
	}

}
