package com.adms.kpireport.service;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

import com.adms.entity.KpiResult;

public interface KpiResultService {

	public List<KpiResult> findAll() throws Exception;

	public KpiResult add(KpiResult example, String userLogin) throws Exception;

	public KpiResult update(KpiResult example, String userLogin) throws Exception;
	
	public void delete(KpiResult example) throws Exception;
	
	public List<KpiResult> find(KpiResult example) throws Exception;

	public List<KpiResult> findByHql(String hql, Object...vals) throws Exception;

	public List<KpiResult> findByNamedQuery(String namedQuery, Object...vals) throws Exception;

	public List<KpiResult> findByCriteria(DetachedCriteria detachedCriteria) throws Exception;
	
	public int deleteByHql(String hql, Object... vals) throws Exception;

}
