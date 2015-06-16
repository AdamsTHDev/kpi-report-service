package com.adms.kpireport.service.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.adms.entity.KpiResult;
import com.adms.kpireport.dao.KpiResultDao;
import com.adms.kpireport.service.KpiResultService;

@Service("kpiResultService")
@Transactional
public class KpiResultServiceImpl implements KpiResultService {

	@Autowired
	private KpiResultDao kpiResultDao;
	
	public KpiResultServiceImpl() {
		
	}

	public void setKpiResultDao(KpiResultDao kpiResultDao) {
		this.kpiResultDao = kpiResultDao;
	}
	
	@Override
	public List<KpiResult> findAll() throws Exception {
		return kpiResultDao.findAll();
	}

	@Override
	public KpiResult add(KpiResult example, String userLogin) throws Exception {
		return kpiResultDao.save(example);
	}
	
	@Override
	public KpiResult update(KpiResult example, String userLogin) throws Exception {
		return kpiResultDao.save(example);
	}
	
	@Override
	public void delete(KpiResult example) throws Exception {
		kpiResultDao.delete(example.getId());
	}
	
	@Override
	public List<KpiResult> find(KpiResult example) throws Exception {
		return kpiResultDao.find(example);
	}
	
	@Override
	public List<KpiResult> findByHql(String hql, Object...vals) throws Exception {
		return kpiResultDao.findByHQL(hql, vals);
	}

	@Override
	public List<KpiResult> findByNamedQuery(String namedQuery, Object...vals) throws Exception {
		return kpiResultDao.findByNamedQuery(namedQuery, vals);
	}
	
	@Override
	public List<KpiResult> findByCriteria(DetachedCriteria detachedCriteria) throws Exception {
		return kpiResultDao.findByCriteria(detachedCriteria);
	}

	@Override
	public int deleteByHql(String hql, Object... vals) throws Exception {
		return kpiResultDao.bulkUpdate(hql, vals);
	}
	
}
