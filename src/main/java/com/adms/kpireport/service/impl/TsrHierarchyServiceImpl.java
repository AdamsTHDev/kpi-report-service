package com.adms.kpireport.service.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.adms.entity.TsrHierarchy;
import com.adms.kpireport.dao.TsrHierarchyDao;
import com.adms.kpireport.service.TsrHierarchyService;

@Service("tsrHierarchyService")
@Transactional
public class TsrHierarchyServiceImpl implements TsrHierarchyService {

	@Autowired
	private TsrHierarchyDao tsrHierarchyDao;
	
	public TsrHierarchyServiceImpl() {
		
	}

	public void setTsrHierarchyDao(TsrHierarchyDao tsrHierarchyDao) {
		this.tsrHierarchyDao = tsrHierarchyDao;
	}
	
	@Override
	public List<TsrHierarchy> findAll() throws Exception {
		return tsrHierarchyDao.findAll();
	}

	@Override
	public TsrHierarchy add(TsrHierarchy example, String userLogin) throws Exception {
		return tsrHierarchyDao.save(example);
	}
	
	@Override
	public TsrHierarchy update(TsrHierarchy example, String userLogin) throws Exception {
		return tsrHierarchyDao.save(example);
	}
	
	@Override
	public List<TsrHierarchy> find(TsrHierarchy example) throws Exception {
		return tsrHierarchyDao.find(example);
	}
	
	@Override
	public List<TsrHierarchy> findByHql(String hql, Object...vals) throws Exception {
		return tsrHierarchyDao.findByHQL(hql, vals);
	}

	@Override
	public List<TsrHierarchy> findByNamedQuery(String namedQuery, Object...vals) throws Exception {
		return tsrHierarchyDao.findByNamedQuery(namedQuery, vals);
	}
	
	@Override
	public List<TsrHierarchy> findByCriteria(DetachedCriteria detachedCriteria) throws Exception {
		return tsrHierarchyDao.findByCriteria(detachedCriteria);
	}

	@Override
	public void delete(TsrHierarchy example) throws Exception {
		tsrHierarchyDao.delete(example.getId());
	}
	
}
