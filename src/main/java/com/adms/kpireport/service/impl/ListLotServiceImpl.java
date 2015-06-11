package com.adms.kpireport.service.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.adms.entity.ListLot;
import com.adms.kpireport.dao.ListLotDao;
import com.adms.kpireport.service.ListLotService;

@Service("listLotService")
@Transactional
public class ListLotServiceImpl implements ListLotService {

	@Autowired
	private ListLotDao listLotDao;
	
	public ListLotServiceImpl() {
		
	}

	public void setListLotDao(ListLotDao listLotDao) {
		this.listLotDao = listLotDao;
	}
	
	@Override
	public List<ListLot> findAll() throws Exception {
		return listLotDao.findAll();
	}

	@Override
	public ListLot add(ListLot example, String userLogin) throws Exception {
		return listLotDao.save(example);
	}
	
	@Override
	public ListLot update(ListLot example, String userLogin) throws Exception {
		return listLotDao.save(example);
	}
	
	@Override
	public List<ListLot> find(ListLot example) throws Exception {
		return listLotDao.find(example);
	}
	
	@Override
	public List<ListLot> findByHql(String hql, Object...vals) throws Exception {
		return listLotDao.findByHQL(hql, vals);
	}

	@Override
	public List<ListLot> findByNamedQuery(String namedQuery, Object...vals) throws Exception {
		return listLotDao.findByNamedQuery(namedQuery, vals);
	}
	
	@Override
	public List<ListLot> findByCriteria(DetachedCriteria detachedCriteria) throws Exception {
		return listLotDao.findByCriteria(detachedCriteria);
	}
	
}
