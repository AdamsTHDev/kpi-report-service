package com.adms.kpireport.service.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.adms.entity.bean.KpiBean;
import com.adms.kpireport.dao.KpiBeanDao;
import com.adms.kpireport.service.KpiBeanService;

@Service("kpiBeanService")
@Transactional
public class KpiBeanServiceImpl implements KpiBeanService {

	@Autowired
	private KpiBeanDao kpiBeanDao;
	
	public KpiBeanServiceImpl() {
		
	}

	public void setKpiBeanDao(KpiBeanDao kpiBeanDao) {
		this.kpiBeanDao = kpiBeanDao;
	}
	
	@Override
	public List<KpiBean> findAll() throws Exception {
		return kpiBeanDao.findAll();
	}

	@Override
	public KpiBean add(KpiBean example, String userLogin) throws Exception {
		return kpiBeanDao.save(example);
	}
	
	@Override
	public KpiBean update(KpiBean example, String userLogin) throws Exception {
		return kpiBeanDao.save(example);
	}
	
	@Override
	public List<KpiBean> find(KpiBean example) throws Exception {
		return kpiBeanDao.find(example);
	}
	
	@Override
	public List<KpiBean> findByHql(String hql, Object...vals) throws Exception {
		return kpiBeanDao.findByHQL(hql, vals);
	}

	@Override
	public List<KpiBean> findByNamedQuery(String namedQuery, Object...vals) throws Exception {
		return kpiBeanDao.findByNamedQuery(namedQuery, vals);
	}
	
	@Override
	public List<KpiBean> findByCriteria(DetachedCriteria detachedCriteria) throws Exception {
		return kpiBeanDao.findByCriteria(detachedCriteria);
	}
	
}
