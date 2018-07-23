/**
 * 
 */
package com.bnpparibas.dsibddf.webapp.dto;


import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author b30653
 * 
 */
@XmlRootElement(name = "ReponseListeComptes")
@XmlAccessorType(XmlAccessType.FIELD)
public class ReponseListeComptesDTO {

    /**
     * Identifiant du compte sur 23 caracteres.
     */
    @XmlElement(name = "PAN")
    private String pan;

    /**
     * Identifiant GAB.
     */
    @XmlElement(name = "idATM")
    private String idAtm;

    /**
     * Code réponse
     */
    @XmlElement(name = "CodeReponse")
    private int codeReponse;

    /**
     * Libellé associé au code réponse
     */
    @XmlElement(name = "LibelleCodeReponse")
    private String libelleCodeReponse;

    /**
     * Liste des comptes éligibles au dépôt
     */
    @XmlElement(name = "TableauComptes")
    private List<CompteDTO> comptes;

	/**
	 * @param pan
	 * @param idAtm
	 * @param codeReponse
	 * @param libelleCodeReponse
	 * @param comptes
	 */
	public ReponseListeComptesDTO(String pan, String idAtm, int codeReponse, String libelleCodeReponse,
			List<CompteDTO> comptes) {
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
	public ReponseListeComptesDTO() {
		super();
	}

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
	public List<CompteDTO> getComptes() {
		return comptes;
	}

	/**
	 * @param comptes the comptes to set
	 */
	public void setComptes(List<CompteDTO> comptes) {
		this.comptes = comptes;
	}



}
