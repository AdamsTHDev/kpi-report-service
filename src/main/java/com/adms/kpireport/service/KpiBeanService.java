package com.adms.kpireport.service;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

import com.adms.entity.bean.KpiBean;

public interface KpiBeanService {

	public List<KpiBean> findAll() throws Exception;

	public KpiBean add(KpiBean example, String userLogin) throws Exception;

	public KpiBean update(KpiBean example, String userLogin) throws Exception;
	
	public List<KpiBean> find(KpiBean example) throws Exception;

	public List<KpiBean> findByHql(String hql, Object...vals) throws Exception;

	public List<KpiBean> findByNamedQuery(String namedQuery, Object...vals) throws Exception;

	public List<KpiBean> findByCriteria(DetachedCriteria detachedCriteria) throws Exception;

}
