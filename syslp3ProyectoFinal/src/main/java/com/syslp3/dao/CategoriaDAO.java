package com.syslp3.dao;

import java.util.List;
import java.util.Map;

import com.syslp3.entity.Categoria;

public interface CategoriaDAO {
	int create(Categoria c);
	int update(Categoria c);
	int update(int id);
	int delete(int id);
	Categoria read(int id);
    List<Map<String, Object>> ReadAll();
}
