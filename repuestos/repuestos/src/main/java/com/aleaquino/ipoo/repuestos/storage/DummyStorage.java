package com.aleaquino.ipoo.repuestos.storage;

import java.util.ArrayList;
import java.util.List;

import com.aleaquino.ipoo.datos.cliente.Cliente;

public class DummyStorage implements Storage{
	
	//lista de clientes de "gua'u"

	private List<Cliente> clientes;
	
	public DummyStorage(){
			
		//variable para simular un autonumerico de base de datos
		long id=0;
		
		//inicializo mi vector
		clientes=new ArrayList<>();
		
		Cliente c=new Cliente();
		c.setId(++id);
		c.setNombre("Ale Aquino");
		c.setNroDoc("5615356");
		c.setTipoDoc("CI");
		c.setPassword("123");
		
		clientes.add(c);
		
	}
	
	@Override
	public Cliente obtCliente(String tipoDoc, String nroDoc, String password) {
		//por cada cliente en el sector de clientes
		for(Cliente c: clientes){
			if(
				c.getTipoDoc().equals(tipoDoc) &&
				c.getNroDoc().equals(nroDoc) &&
				c.getPassword().equals(password)
			){
				return c;
			}
		}
		return null;
	}

	public static void main(String[] args){
		
		Storage s=new DummyStorage();
		Cliente c=s.obtCliente("CI", "5615356", "123");
	}
	
}
