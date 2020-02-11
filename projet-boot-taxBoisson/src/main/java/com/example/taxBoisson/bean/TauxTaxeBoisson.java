package com.example.taxBoisson.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class TauxTaxeBoisson {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@ManyToOne
	private Categorie categorie;
	private int pourcentage;
	public Categorie getCategorie() {
		return categorie;
	}
	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
	public int getPourcentage() {
		return pourcentage;
	}
	public void setPourcentage(int pourcentage) {
		this.pourcentage = pourcentage;
	}
	public TauxTaxeBoisson() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TauxTaxeBoisson(Categorie categorie, int pourcentage) {
		super();
		this.categorie = categorie;
		this.pourcentage = pourcentage;
	}
	@Override
	public String toString() {
		return "TauxTaxeBoisson [categorie=" + categorie + ", pourcentage=" + pourcentage + "]";
	}
	
	
}
