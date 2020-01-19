package com.sakura.poc.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sakura.poc.model.Bond;

@Repository	
public interface BondRepository extends CrudRepository<Bond, String> {

//	public List<Bond> getAll();
}
