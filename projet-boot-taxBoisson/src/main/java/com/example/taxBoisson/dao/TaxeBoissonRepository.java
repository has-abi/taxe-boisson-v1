package com.example.taxBoisson.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.taxBoisson.bean.TaxeBoisson;
@Repository
public interface TaxeBoissonRepository extends JpaRepository<TaxeBoisson, Long>{
	public List<TaxeBoisson> findByRedevableRef(String ref);
	public List<TaxeBoisson> findByLocaleReference(String reference);
}
