package com.adms.kpireport.service;

import java.util.List;

import com.adms.entity.bean.KpiRetention;

public interface KpiRetentionService {

	public List<KpiRetention> findByNamedQuery(String namedQuery, Object...vals) throws Exception;

}
