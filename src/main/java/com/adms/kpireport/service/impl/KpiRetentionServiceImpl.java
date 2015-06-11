package com.adms.kpireport.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.adms.entity.bean.KpiRetention;
import com.adms.kpireport.dao.KpiRetentionDao;
import com.adms.kpireport.service.KpiRetentionService;

@Service("kpiRetentionService")
@Transactional
public class KpiRetentionServiceImpl implements KpiRetentionService {

	@Autowired
	private KpiRetentionDao kpiRetentionDao;
	
	public KpiRetentionServiceImpl() {
		
	}

	public void setKpiRetentionDao(KpiRetentionDao kpiRetentionDao) {
		this.kpiRetentionDao = kpiRetentionDao;
	}

	@Override
	public List<KpiRetention> findByNamedQuery(String namedQuery, Object... vals) throws Exception {
		return kpiRetentionDao.findByNamedQuery(namedQuery, vals);
	}
	
}
