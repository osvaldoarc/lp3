package upeu.edu.pe.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import upeu.edu.pe.model.DetallePedido;
import upeu.edu.pe.service.DetalleService;


@RestController
public class DetalleController {

	@Autowired
	DetalleService detalleservice;
	
	@GetMapping("/")
	public String inicio(){
		return "Detalle del pedido";
	}
	@GetMapping("/readAll")
	public ResponseEntity<List<DetallePedido>> readAll(){
		List<DetallePedido> detalle = new ArrayList<DetallePedido>();
		try {
			detalle = detalleservice.listar();
			if (detalle.isEmpty())
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        	return new ResponseEntity<>(detalle,HttpStatus.OK);

	}catch (Exception e) { 
				 return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
				 
 
			}
	
		}
	}

		
	

