package upeu.edu.pe.serviceImp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import upeu.edu.pe.model.DetallePedido;
import upeu.edu.pe.repository.DetalleRepository;
import upeu.edu.pe.service.DetalleService;

@Service
public class DetalleServiceImp implements DetalleService{

	@Autowired
	DetalleRepository detallerepository;

	@Override
	public List<DetallePedido> listar() {
		return detallerepository.findAll();
	}

	@Override
	public Optional<DetallePedido> readID(long id) {
		return detallerepository.findById(id);
	}

	@Override
	public void deleteUser(long id) {
		// TODO Auto-generated method stub
		
	}
	
	
}
