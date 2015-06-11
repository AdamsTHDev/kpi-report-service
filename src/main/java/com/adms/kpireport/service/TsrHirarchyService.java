package com.adms.kpireport.service;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

import com.adms.entity.TsrHirarchy;

public interface TsrHirarchyService {

	public List<TsrHirarchy> findAll() throws Exception;

	public TsrHirarchy add(TsrHirarchy example, String userLogin) throws Exception;

	public TsrHirarchy update(TsrHirarchy example, String userLogin) throws Exception;

	public void delete(TsrHirarchy example) throws Exception;
	
	public List<TsrHirarchy> find(TsrHirarchy example) throws Exception;

	public List<TsrHirarchy> findByHql(String hql, Object...vals) throws Exception;

	public List<TsrHirarchy> findByNamedQuery(String namedQuery, Object...vals) throws Exception;

	public List<TsrHirarchy> findByCriteria(DetachedCriteria detachedCriteria) throws Exception;

}
