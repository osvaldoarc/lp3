package com.syslp3.service;

import java.util.List;
import java.util.Map;

import com.syslp3.entity.Categoria;

public interface CategoriaService {

	int create(Categoria c);
	int update(Categoria c);
	int update(int id);
	int delete(int id);
	Categoria read(int id);
    List<Map<String, Object>> ReadAll();
}
