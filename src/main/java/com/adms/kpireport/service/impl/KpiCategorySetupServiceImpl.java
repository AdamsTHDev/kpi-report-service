package com.adms.kpireport.service.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.adms.entity.KpiCategorySetup;
import com.adms.kpireport.dao.KpiCategorySetupDao;
import com.adms.kpireport.service.KpiCategorySetupService;

@Service("kpiCategorySetupService")
@Transactional
public class KpiCategorySetupServiceImpl implements KpiCategorySetupService {

	@Autowired
	private KpiCategorySetupDao kpiCategorySetupDao;
	
	public KpiCategorySetupServiceImpl() {
		
	}

	public void setKpiCategorySetupDao(KpiCategorySetupDao kpiCategorySetupDao) {
		this.kpiCategorySetupDao = kpiCategorySetupDao;
	}
	
	@Override
	public List<KpiCategorySetup> findAll() throws Exception {
		return kpiCategorySetupDao.findAll();
	}

	@Override
	public KpiCategorySetup add(KpiCategorySetup example, String userLogin) throws Exception {
		return kpiCategorySetupDao.save(example);
	}
	
	@Override
	public KpiCategorySetup update(KpiCategorySetup example, String userLogin) throws Exception {
		return kpiCategorySetupDao.save(example);
	}
	
	@Override
	public void delete(KpiCategorySetup example) throws Exception {
		kpiCategorySetupDao.delete(example.getId());
	}
	
	@Override
	public List<KpiCategorySetup> find(KpiCategorySetup example) throws Exception {
		return kpiCategorySetupDao.find(example);
	}
	
	@Override
	public List<KpiCategorySetup> findByHql(String hql, Object...vals) throws Exception {
		return kpiCategorySetupDao.findByHQL(hql, vals);
	}

	@Override
	public List<KpiCategorySetup> findByNamedQuery(String namedQuery, Object...vals) throws Exception {
		return kpiCategorySetupDao.findByNamedQuery(namedQuery, vals);
	}
	
	@Override
	public List<KpiCategorySetup> findByCriteria(DetachedCriteria detachedCriteria) throws Exception {
		return kpiCategorySetupDao.findByCriteria(detachedCriteria);
	}
	
}
