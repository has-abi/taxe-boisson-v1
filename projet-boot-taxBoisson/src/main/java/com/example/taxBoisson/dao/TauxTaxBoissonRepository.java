package com.example.taxBoisson.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.taxBoisson.bean.TauxTaxeBoisson;

@Repository
public interface TauxTaxBoissonRepository extends JpaRepository<TauxTaxeBoisson, Long>{
	
}
