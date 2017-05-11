package com.aleaquino.ipoo.datos.cliente;

public class Cliente {
	
	private long id;
	private String tipoDoc;
	private String nroDoc;
	private String nombre;
	private String direccion;
	private String telefono;
	private String password;
	
	public Cliente() {
		/* constructor */
	}

	public Cliente(long id, String tipoDoc, String nroDoc, String nombre, String direccion, String telefono,
			String password) {
		super();
		this.id = id;
		this.tipoDoc = tipoDoc;
		this.nroDoc = nroDoc;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.password = password;
	}

	/* métodos */
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTipoDoc() {
		return tipoDoc;
	}

	public void setTipoDoc(String tipoDoc) {
		this.tipoDoc = tipoDoc;
	}

	public String getNroDoc() {
		return nroDoc;
	}

	public void setNroDoc(String nroDoc) {
		this.nroDoc = nroDoc;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}

