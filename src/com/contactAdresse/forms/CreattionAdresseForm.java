package com.contactAdresse.forms;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.contactAdresse.beans.Adresse;

public class CreattionAdresseForm {

	private static final String CHAMP_NUMERO = "numero";
	private static final String CHAMP_RUE = "rue";
	private static final String CHAMP_CODEPOSTAL = "codePostal";
	private static final String CHAMP_VILLE = "ville";

	/* Résultat */
	private String resultat;
	/* Erreurs */
	private Map<String, String> erreurs = new HashMap<String, String>();
	
	/**
	 * Accesseur
	 * 
	 * @return erreurs
	 */
	public Map<String, String> getErreurs() {
		return erreurs;
	}
	
	/**
	 * Accesseur
	 * 
	 * @return resultat
	 */
	public String getResultat() {
		return resultat;
	}

	/** Création d'une adresse */
	public Adresse creerAdresse(HttpServletRequest request) {
		
		String a_numero = getValeurChamp(request, CHAMP_NUMERO);
		String a_rue = getValeurChamp(request, CHAMP_RUE);
		String a_codePostal = getValeurChamp(request, CHAMP_CODEPOSTAL);
		String a_ville = getValeurChamp(request, CHAMP_VILLE);

		Adresse adresse = new Adresse();

		/* On vérifie la validité du numéro entré avant de le prendre en compte */
		try {
			validationNumero(a_numero);
		} catch (Exception e) {
			setErreur(CHAMP_NUMERO, e.getMessage());
		}
		adresse.setNumero(a_numero);

		/*
		 * On vérifie la validité du nom de la rue entré avant de le prendre en
		 * compte
		 */
		try {
			validationRue(a_rue);
		} catch (Exception e) {
			setErreur(CHAMP_RUE, e.getMessage());
		}
		adresse.setRue(a_rue);

		/*
		 * On vérifie la validité du code postal entré avant de le prendre en
		 * compte
		 */
		try {
			validationCodePostal(a_codePostal);
		} catch (Exception e) {
			setErreur(CHAMP_CODEPOSTAL, e.getMessage());
		}
		adresse.setCodePostal(a_codePostal);

		/*
		 * On vérifie la validité du nom de la ville avant de le prendre en
		 * compte
		 */
		try {
			validationVille(a_ville);
		} catch (Exception e) {
			setErreur(CHAMP_VILLE, e.getMessage());
		}
		adresse.setVille(a_ville);

		/*
		 * On vérifie s'il y a eu une erreur dans les opérations de validation
		 * faites auparavant
		 */
		if (erreurs.isEmpty()) {
			resultat = "Succès de la création de l'adresse.";
		} else {
			resultat = "Échec de la création de l'adresse.";
		}

		return adresse;
	}

	/* méthode de validation du numéro de la rue */
	private void validationNumero(String numero) throws Exception {
		if (numero != null) {
			if (numero.length() < 0) {
				throw new Exception("Le numéro d'adresse doit être > 0 .");
			}
		} 
		/*else {
			throw new Exception("Merci d'entrer un numéro d'adresse.");
		}*/
	}

	/* méthode de validation du nom de la rue */
	private void validationRue(String rue) throws Exception {
		if (rue != null && rue.length() < 2) {
			throw new Exception(
					"Le nom de la rue que vous avez entré doit contenir au moins 2 caractères.");
		}
	}

	/* méthode de validation du code postal de la ville */
	private void validationCodePostal(String codePostal) throws Exception {
		if (codePostal != null) {
			if (codePostal.length() <= 4) {
				throw new Exception(
						"Le code Postal que vous avez entré n'est pas valide.");
			}
		}
		/*else {
			throw new Exception("Merci d'entrer un code postal.");
		}*/
	}

	/* méthode de validation du nom de la ville */
	private void validationVille(String ville) throws Exception {
		if (ville != null && ville.length() < 2) {
			throw new Exception(
					"Le nom de la ville que vous avez entré doit contenir au moins 2 caractères.");
		}
	}

	/*
	 * Ajoute un message correspondant au champ spécifié à la map des erreurs.
	 */
	private void setErreur(String champ, String message) {
		erreurs.put(champ, message);
	}

	/*
	 * Méthode utilitaire qui retourne null si un champ est vide, et son contenu
	 * sinon.
	 */
	private static String getValeurChamp(HttpServletRequest request,
			String nomChamp) {
		String valeur = request.getParameter(nomChamp);
		if (valeur == null || valeur.trim().length() == 0) {
			return null;
		} else {
			return valeur;
		}
	}
}