package com.syslp3.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syslp3.dao.LibroDAO;
import com.syslp3.entity.Libro;
import com.syslp3.service.LibroService;

@Service
public class LibroServiceImpl implements LibroService{
@Autowired
private LibroDAO libroDAO;
	@Override
	public int create(Libro l) {
		// TODO Auto-generated method stub
		return libroDAO.create(l);
	}

	@Override
	public int update(Libro l) {
		// TODO Auto-generated method stub
		return libroDAO.update(l);
	}

	@Override
	public int update(int id) {
		// TODO Auto-generated method stub
		return libroDAO.update(id);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return libroDAO.delete(id);
	}

	@Override
	public Libro read(int id) {
		// TODO Auto-generated method stub
		return libroDAO.read(id);
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return libroDAO.readAll();
	}

}
