package com.syslp3.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syslp3.dao.AutorDAO;
import com.syslp3.entity.Autor;
import com.syslp3.service.AutorService;

@Service
public class AutorServiceImpl implements AutorService{
@Autowired
private AutorDAO autorDAO;
	@Override
	public int create(Autor a) {
		// TODO Auto-generated method stub
		return autorDAO.create(a);
	}

	@Override
	public int update(Autor a) {
		// TODO Auto-generated method stub
		return autorDAO.update(a);
	}

	@Override
	public int update(int id) {
		// TODO Auto-generated method stub
		return autorDAO.update(id);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return autorDAO.delete(id);
	}

	@Override
	public Autor read(int id) {
		// TODO Auto-generated method stub
		return autorDAO.read(id);
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return autorDAO.readAll();
	}

}
