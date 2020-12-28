package com.syslp3.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syslp3.dao.CategoriaDAO;
import com.syslp3.entity.Categoria;
import com.syslp3.service.CategoriaService;

@Service
public class CategoriaServiceImpl implements CategoriaService {
@Autowired
private CategoriaDAO categoriaDAO;
	@Override
	public int create(Categoria c) {
		// TODO Auto-generated method stub
		return categoriaDAO.create(c);
	}

	@Override
	public int update(Categoria c) {
		// TODO Auto-generated method stub
		return categoriaDAO.update(c);
	}

	@Override
	public int update(int id) {
		// TODO Auto-generated method stub
		return categoriaDAO.update(id);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return categoriaDAO.delete(id);
	}

	@Override
	public Categoria read(int id) {
		// TODO Auto-generated method stub
		return categoriaDAO.read(id);
	}

	@Override
	public List<Map<String, Object>> ReadAll() {
		// TODO Auto-generated method stub
		return categoriaDAO.ReadAll();
	}

}
