package com.syslp3.dao;

import java.util.List;
import java.util.Map;
import com.syslp3.entity.Autor;


public interface AutorDAO {
	
	int create(Autor a);
	int update(Autor a);
	int update(int id);
	int delete(int id);
	Autor read(int id);
	List<Map<String, Object>> readAll();
}
