package com.aleaquino.ipoo.repuestos.storage;

import com.aleaquino.ipoo.datos.cliente.Cliente;

// declaración de interface
public interface Storage {

	Cliente obtCliente(String tipoDoc, String nroDoc, String password);
	
}
