package com.contactAdresse.forms;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.contactAdresse.beans.Adresse;
import com.contactAdresse.beans.Contact;

public final class CreationContactForm {

	private static final String CHAMP_NOM = "nomContact";
	private static final String CHAMP_PRENOM = "prenomContact";
	private static final String CHAMP_DATE = "dateContact";
	private static final String CHAMP_EMAIL = "emailContact";
	private static final String CHAMP_ACTIF = "actif";

	private static final String FORMAT_DATE = "dd/MM/yyyy HH:mm:ss";
	/** Résultat */
	private String resultat;

	/** Gestion des erreurs */
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

	public Contact creerContact(HttpServletRequest request) {

		CreattionAdresseForm adresseForm = new CreattionAdresseForm();
		Adresse adresse = adresseForm.creerAdresse(request);

		erreurs = adresseForm.getErreurs();

		String nom = getValeurChamp(request, CHAMP_NOM);
		String prenom = getValeurChamp(request, CHAMP_NOM);
		String email = getValeurChamp(request, CHAMP_EMAIL);
		String actif = getValeurChamp(request, CHAMP_ACTIF);
		

		Contact contact = new Contact();
		contact.setAdresse(adresse);


		try {
			validationNom(nom);
		} catch (Exception e) {
			setErreur(CHAMP_NOM, e.getMessage());
		}
		contact.setNom(nom);

		try {
			validationPrenom(prenom);
		} catch (Exception e) {
			setErreur(CHAMP_PRENOM, e.getMessage());
		}
		contact.setPrenom(prenom);

		try {
			validationEmail(email);
		} catch (Exception e) {
			setErreur(CHAMP_EMAIL, e.getMessage());
		}
		contact.setEmail(email);
		
		try {
			validationEmail(actif);
		} catch (Exception e) {
			setErreur(CHAMP_ACTIF, e.getMessage());
		}
		contact.setEmail(actif);

		if (erreurs.isEmpty()) {
			resultat = "Succès de la création du contact.";
		} else {
			resultat = "Échec de la création du contact.";
		}

		return contact;
	}

	private void validationNom(String nom) throws Exception {
		if (nom != null) {
			if (nom.length() < 2) {
				throw new Exception(
						"Le nom du contact doit contenir au moins 2 caractères.");
			}
		} else {
			throw new Exception("Merci d'entrer le nom du contact.");
		}
	}

	private void validationPrenom(String prenom) throws Exception {
		if (prenom != null && prenom.length() < 2) {
			throw new Exception(
					"Le prénom d'utilisateur doit contenir au moins 2 caractères.");
		}
	}

	private void validationEmail(String email) throws Exception {
		if (email != null
				&& !email.matches("([^.@]+)(\\.[^.@]+)*@([^.@]+\\.)+([^.@]+)")) {
			throw new Exception("Merci de saisir une adresse mail valide.");
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