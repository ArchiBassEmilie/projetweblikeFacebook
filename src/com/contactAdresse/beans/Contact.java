package com.contactAdresse.beans;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/** Contacts*/
public class Contact {
	
	/** Nom */
	private String nom;
	/** Prénom*/
	private String prenom;
	/** Email*/
	private String email;
	/** Date*/
	private Date date;
	/** Actif*/
	private boolean actif;
	/** Adresses */
	private Adresse adresse = new Adresse();
	
	/**
	 * Constructeur
	 */
	public Contact() {
	}
	
	
	/**
	 * Accesseur
	 * 
	 * @return nom
	 */
	public String getNom() {
		return nom;
	}
	
	/**
	 * Accesseur
	 * 
	 * @param nom : Valeur à affecter à la variable nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	/**
	 * Accesseur
	 * 
	 * @return prenom
	 */
	public String getPrenom() {
		return prenom;
	}
	
	/**
	 * Accesseur
	 * 
	 * @param prenom : Valeur à affecter à la variable prenom
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	/**
	 * Accesseur
	 * 
	 * @return email
	 */
	public String getEmail() {
		return email;
	}
	
	/**
	 * Accesseur
	 * 
	 * @param email : Valeur à affecter à la variable email
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	/**
	 * Accesseur
	 * 
	 * @return date
	 */
	public Date getDate() {
		return date;
	}
	
	/**
	 * Accesseur
	 * 
	 * @param date : Valeur à affecter à la variable date
	 */
	public void setDate(Date date) {
		this.date = date;
	}
	
	/**
	 * Accesseur
	 * 
	 * @return actif
	 */
	public boolean isActif() {
		return actif;
	}
	
	/**
	 * Accesseur
	 * 
	 * @param actif : Valeur à affecter à la variable actif
	 */
	public void setActif(boolean actif) {
		this.actif = actif;
	}

	/**
	 * Accesseur
	 * 
	 * @return actif
	 */
	public Adresse getAdresse() {
		return adresse;
	}

	/**
	 * Accesseur
	 * 
	 * @param actif : Valeur à affecter à la variable actif
	 */
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	

}
