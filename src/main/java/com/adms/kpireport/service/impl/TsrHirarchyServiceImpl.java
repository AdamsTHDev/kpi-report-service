package com.adms.kpireport.service.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.adms.entity.TsrHirarchy;
import com.adms.kpireport.dao.TsrHirarchyDao;
import com.adms.kpireport.service.TsrHirarchyService;

@Service("tsrHirarchyService")
@Transactional
public class TsrHirarchyServiceImpl implements TsrHirarchyService {

	@Autowired
	private TsrHirarchyDao tsrHirarchyDao;
	
	public TsrHirarchyServiceImpl() {
		
	}

	public void setTsrHirarchyDao(TsrHirarchyDao tsrHirarchyDao) {
		this.tsrHirarchyDao = tsrHirarchyDao;
	}
	
	@Override
	public List<TsrHirarchy> findAll() throws Exception {
		return tsrHirarchyDao.findAll();
	}

	@Override
	public TsrHirarchy add(TsrHirarchy example, String userLogin) throws Exception {
		return tsrHirarchyDao.save(example);
	}
	
	@Override
	public TsrHirarchy update(TsrHirarchy example, String userLogin) throws Exception {
		return tsrHirarchyDao.save(example);
	}
	
	@Override
	public List<TsrHirarchy> find(TsrHirarchy example) throws Exception {
		return tsrHirarchyDao.find(example);
	}
	
	@Override
	public List<TsrHirarchy> findByHql(String hql, Object...vals) throws Exception {
		return tsrHirarchyDao.findByHQL(hql, vals);
	}

	@Override
	public List<TsrHirarchy> findByNamedQuery(String namedQuery, Object...vals) throws Exception {
		return tsrHirarchyDao.findByNamedQuery(namedQuery, vals);
	}
	
	@Override
	public List<TsrHirarchy> findByCriteria(DetachedCriteria detachedCriteria) throws Exception {
		return tsrHirarchyDao.findByCriteria(detachedCriteria);
	}

	@Override
	public void delete(TsrHirarchy example) throws Exception {
		tsrHirarchyDao.delete(example.getId());
	}
	
}
