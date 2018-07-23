/**
 * 
 */
package com.bnpparibas.dsibddf.webapp.adaptors;

import com.bnpparibas.dsibddf.application.beans.CommandDemandePorteur;
import com.bnpparibas.dsibddf.webapp.dto.DemandeCompteDTO;

/**
 * @author ADMINIBM
 *
 */
public interface IAdaptorDtoToCommand {
	
	public   CommandDemandePorteur convertDtoToCommand(DemandeCompteDTO compteDTO);

}
