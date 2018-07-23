/**
 * 
 */
package com.bnpparibas.dsibddf.domain.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author ADMINIBM
 *
 */
public class Compte {

    /**
     * Identifiant du compte sur 23 caracteres.
     */
    private String id;

    /**
     * Code ISO sur 3 caracteres.
     */
    private String devise;

    /**
     * Agence de gestion du compte.
     */
    private String agence;

    /**
     * Tableau de booleans de taille fixe (64 elements). Chaque element du tableau determine le droit sur une operation specifique. Pour chaque element
     * correspond un indice determine par une constante de la classe Droits.
     */
    private boolean[] droits = new boolean[64];

    /**
     * Correspond a la categorie du compte.
     */
    private int categorie;

    /**
     * Definit l ordre du compte dans sa categorie en vue d un tri.
     */
    private int noOrdre;

    /**
     * Correspond au type du compte (chaine de 3 caracteres alphanumeriques).
     */
    private String typeCompte;

    /**
     * Correspond au solde du compte.
     */
    private double solde;

    /**
     * Correspond a la date du solde au format JJ/MM/AAAA.
     */
    private Date dateSolde;

    /**
     * Correspond au nombre de jours consecutifs de debit.
     */
    private int nbJoursDbt;

    /**
     * Correspond au total de l encours des mouvements non encore comptabilises.
     */
    private double aVenir;

    /**
     * Indique si le porteur du compte en question est titulaire ou mandataire. T : titulaire / M : mandataire
     */
    private String titulMandat;

    /**
     * Indique si le compte en question est un compte joint ou prive. True = compte joint / False = compte prive
     */
    private boolean isJoint;

    /**
     * Correspond au solde mini du compte.
     */
    private double soldeMini;

    /**
     * Correspond au solde maxi du compte.
     */
    private double soldeMaxi;

    /**
     * Correspond au virement maxi du compte.
     */
    private double vrtMaxi;

    /**
     * Correspond au premier intitule courrier (Note : utilise uniquement pour la remise de cheques unitaires sur automate RECUA)
     * 
     */
    private String intit1;

    /**
     * Correspond au deuxieme intitule courrier (Note : utilise uniquement pour la remise de cheques unitaires sur automate RECUA)
     */
    private String intit2;

    /**
     * Le nom de la Banque (valeurs : 01 pour BDDF et 02 pour BD )
     */
    private String enseigneCompte;
    
    /**
     * Correspond au Devise de l'en cours des mouvements
     */
    private String aVenirDevise;
    
    
    /**
     * Correspond au soldeDevise
     */
    
    private String soldeDevise;
    
    
    
    /**
     * Flag Net Agence
     */
    private int flagNetAgence;
    

    /**
     * Correspond a la liste des titulaires de ce compte
     */
    private List<Titulaire> listeTitulaires = new ArrayList<Titulaire>();
    
    /**@author b30653
     * Correspond au libellePersonnalise
     */    
    private String libellePersonnalise;

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the devise
	 */
	public String getDevise() {
		return devise;
	}

	/**
	 * @param devise the devise to set
	 */
	public void setDevise(String devise) {
		this.devise = devise;
	}

	/**
	 * @return the agence
	 */
	public String getAgence() {
		return agence;
	}

	/**
	 * @param agence the agence to set
	 */
	public void setAgence(String agence) {
		this.agence = agence;
	}

	/**
	 * @return the droits
	 */
	public boolean[] getDroits() {
		return droits;
	}

	/**
	 * @param droits the droits to set
	 */
	public void setDroits(boolean[] droits) {
		this.droits = droits;
	}

	/**
	 * @return the categorie
	 */
	public int getCategorie() {
		return categorie;
	}

	/**
	 * @param categorie the categorie to set
	 */
	public void setCategorie(int categorie) {
		this.categorie = categorie;
	}

	/**
	 * @return the noOrdre
	 */
	public int getNoOrdre() {
		return noOrdre;
	}

	/**
	 * @param noOrdre the noOrdre to set
	 */
	public void setNoOrdre(int noOrdre) {
		this.noOrdre = noOrdre;
	}

	/**
	 * @return the typeCompte
	 */
	public String getTypeCompte() {
		return typeCompte;
	}

	/**
	 * @param typeCompte the typeCompte to set
	 */
	public void setTypeCompte(String typeCompte) {
		this.typeCompte = typeCompte;
	}

	/**
	 * @return the solde
	 */
	public double getSolde() {
		return solde;
	}

	/**
	 * @param solde the solde to set
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}

	/**
	 * @return the dateSolde
	 */
	public Date getDateSolde() {
		return dateSolde;
	}

