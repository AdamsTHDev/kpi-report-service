package com.adms.kpireport.service;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

import com.adms.entity.TsrHierarchy;

public interface TsrHierarchyService {

	public List<TsrHierarchy> findAll() throws Exception;

	public TsrHierarchy add(TsrHierarchy example, String userLogin) throws Exception;

	public TsrHierarchy update(TsrHierarchy example, String userLogin) throws Exception;

	public void delete(TsrHierarchy example) throws Exception;
	
	public List<TsrHierarchy> find(TsrHierarchy example) throws Exception;

	public List<TsrHierarchy> findByHql(String hql, Object...vals) throws Exception;

	public List<TsrHierarchy> findByNamedQuery(String namedQuery, Object...vals) throws Exception;

	public List<TsrHierarchy> findByCriteria(DetachedCriteria detachedCriteria) throws Exception;

}
