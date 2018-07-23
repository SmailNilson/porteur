/**
 * 
 */
package com.bnpparibas.dsibddf.application.services;

import com.bnpparibas.dsibddf.application.beans.CommandDemandePorteur;
import com.bnpparibas.dsibddf.application.beans.ReponseContextePorteur;

/**
 * @author ADMINIBM
 *
 */
public interface IDemandeContextePorteurService {
	
	String getTest();
	
	ReponseContextePorteur getContextePorteur(CommandDemandePorteur demandePorteur);

}
