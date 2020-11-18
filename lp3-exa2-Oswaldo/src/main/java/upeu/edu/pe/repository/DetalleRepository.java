package upeu.edu.pe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import upeu.edu.pe.model.DetallePedido;
@Repository
public interface DetalleRepository extends JpaRepository<DetallePedido, Long>{

	
}
