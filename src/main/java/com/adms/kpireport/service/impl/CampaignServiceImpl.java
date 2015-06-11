package com.adms.kpireport.service.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.adms.entity.Campaign;
import com.adms.kpireport.dao.CampaignDao;
import com.adms.kpireport.service.CampaignService;

@Service("campaignService")
@Transactional
public class CampaignServiceImpl implements CampaignService {

	@Autowired
	private CampaignDao campaignDao;
	
	public CampaignServiceImpl() {
		
	}

	public void setCampaignDao(CampaignDao campaignDao) {
		this.campaignDao = campaignDao;
	}
	
	@Override
	public List<Campaign> findAll() throws Exception {
		return campaignDao.findAll();
	}

	@Override
	public Campaign add(Campaign example, String userLogin) throws Exception {
		return campaignDao.save(example);
	}
	
	@Override
	public Campaign update(Campaign example, String userLogin) throws Exception {
		return campaignDao.save(example);
	}
	
	@Override
	public List<Campaign> find(Campaign example) throws Exception {
		return campaignDao.find(example);
	}
	
	@Override
	public List<Campaign> findByHql(String hql, Object...vals) throws Exception {
		return campaignDao.findByHQL(hql, vals);
	}

	@Override
	public List<Campaign> findByNamedQuery(String namedQuery, Object...vals) throws Exception {
		return campaignDao.findByNamedQuery(namedQuery, vals);
	}
	
	@Override
	public List<Campaign> findByCriteria(DetachedCriteria detachedCriteria) throws Exception {
		return campaignDao.findByCriteria(detachedCriteria);
	}
	
}
