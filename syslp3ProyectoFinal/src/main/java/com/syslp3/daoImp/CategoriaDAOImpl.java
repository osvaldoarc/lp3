package com.syslp3.daoImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.syslp3.dao.CategoriaDAO;
import com.syslp3.entity.Categoria;
@Component
public class CategoriaDAOImpl implements CategoriaDAO {
@Autowired
private JdbcTemplate jdbcTemplate;
	@Override
	public int create(Categoria c) {
		String SQL = "INSERT INTO categoria(nomcat) VALUES (?)";
		return jdbcTemplate.update(SQL, c.getNomcat());
	}

	@Override
	public int update(Categoria c) {
		String SQL="UPDATE categoria SET nomcat=? WHERE idcategoria=?";
		return jdbcTemplate.update(SQL, c.getNomcat());
	}

	@Override
	public int update(int id) {
		String SQL="UPDATE categoria SET nomcat=? WHERE idcategoria=?";
		return jdbcTemplate.update(SQL, id);
	}

	@Override
	public int delete(int id) {
		String SQL="DELETE from categoria WHERE idcategoria=?";
		return jdbcTemplate.update(SQL, id);
	}

	@Override
	public Categoria read(int id) {
		String SQL = "SELECT *from categoria where idlibro=?";
		return jdbcTemplate.queryForObject(SQL, new Object[] {id}, new BeanPropertyRowMapper<Categoria>(Categoria.class));
	}

	@Override
	public List<Map<String, Object>> ReadAll(){
		String SQL="SELECT *FROM categoria";
		return jdbcTemplate.queryForList(SQL);
	}

	

}
