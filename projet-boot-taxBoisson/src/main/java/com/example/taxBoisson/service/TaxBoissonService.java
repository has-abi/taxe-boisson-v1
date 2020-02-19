package com.example.taxBoisson.service;

import java.util.List;



import com.example.taxBoisson.bean.TaxeBoisson;

public interface TaxBoissonService{
	public int save(TaxeBoisson taxBoisson);
	public List<TaxeBoisson> findAll();
	public List<TaxeBoisson> findByRedevableRef(String ref);
	public List<TaxeBoisson> findByLocaleReference(String reference);
	

}
