package com.adms.kpireport.service.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.adms.entity.Tsr;
import com.adms.kpireport.dao.TsrDao;
import com.adms.kpireport.service.TsrService;

@Service("tsrService")
@Transactional
public class TsrServiceImpl implements TsrService {

	@Autowired
	private TsrDao tsrDao;
	
	public TsrServiceImpl() {
		
	}

	public void setTsrDao(TsrDao tsrDao) {
		this.tsrDao = tsrDao;
	}
	
	@Override
	public List<Tsr> findAll() throws Exception {
		return tsrDao.findAll();
	}

	@Override
	public Tsr add(Tsr example, String userLogin) throws Exception {
		return tsrDao.save(example);
	}
	
	@Override
	public Tsr update(Tsr example, String userLogin) throws Exception {
		return tsrDao.save(example);
	}
	
	@Override
	public List<Tsr> find(Tsr example) throws Exception {
		return tsrDao.find(example);
	}
	
	@Override
	public List<Tsr> findByHql(String hql, Object...vals) throws Exception {
		return tsrDao.findByHQL(hql, vals);
	}

	@Override
	public List<Tsr> findByNamedQuery(String namedQuery, Object...vals) throws Exception {
		return tsrDao.findByNamedQuery(namedQuery, vals);
	}
	
	@Override
	public List<Tsr> findByCriteria(DetachedCriteria detachedCriteria) throws Exception {
		return tsrDao.findByCriteria(detachedCriteria);
	}
	
}
