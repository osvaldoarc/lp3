package com.syslp3.daoImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.syslp3.dao.LibroDAO;
import com.syslp3.entity.Libro;
@Component
public class LibroDAOImpl implements LibroDAO{
@Autowired
private JdbcTemplate jdbcTemplate;
	@Override
	public int create(Libro l) {
		String SQL = "INSERT INTO libro(titulo, edicion, year) VALUES (?, ?, ?)";
		return jdbcTemplate.update(SQL, l.getTitulo(), l.getEdicion(), l.getYear());
	}

	@Override
	public int update(Libro l) {
		String SQL="UPDATE libro SET titulo=?, edicion=?, year=? WHERE idlibro=?";
		return jdbcTemplate.update(SQL, l.getTitulo(), l.getEdicion(), l.getYear());
	}

	@Override
	public int update(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		String SQL="DELETE from libro WHERE idlibro=?";
		return jdbcTemplate.update(SQL, id);
	}

	@Override
	public Libro read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> readAll() {
		String SQL="SELECT l.*,a.nombres \"autor\",c.nomcat \"categoria\",e.nombre \"editorial\" FROM libro l,autor a,categoria c, editorial e "
				+ "WHERE l.idcategoria=c.idcategoria and l.idautor=a.idautor and e.ideditorial=l.ideditorial ;";
		return jdbcTemplate.queryForList(SQL);
	}

	

}
