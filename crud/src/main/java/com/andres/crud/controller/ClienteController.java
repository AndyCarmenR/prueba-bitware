package com.andres.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.andres.crud.model.Cliente;
import com.andres.crud.model.Respuesta;
import com.andres.crud.repository.ClienteRepository;

@RestController
@RequestMapping("/NutriNET")
public class ClienteController {
	
	@Autowired 
	ClienteRepository clienteRepository;
	
	@PostMapping("/Cliente")
	public Respuesta crearCliente(@RequestBody Cliente c) {
		try {
			return new Respuesta(0, "Cliente creado en bd", clienteRepository.insert(c));
		} catch (Exception e) {
			System.out.println("Error: \n"+e.getMessage().toString());
			return new Respuesta(-1, "Error inesperado, consulte el log del aplicativo.",null);
		}
	}
	
	@GetMapping("/Cliente/{id}")
	public Respuesta getCliente(@RequestParam(value = "id",required = false) Long id) {
		try {
			if (id!=null) {
				return new Respuesta(0, "Consulta exitosa", clienteRepository.findById(id));
			} else {
				return new Respuesta(0, "Consulta exitosa", clienteRepository.findAll());
			}
		} catch (Exception e) {
			System.out.println("Error: \n"+e.getMessage().toString());
			return new Respuesta(-1, "Error inesperado, consulte el log del aplicativo.",null);
		}		
	}
	
	@PutMapping("/Cliente/{id}")
	public Respuesta updateCliente(@PathVariable Long id,@RequestBody Cliente c) {
		try {
			return new Respuesta(0, "Consulta exitosa", clienteRepository.save(c));
		} catch (Exception e) {
			System.out.println("Error: \n"+e.getMessage().toString());
			return new Respuesta(-1, "Error inesperado, consulte el log del aplicativo.",null);
		}
	} 	

}
