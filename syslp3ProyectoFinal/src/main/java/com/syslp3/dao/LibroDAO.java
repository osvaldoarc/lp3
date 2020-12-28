package com.syslp3.dao;

import java.util.List;
import java.util.Map;

import com.syslp3.entity.Libro;


public interface LibroDAO {
	int create(Libro l);
	int update(Libro l);
	int update(int id);
	int delete(int id);
	Libro read(int id);
	List<Map<String, Object>> readAll();
}
