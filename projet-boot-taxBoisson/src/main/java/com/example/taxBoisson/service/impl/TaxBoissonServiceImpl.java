package com.example.taxBoisson.service.impl;

import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.taxBoisson.bean.TaxeBoisson;
import com.example.taxBoisson.dao.TaxeBoissonRepository;
import com.example.taxBoisson.service.TaxBoissonService;
@Service
public class TaxBoissonServiceImpl implements TaxBoissonService{
	
	@Autowired
	private TaxeBoissonRepository taxeBoissonRepository;
	private Tools tools = new Tools() ;
	
	@Override
	public int save(TaxeBoisson taxBoisson) {
		if(taxBoisson.getRedevable().getRef() == null || taxBoisson.getRedevable().getRef()== "" ||
				taxBoisson.getLocale().getReference() == null || taxBoisson.getLocale().getReference()=="" ||
				taxBoisson.getAnnee() == 0 || taxBoisson.getTrim() == 0) {
			return -1;
		}else if(taxBoisson.getProfit()==0){
			return -2;
		}else {
			
		}
		return 0;
	}

	@Override
	public List<TaxeBoisson> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TaxeBoisson> findByRedevableRef(String ref) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TaxeBoisson> findByLocaleReference(String reference) {
		// TODO Auto-generated method stub
		return null;
	}

}
