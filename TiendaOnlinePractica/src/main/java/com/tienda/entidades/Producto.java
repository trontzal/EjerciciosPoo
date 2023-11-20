package com.tienda.entidades;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

public class Producto {
	private static final Integer UNIDADES_POR_DEFECTO = null;

	private Long id;
	private String codigoBarras;
	private String nombre;
	private BigDecimal precio;
	private LocalDate fecha_caducidad;
	private Integer unidades;

	public Producto(Long id, String codigoBarras, String nombre, BigDecimal precio, LocalDate fecha_caducidad,
			Integer unidades) {
		setId(id);
		setCodigoBarras(codigoBarras);
		setNombre(nombre);
		setPrecio(precio);
		setFecha_caducidad(fecha_caducidad);
		setUnidades(unidades);
	}

	public Producto(String codigoBarras, String nombre, BigDecimal precio, LocalDate fecha_caducidad,
			Integer unidades) {
		this(null, codigoBarras, nombre, precio, fecha_caducidad, unidades);
	}

	public Producto(String nombre, BigDecimal precio, LocalDate fecha_caducidad, Integer unidades) {
		this(null, null, nombre, precio, fecha_caducidad, unidades);
	}

	public Producto(String nombre, BigDecimal precio, LocalDate fecha_caducidad) {
		this(null, null, nombre, precio, fecha_caducidad, UNIDADES_POR_DEFECTO);
	}

	public Producto(String nombre, BigDecimal precio, Integer unidades) {
		this(null, null, nombre, precio, null, unidades);
	}

	public Producto(String nombre, BigDecimal precio) {
		this(null, null, nombre, precio, null, UNIDADES_POR_DEFECTO);
	}

	// Setter y getters generados
	public Long getId() {
		return id;
	}

	public String getCodigoBarras() {
		return codigoBarras;
	}

	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}

	public Integer getUnidades() {
		return unidades;
	}

	public void setUnidades(Integer unidades) {
		this.unidades = unidades;
	}

	public static Integer getUnidadesPorDefecto() {
		return UNIDADES_POR_DEFECTO;
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

	@Override
	public int hashCode() {
		return Objects.hash(codigoBarras, id, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		return Objects.equals(codigoBarras, other.codigoBarras) && Objects.equals(id, other.id)
				&& Objects.equals(nombre, other.nombre);
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", codigoBarras=" + codigoBarras + ", nombre=" + nombre + ", precio=" + precio
				+ ", fecha_caducidad=" + fecha_caducidad + ", unidades=" + unidades + "]";
	}

}
