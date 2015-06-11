package com.adms.kpireport.service.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.adms.entity.TsrTracking;
import com.adms.kpireport.dao.TsrTrackingDao;
import com.adms.kpireport.service.TsrTrackingService;

@Service("tsrTrackingService")
@Transactional
public class TsrTrackingServiceImpl implements TsrTrackingService {

	@Autowired
	private TsrTrackingDao tsrTrackingDao;
	
	public TsrTrackingServiceImpl() {
		
	}

	public void setTsrTrackingDao(TsrTrackingDao tsrTrackingDao) {
		this.tsrTrackingDao = tsrTrackingDao;
	}
	
	@Override
	public List<TsrTracking> findAll() throws Exception {
		return tsrTrackingDao.findAll();
	}

	@Override
	public TsrTracking add(TsrTracking example, String userLogin) throws Exception {
		return tsrTrackingDao.save(example);
	}
	
	@Override
	public TsrTracking update(TsrTracking example, String userLogin) throws Exception {
		return tsrTrackingDao.save(example);
	}
	
	@Override
	public List<TsrTracking> find(TsrTracking example) throws Exception {
		return tsrTrackingDao.find(example);
	}
	
	@Override
	public List<TsrTracking> findByHql(String hql, Object...vals) throws Exception {
		return tsrTrackingDao.findByHQL(hql, vals);
	}

	@Override
	public List<TsrTracking> findByNamedQuery(String namedQuery, Object...vals) throws Exception {
		return tsrTrackingDao.findByNamedQuery(namedQuery, vals);
	}
	
	@Override
	public List<TsrTracking> findByCriteria(DetachedCriteria detachedCriteria) throws Exception {
		return tsrTrackingDao.findByCriteria(detachedCriteria);
	}
	
}
