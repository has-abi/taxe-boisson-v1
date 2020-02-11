package com.example.taxBoisson.bean;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class TypeRedevable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String libelle;
	@OneToMany
	private List<Redevable> redevables;
	
	public List<Redevable> getRedevables() {
		return redevables;
	}
	public void setRedevables(List<Redevable> redevables) {
		this.redevables = redevables;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	@Override
	public String toString() {
		return "TypeRedevable [id=" + id + ", libelle=" + libelle + ", redevables=" + redevables + "]";
	}
	public TypeRedevable(long id, String libelle, List<Redevable> redevables) {
		super();
		this.id = id;
		this.libelle = libelle;
		this.redevables = redevables;
	}
	public TypeRedevable() {
		super();
		// TODO Auto-generated constructor stub
	}

	}


