/**
 * 
 */
package com.bnpparibas.dsibddf.application.beans;

/**
 * @author ADMINIBM
 *
 */
public class CommandDemandePorteur {

	/**
	 * Identifiant du compte sur 23 caracteres.
	 */

	private String pan;

	/**
	 * Identifiant GAB.
	 */

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
	 * @param pan
	 * @param idAtm
	 */
	public CommandDemandePorteur(String pan, String idAtm) {
		super();
		this.pan = pan;
		this.idAtm = idAtm;
	}

	/**
	 * 
	 */
	public CommandDemandePorteur() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
