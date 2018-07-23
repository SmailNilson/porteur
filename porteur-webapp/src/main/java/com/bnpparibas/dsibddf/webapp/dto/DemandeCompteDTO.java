/**
 * 
 */
package com.bnpparibas.dsibddf.webapp.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author ADMINIBM
 *
 */
@XmlRootElement(name = "ReponseListeComptes")
@XmlAccessorType(XmlAccessType.FIELD)
public class DemandeCompteDTO {



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
	 * 
	 */
	public DemandeCompteDTO() {
		super();
	}
	/**
	 * @param pan
	 * @param idAtm
	 */
	public DemandeCompteDTO(String pan, String idAtm) {
		super();
		this.pan = pan;
		this.idAtm = idAtm;
	}
	
}
