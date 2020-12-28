package com.syslp3.daoImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.syslp3.dao.AutorDAO;
import com.syslp3.entity.Autor;

@Component
public class AutorDAOImpl implements AutorDAO {
@Autowired
private JdbcTemplate jdbcTemplate;
	@Override
	public int create(Autor a) {
		String SQL ="INSERT INTO autor(nombres, apellidos) VALUES (?,?)";
		return jdbcTemplate.update(SQL, a.getNombres(), a.getApellidos());
	}

	@Override
	public int update(Autor a) {
		String SQL="UPDATE autor SET nombres=?, apellidos=? WHERE idautor=?";
		return jdbcTemplate.update(SQL, a.getNombres(), a.getApellidos());
	}

	@Override
	public int update(int id) {
		String SQL="UPDATE autor SET nombres=?, apellidos=? WHERE idautor=?";
		return jdbcTemplate.update(SQL, id);
	}

	@Override
	public int delete(int id) {
		String SQL="DELETE from autor WHERE idautor=?";
		return jdbcTemplate.update(SQL, id);
	}

	@Override
	public Autor read(int id) {
		String SQL = "SELECT *from autor where idlibro=?";
		return jdbcTemplate.queryForObject(SQL, new Object[] {id}, new BeanPropertyRowMapper<Autor>(Autor.class));
	}

	@Override
	public List<Map<String, Object>> readAll() {
		String SQL="SELECT *FROM autor";
		return jdbcTemplate.queryForList(SQL);
	}

	

}
