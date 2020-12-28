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

import com.syslp3.entity.Autor;
import com.syslp3.service.AutorService;

@RestController
@CrossOrigin(origins = "", allowedHeaders = "")
@RequestMapping("/autores")
public class AutorController {

	@Autowired
	private AutorService autorService;
	
	@GetMapping("/all")
	public List<Map<String, Object>> readAll(){
		return autorService.readAll();
	}
	@PostMapping("/add")
	public int create(@RequestBody Autor a) {
		return autorService.create(a);
}
	@PutMapping("/update/{id}")
	public int update(@RequestBody Autor autor,@PathVariable int id) {
		autor.setIdautor(id);
		
	return autorService.update(autor);
	}
	@DeleteMapping("/delete/{id}")
	public int delete(@PathVariable int id ) {
		return autorService.delete(id);
	}
}
