package com.adms.kpireport.service;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

import com.adms.entity.KpiCategorySetup;

public interface KpiCategorySetupService {

	public List<KpiCategorySetup> findAll() throws Exception;

	public KpiCategorySetup add(KpiCategorySetup example, String userLogin) throws Exception;

	public KpiCategorySetup update(KpiCategorySetup example, String userLogin) throws Exception;
	
	public void delete(KpiCategorySetup example) throws Exception;

	public List<KpiCategorySetup> find(KpiCategorySetup example) throws Exception;

	public List<KpiCategorySetup> findByHql(String hql, Object...vals) throws Exception;

	public List<KpiCategorySetup> findByNamedQuery(String namedQuery, Object...vals) throws Exception;

	public List<KpiCategorySetup> findByCriteria(DetachedCriteria detachedCriteria) throws Exception;
	
	public int deleteByHql(String hql, Object... vals) throws Exception;

}
