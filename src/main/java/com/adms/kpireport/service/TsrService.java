package com.adms.kpireport.service;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

import com.adms.entity.Tsr;

public interface TsrService {

	public List<Tsr> findAll() throws Exception;

	public Tsr add(Tsr example, String userLogin) throws Exception;

	public Tsr update(Tsr example, String userLogin) throws Exception;
	
	public List<Tsr> find(Tsr example) throws Exception;

	public List<Tsr> findByHql(String hql, Object...vals) throws Exception;

	public List<Tsr> findByNamedQuery(String namedQuery, Object...vals) throws Exception;

	public List<Tsr> findByCriteria(DetachedCriteria detachedCriteria) throws Exception;

}
