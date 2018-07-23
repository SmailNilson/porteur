/**
 * 
 */
package com.bnpparibas.dsibddf.domain.entity;

import java.util.List;

/**
 * @author ADMINIBM
 *
 */
public class ContextePorteur {
	 /**
     * Contient le code Retour de l appel Goal Pour la recuperation du contexte porteur
     */
    private int codeRetour;

    /**
     * Contient le libelle Retour de l appel Goal Pour la recuperation du contexte porteur
     */
    private String libelleRetour;

    /**
     * Pour savoir s il s agit d une erreur Goal lors du une requete test-service
     */
    private boolean isGoalError;

    private String stackTraceGoalError;

    /**
     * Contient le profil du porteur de carte. peut prendre comme valeur NON_RENSEIGNE, PARTICULIER, PROFESSIONNEL_ENTREPRISE (valeurs constantes definies dans
     * la classe TypeProfile).
     */
    private int profile;

    /**
     * Contient le profil du porteur de carte. peut prendre comme valeur NON_RENSEIGNE, PARTICULIER, PROFESSIONNEL_ENTREPRISE (valeurs constantes definies dans
     * la classe TypeProfile).
     */
    private int profileCanal;

    /**
     * Tableau de booleans de taille fixe (64 elements). Chaque element du tableau determine le droit sur une operation specifique. Pour chaque element
     * correspond un indice determine par une constante de la classe Droits. (la valeur des droits est comprise entre 0 et 63).
     */
    private boolean[] droitsGlobaux = new boolean[64];

    /**
     * Parametre definissant la langue d affichage. Par defaut, ce sera fr-FR. Il ne prendra pas d autres valeurs pour l instant.
     */
    private String langue;

    /**
     * Correspond a la carte du porteur.
     */
    //private Carte carte;

    /**
     * Correspond a l etat (de la machine a etat) du porteur.
     */
  //  private Etat etat;

    /**
     * Correspond a la liste des comptes rattaches au porteur.
     */
    private List<Compte> listeComptes;

    /**
     * Intitule courrier du porteur de carte (Ligne 1)
     */
    private String intitCourrierPorteur1;

    /**
     * Intitule courrier du porteur de carte (Ligne 2)
     */
    private String intitCourrierPorteur2;

    /**
     * Le nom de la Banque (valeurs : 0 --> BDDF 1 --> BD)
     */
    private int enseignePorteur;

	/**
	 * @return the codeRetour
	 */
	public int getCodeRetour() {
		return codeRetour;
	}

	/**
	 * @param codeRetour the codeRetour to set
	 */
	public void setCodeRetour(int codeRetour) {
		this.codeRetour = codeRetour;
	}

	/**
	 * @return the libelleRetour
	 */
	public String getLibelleRetour() {
		return libelleRetour;
	}

	/**
	 * @param libelleRetour the libelleRetour to set
	 */
	public void setLibelleRetour(String libelleRetour) {
		this.libelleRetour = libelleRetour;
	}

	/**
	 * @return the isGoalError
	 */
	public boolean isGoalError() {
		return isGoalError;
	}

	/**
	 * @param isGoalError the isGoalError to set
	 */
	public void setGoalError(boolean isGoalError) {
		this.isGoalError = isGoalError;
	}

	/**
	 * @return the stackTraceGoalError
	 */
	public String getStackTraceGoalError() {
		return stackTraceGoalError;
	}

	/**
	 * @param stackTraceGoalError the stackTraceGoalError to set
	 */
	public void setStackTraceGoalError(String stackTraceGoalError) {
		this.stackTraceGoalError = stackTraceGoalError;
	}

	/**
	 * @return the profile
	 */
	public int getProfile() {
		return profile;
	}

	/**
	 * @param profile the profile to set
	 */
	public void setProfile(int profile) {
		this.profile = profile;
	}

	/**
	 * @return the profileCanal
	 */
	public int getProfileCanal() {
		return profileCanal;
	}

	/**
	 * @param profileCanal the profileCanal to set
	 */
	public void setProfileCanal(int profileCanal) {
		this.profileCanal = profileCanal;
	}

	/**
	 * @return the droitsGlobaux
	 */
	public boolean[] getDroitsGlobaux() {
		return droitsGlobaux;
	}

	/**
	 * @param droitsGlobaux the droitsGlobaux to set
	 */
	public void setDroitsGlobaux(boolean[] droitsGlobaux) {
		this.droitsGlobaux = droitsGlobaux;
	}

	/**
	 * @return the langue
	 */
	public String getLangue() {
		return langue;
	}

	/**
	 * @param langue the langue to set
	 */
	public void setLangue(String langue) {
		this.langue = langue;
	}

	/**
	 * @return the listeComptes
	 */
	public List<Compte> getListeComptes() {
		return listeComptes;
	}

	/**
	 * @param listeComptes the listeComptes to set
	 */
	public void setListeComptes(List<Compte> listeComptes) {
		this.listeComptes = listeComptes;
	}

	/**
	 * @return the intitCourrierPorteur1
	 */
	public String getIntitCourrierPorteur1() {
		return intitCourrierPorteur1;
	}

	/**
	 * @param intitCourrierPorteur1 the intitCourrierPorteur1 to set
	 */
	public void setIntitCourrierPorteur1(String intitCourrierPorteur1) {
		this.intitCourrierPorteur1 = intitCourrierPorteur1;
	}

	/**
	 * @return the intitCourrierPorteur2
	 */
	public String getIntitCourrierPorteur2() {
		return intitCourrierPorteur2;
	}

	/**
	 * @param intitCourrierPorteur2 the intitCourrierPorteur2 to set
	 */
	public void setIntitCourrierPorteur2(String intitCourrierPorteur2) {
		this.intitCourrierPorteur2 = intitCourrierPorteur2;
	}

	/**
	 * @return the enseignePorteur
	 */
	public int getEnseignePorteur() {
		return enseignePorteur;
	}

	/**
	 * @param enseignePorteur the enseignePorteur to set
	 */
	public void setEnseignePorteur(int enseignePorteur) {
		this.enseignePorteur = enseignePorteur;
	}
    

}
