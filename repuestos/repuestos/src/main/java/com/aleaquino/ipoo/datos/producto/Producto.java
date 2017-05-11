package com.aleaquino.ipoo.datos.producto;

public class Producto {

	private long id;
	private String nombre;
	private String descripcion;
	private Byte imagen;
	private Double precio;
	
	public Producto(){
		/* constructor */
	}

	public Producto(long id, String nombre, String descripcion, Byte imagen, Double precio) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.imagen = imagen;
		this.precio = precio;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Byte getImagen() {
		return imagen;
	}

	public void setImagen(Byte imagen) {
		this.imagen = imagen;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	
}
