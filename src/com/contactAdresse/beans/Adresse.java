package com.contactAdresse.beans;

public class Adresse {
	
	/** Numéro */
	private String numero;
	/** Rue*/
	private String rue;
	/** Code Postal*/
	private String codePostal;
	/** Ville */
	private String ville;
	
	/**
	 * Constructeur
	 */
	public Adresse() {
	}
	
	/**
	 * Accesseur
	 * 
	 * @return numero
	 */
	public String getNumero() {
		return numero;
	}
	
	/**
	 * Accesseur
	 * 
	 * @param numero : Valeur à affecter à la variable numero
	 */
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	/**
	 * Accesseur
	 * 
	 * @return rue
	 */
	public String getRue() {
		return rue;
	}
	
	/**
	 * Accesseur
	 * 
	 * @param rue : Valeur à affecter à la variable rue
	 */
	public void setRue(String rue) {
		this.rue = rue;
	}
	
	/**
	 * Accesseur
	 * 
	 * @return code Postal
	 */
	public String getCodePostal() {
		return codePostal;
	}
	
	/**
	 * Accesseur
	 * 
	 * @param codePostal : Valeur à affecter à la variable code Postal
	 */
	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}
	
	/**
	 * Accesseur
	 * 
	 * @return ville
	 */
	public String getVille() {
		return ville;
	}
	
	/**
	 * Accesseur
	 * 
	 * @param ville : Valeur à affecter à la variable ville
	 */
	public void setVille(String ville) {
		this.ville = ville;
	}
	

}
