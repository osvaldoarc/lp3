package upeu.edu.pe.service;

import java.util.List;
import java.util.Optional;

import upeu.edu.pe.model.DetallePedido;

public interface DetalleService {
	public List<DetallePedido> listar();
	public Optional<DetallePedido> readID(long id);
	public void deleteUser(long id);
}
