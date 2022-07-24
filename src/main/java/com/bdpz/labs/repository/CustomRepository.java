package com.bdpz.labs.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.transaction.annotation.Transactional;

import com.bdpz.labs.model.CustomEntity;
import com.bdpz.labs.service.CustomService;
import com.bdpz.labs.utils.ApplicationContextUtil;

@NoRepositoryBean
public interface CustomRepository<T extends CustomEntity<ID>, ID extends Serializable>
		extends JpaRepository<T, ID> {

	@Transactional
	default void saveAndNotify(T entity) {
		customService().notify("Created object id {}", save(entity));
	}

	private CustomService customService() {
		return (CustomService) ApplicationContextUtil.getApplicationContext().getBean(CustomService.class);
	}

}
