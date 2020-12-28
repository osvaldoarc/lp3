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

import com.syslp3.entity.Categoria;
import com.syslp3.service.CategoriaService;

@RestController
@CrossOrigin(origins = "", allowedHeaders = "")
@RequestMapping("/categoria")
public class CategoriaController {

	@Autowired
	private CategoriaService categoriaService;
	
	@GetMapping("/all")
	public List<Map<String, Object>> readAll(){
		return categoriaService.ReadAll();
	}
	
	@PostMapping("/add")
	public int create(@RequestBody Categoria c) {
		return categoriaService.create(c);
}
	@PutMapping("/update/{id}")
	public int update(@RequestBody Categoria categoria,@PathVariable int id) {
		categoria.setIdcategoria(id);
		
	return categoriaService.update(id);
	}
	@DeleteMapping("/delete/{id}")
	public int delete(@PathVariable int id ) {
		return categoriaService.delete(id);
	}
}
