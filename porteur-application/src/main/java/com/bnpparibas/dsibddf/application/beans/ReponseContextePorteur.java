/**
 * 
 */
package com.bnpparibas.dsibddf.application.beans;

import java.util.List;

/**
 * @author ADMINIBM
 *
 */
public class ReponseContextePorteur {
	 /**
     * Identifiant du compte sur 23 caracteres.
     */
    private String pan;

    /**
     * Identifiant GAB.
     */
    private String idAtm;

    /**
     * Code réponse
     */
    private int codeReponse;

    /**
     * Libellé associé au code réponse
     */
    private String libelleCodeReponse;

    /**
     * Liste des comptes éligibles au dépôt
     */
    private List<ReponseCompte> comptes;

	/**
	 * @return the pan
	 */
	public String getPan() {
		return pan;
	}

	/**
	 * @param pan the pan to set
	 */
	public void setPan(String pan) {
		this.pan = pan;
	}

	/**
	 * @return the idAtm
	 */
	public String getIdAtm() {
		return idAtm;
	}

	/**
	 * @param idAtm the idAtm to set
	 */
	public void setIdAtm(String idAtm) {
		this.idAtm = idAtm;
	}

	/**
	 * @return the codeReponse
	 */
	public int getCodeReponse() {
		return codeReponse;
	}

	/**
	 * @param codeReponse the codeReponse to set
	 */
	public void setCodeReponse(int codeReponse) {
		this.codeReponse = codeReponse;
	}

	/**
	 * @return the libelleCodeReponse
	 */
	public String getLibelleCodeReponse() {
		return libelleCodeReponse;
	}

	/**
	 * @param libelleCodeReponse the libelleCodeReponse to set
	 */
	public void setLibelleCodeReponse(String libelleCodeReponse) {
		this.libelleCodeReponse = libelleCodeReponse;
	}

	/**
	 * @return the comptes
	 */
	public List<ReponseCompte> getComptes() {
		return comptes;
	}

	/**
	 * @param comptes the comptes to set
	 */
	public void setComptes(List<ReponseCompte> comptes) {
		this.comptes = comptes;
	}

	/**
	 * @param pan
	 * @param idAtm
	 * @param codeReponse
	 * @param libelleCodeReponse
	 * @param comptes
	 */
	public ReponseContextePorteur(String pan, String idAtm, int codeReponse, String libelleCodeReponse,
			List<ReponseCompte> comptes) {
		super();
		this.pan = pan;
		this.idAtm = idAtm;
		this.codeReponse = codeReponse;
		this.libelleCodeReponse = libelleCodeReponse;
		this.comptes = comptes;
	}

	/**
	 * 
	 */
	public ReponseContextePorteur() {
		super();
		// TODO Auto-generated constructor stub
	}
    
}
