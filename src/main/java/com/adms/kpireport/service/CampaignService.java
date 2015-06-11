package com.adms.kpireport.service;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

import com.adms.entity.Campaign;

public interface CampaignService {

	public List<Campaign> findAll() throws Exception;

	public Campaign add(Campaign example, String userLogin) throws Exception;

	public Campaign update(Campaign example, String userLogin) throws Exception;

	public List<Campaign> find(Campaign example) throws Exception;

	public List<Campaign> findByHql(String hql, Object...vals) throws Exception;

	public List<Campaign> findByNamedQuery(String namedQuery, Object...vals) throws Exception;

	public List<Campaign> findByCriteria(DetachedCriteria detachedCriteria) throws Exception;

}