	/**
	 * @param dateSolde the dateSolde to set
	 */
	public void setDateSolde(Date dateSolde) {
		this.dateSolde = dateSolde;
	}

	/**
	 * @return the nbJoursDbt
	 */
	public int getNbJoursDbt() {
		return nbJoursDbt;
	}

	/**
	 * @param nbJoursDbt the nbJoursDbt to set
	 */
	public void setNbJoursDbt(int nbJoursDbt) {
		this.nbJoursDbt = nbJoursDbt;
	}

	/**
	 * @return the aVenir
	 */
	public double getaVenir() {
		return aVenir;
	}

	/**
	 * @param aVenir the aVenir to set
	 */
	public void setaVenir(double aVenir) {
		this.aVenir = aVenir;
	}

	/**
	 * @return the titulMandat
	 */
	public String getTitulMandat() {
		return titulMandat;
	}

	/**
	 * @param titulMandat the titulMandat to set
	 */
	public void setTitulMandat(String titulMandat) {
		this.titulMandat = titulMandat;
	}

	/**
	 * @return the isJoint
	 */
	public boolean isJoint() {
		return isJoint;
	}

	/**
	 * @param isJoint the isJoint to set
	 */
	public void setJoint(boolean isJoint) {
		this.isJoint = isJoint;
	}

	/**
	 * @return the soldeMini
	 */
	public double getSoldeMini() {
		return soldeMini;
	}

	/**
	 * @param soldeMini the soldeMini to set
	 */
	public void setSoldeMini(double soldeMini) {
		this.soldeMini = soldeMini;
	}

	/**
	 * @return the soldeMaxi
	 */
	public double getSoldeMaxi() {
		return soldeMaxi;
	}

	/**
	 * @param soldeMaxi the soldeMaxi to set
	 */
	public void setSoldeMaxi(double soldeMaxi) {
		this.soldeMaxi = soldeMaxi;
	}

	/**
	 * @return the vrtMaxi
	 */
	public double getVrtMaxi() {
		return vrtMaxi;
	}

	/**
	 * @param vrtMaxi the vrtMaxi to set
	 */
	public void setVrtMaxi(double vrtMaxi) {
		this.vrtMaxi = vrtMaxi;
	}

	/**
	 * @return the intit1
	 */
	public String getIntit1() {
		return intit1;
	}

	/**
	 * @param intit1 the intit1 to set
	 */
	public void setIntit1(String intit1) {
		this.intit1 = intit1;
	}

	/**
	 * @return the intit2
	 */
	public String getIntit2() {
		return intit2;
	}

	/**
	 * @param intit2 the intit2 to set
	 */
	public void setIntit2(String intit2) {
		this.intit2 = intit2;
	}

	/**
	 * @return the enseigneCompte
	 */
	public String getEnseigneCompte() {
		return enseigneCompte;
	}

	/**
	 * @param enseigneCompte the enseigneCompte to set
	 */
	public void setEnseigneCompte(String enseigneCompte) {
		this.enseigneCompte = enseigneCompte;
	}

	/**
	 * @return the aVenirDevise
	 */
	public String getaVenirDevise() {
		return aVenirDevise;
	}

	/**
	 * @param aVenirDevise the aVenirDevise to set
	 */
	public void setaVenirDevise(String aVenirDevise) {
		this.aVenirDevise = aVenirDevise;
	}

	/**
	 * @return the soldeDevise
	 */
	public String getSoldeDevise() {
		return soldeDevise;
	}

	/**
	 * @param soldeDevise the soldeDevise to set
	 */
	public void setSoldeDevise(String soldeDevise) {
		this.soldeDevise = soldeDevise;
	}

	/**
	 * @return the flagNetAgence
	 */
	public int getFlagNetAgence() {
		return flagNetAgence;
	}

	/**
	 * @param flagNetAgence the flagNetAgence to set
	 */
	public void setFlagNetAgence(int flagNetAgence) {
		this.flagNetAgence = flagNetAgence;
	}

	/**
	 * @return the listeTitulaires
	 */
	public List<Titulaire> getListeTitulaires() {
		return listeTitulaires;
	}

	/**
	 * @param listeTitulaires the listeTitulaires to set
	 */
	public void setListeTitulaires(List<Titulaire> listeTitulaires) {
		this.listeTitulaires = listeTitulaires;
	}

	/**
	 * @return the libellePersonnalise
	 */
	public String getLibellePersonnalise() {
		return libellePersonnalise;
	}

	/**
	 * @param libellePersonnalise the libellePersonnalise to set
	 */
	public void setLibellePersonnalise(String libellePersonnalise) {
		this.libellePersonnalise = libellePersonnalise;
	}
    
    

}
