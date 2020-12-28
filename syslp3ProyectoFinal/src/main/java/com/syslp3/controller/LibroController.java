package com.syslp3.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.syslp3.entity.Libro;
import com.syslp3.service.LibroService;

@RestController
@CrossOrigin(origins = "", allowedHeaders = "")
@RequestMapping("/libros")
public class LibroController {

	@Autowired
	private LibroService libroservice;
	
	@GetMapping("/all")
	public List<Map<String, Object>> readAll(){
		return libroservice.readAll();
	}
	@PostMapping("/add")
	public int create(@RequestBody Libro l) {
		return libroservice.create(l)
;	}
	@PutMapping("/update/{id}")
	public int update(@RequestBody Libro libro,@PathVariable int id) {
		libro.setIdlibro(id);
		
	return libroservice.update(id);
	}
	@DeleteMapping("/delete/{id}")
	public int delete(@PathVariable int id ) {
		return libroservice.delete(id);
	}
}
