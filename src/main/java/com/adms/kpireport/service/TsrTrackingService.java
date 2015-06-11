package com.adms.kpireport.service;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

import com.adms.entity.TsrTracking;

public interface TsrTrackingService {

	public List<TsrTracking> findAll() throws Exception;

	public TsrTracking add(TsrTracking example, String userLogin) throws Exception;

	public TsrTracking update(TsrTracking example, String userLogin) throws Exception;

	public List<TsrTracking> find(TsrTracking example) throws Exception;

	public List<TsrTracking> findByHql(String hql, Object...vals) throws Exception;

	public List<TsrTracking> findByNamedQuery(String namedQuery, Object...vals) throws Exception;

	public List<TsrTracking> findByCriteria(DetachedCriteria detachedCriteria) throws Exception;

}
