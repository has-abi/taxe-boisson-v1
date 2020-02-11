package com.example.taxBoisson.bean;

import java.util.List;
import java.util.Locale;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class Redevable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String nom;
	@ManyToOne
	private TypeRedevable typeRedevable;
	@OneToMany
	private List<Locale> locales;
	private String ref;  
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public TypeRedevable getTypeRedevable() {
		return typeRedevable;
	}
	public void setTypeRedevable(TypeRedevable typeRedevable) {
		this.typeRedevable = typeRedevable;
	}
	public List<Locale> getLocales() {
		return locales;
	}
	public void setLocales(List<Locale> locales) {
		this.locales = locales;
	}
	public String getRef() {
		return ref;
	}
	public void setRef(String ref) {
		this.ref = ref;
	}
	
	
	public Redevable(long id, String nom, TypeRedevable typeRedevable, List<Locale> locales, String ref) {
		super();
		this.id = id;
		this.nom = nom;
		this.typeRedevable = typeRedevable;
		this.locales = locales;
		this.ref = ref;
	}
	
	public Redevable() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Redevale [id=" + id + ", nom=" + nom + ", typeRedevable=" + typeRedevable + ", locales=" + locales
				+ ", ref=" + ref + ", getId()=" + getId() + ", getNom()=" + getNom() + ", getTypeRedevable()="
				+ getTypeRedevable() + ", getLocales()=" + getLocales() + ", getRef()=" + getRef() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
}
