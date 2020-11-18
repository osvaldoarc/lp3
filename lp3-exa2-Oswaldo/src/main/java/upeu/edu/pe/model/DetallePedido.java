package upeu.edu.pe.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="detalle_pedido")
public class DetallePedido {

	@Id
	@Column(name = "iddetalle_pedido")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private Double precio;
	private int cantidad;
	
	public DetallePedido() {
		
	}
	
	public DetallePedido(long id, Double precio, int cantidad) {
		this.id = id;
		this.precio = precio;
		this.cantidad = cantidad;
	}


	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	
}
