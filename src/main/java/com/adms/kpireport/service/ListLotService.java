package com.adms.kpireport.service;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

import com.adms.entity.ListLot;

public interface ListLotService {

	public List<ListLot> findAll() throws Exception;

	public ListLot add(ListLot example, String userLogin) throws Exception;

	public ListLot update(ListLot example, String userLogin) throws Exception;

	public List<ListLot> find(ListLot example) throws Exception;

	public List<ListLot> findByHql(String hql, Object...vals) throws Exception;

	public List<ListLot> findByNamedQuery(String namedQuery, Object...vals) throws Exception;

	public List<ListLot> findByCriteria(DetachedCriteria detachedCriteria) throws Exception;

}
