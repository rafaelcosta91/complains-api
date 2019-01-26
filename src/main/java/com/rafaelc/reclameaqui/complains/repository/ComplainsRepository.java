package com.rafaelc.reclameaqui.complains.repository;

import org.springframework.data.repository.CrudRepository;

import com.rafaelc.reclameaqui.complains.entity.Complain;

public interface ComplainsRepository extends CrudRepository<Complain, String>{
	
}
