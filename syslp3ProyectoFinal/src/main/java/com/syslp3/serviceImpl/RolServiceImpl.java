package com.syslp3.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Service;

import com.syslp3.dao.RolDao;
import com.syslp3.entity.Rol;
import com.syslp3.service.RolService;

@Service
public class RolServiceImpl implements RolService {
@Autowired
private RolDao rolDao;
	@Override
	public List<Map<String, Object>> readAll() {
		return rolDao.readAll();
	}
	@Override
	public int create(Rol r) {
		// TODO Auto-generated method stub
		return rolDao.create(r);
	}
	@Override
	public int update(Rol r) {
		// TODO Auto-generated method stub
		return rolDao.update(r);
	}
	@Override
	public int update(int r) {
		// TODO Auto-generated method stub
		return rolDao.update(r);
	}
	@Override
	public int delete(int r) {
		// TODO Auto-generated method stub
		return rolDao.delete(r);
	}
	@Override
	public List<Rol> readHola(int id) {
		// TODO Auto-generated method stub
		return rolDao.readHola(id);
	}
	@Override
	public Map<String, Object> red(int id) {
		// TODO Auto-generated method stub
		return rolDao.red(id);
	}
	@Override
	public List<GrantedAuthority> buscarRolUser(int iduser) {
		// TODO Auto-generated method stub
		return rolDao.buscarRolUser(iduser);
	}
	@Override
	public void convertitMap(Map<String, Object> map) {
		// TODO Auto-generated method stub
		
	}

}
