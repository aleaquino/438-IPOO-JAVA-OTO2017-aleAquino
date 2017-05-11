package com.aleaquino.ipoo.datos.acceso;

import java.util.Date;

public class Acceso<Cliente> {
	private Date fechaHoraInicio;
	private Date fechaHoraFin;
	private String ip;
	private Cliente Cliente;

	public Acceso(){
		/* constructor */
	}

	public Acceso(Date fechaHoraInicio, Date fechaHoraFin, String ip, Cliente cliente) {
		super();
		this.fechaHoraInicio = fechaHoraInicio;
		this.fechaHoraFin = fechaHoraFin;
		this.ip = ip;
		Cliente = cliente;
	}

	/* métodos */
	public Date getFechaHoraInicio() {
		return fechaHoraInicio;
	}

	public void setFechaHoraInicio(Date fechaHoraInicio) {
		this.fechaHoraInicio = fechaHoraInicio;
	}

	public Date getFechaHoraFin() {
		return fechaHoraFin;
	}

	public void setFechaHoraFin(Date fechaHoraFin) {
		this.fechaHoraFin = fechaHoraFin;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public Cliente getCliente() {
		return Cliente;
	}

	public void setCliente(Cliente cliente) {
		Cliente = cliente;
	}
	
}
