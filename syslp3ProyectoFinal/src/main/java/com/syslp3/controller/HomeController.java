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

import com.syslp3.entity.Rol;
import com.syslp3.service.RolService;

@RestController
@CrossOrigin(origins = "", allowedHeaders = "")
@RequestMapping("/roles")
public class HomeController {
@Autowired
private RolService rolService;

	@GetMapping("/listarrol")
	public List<Map<String, Object>> mensaje() {
		return rolService.readAll();
	} 
	
	@PostMapping("/add")
	public int create(@RequestBody Rol r) {
		return rolService.create(r);
}
	@PutMapping("/update/{id}")
	public int update(@RequestBody Rol rol,@PathVariable int id) {
		rol.setIdrol(id);
		
	return rolService.update(rol);
	}
	@DeleteMapping("/delete/{id}")
	public int delete(@PathVariable int id ) {
		return rolService.delete(id);
	}
	
}
