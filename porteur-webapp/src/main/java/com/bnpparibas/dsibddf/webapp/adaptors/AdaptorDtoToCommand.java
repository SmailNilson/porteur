/**
 * 
 */
package com.bnpparibas.dsibddf.webapp.adaptors;

import java.util.ArrayList;
import java.util.List;

import com.bnpparibas.dsibddf.application.beans.CommandDemandePorteur;
import com.bnpparibas.dsibddf.application.beans.ReponseCompte;
import com.bnpparibas.dsibddf.application.beans.ReponseContextePorteur;
import com.bnpparibas.dsibddf.webapp.dto.CompteDTO;
import com.bnpparibas.dsibddf.webapp.dto.DemandeCompteDTO;
import com.bnpparibas.dsibddf.webapp.dto.ReponseListeComptesDTO;



/**
 * @author ADMINIBM
 *
 */
public class AdaptorDtoToCommand  {

	/**
	 * 
	 */
	public static CommandDemandePorteur convertDtoToCommand(DemandeCompteDTO compteDTO) {
		
		return new CommandDemandePorteur(compteDTO.getPan(), compteDTO.getIdAtm());
	}
	/**
	 * 
	 */
	public static List<CompteDTO> convertListeComptesToDto(List<ReponseCompte> comptes) {
		
		final List<CompteDTO> listeCompteDTO = new ArrayList<>();
		for (ReponseCompte compte : comptes) {
			listeCompteDTO.add(ReponseCompteDto(compte));
		}
		return listeCompteDTO;
	}
	/**
	 * 
	 */
	public static CompteDTO ReponseCompteDto(ReponseCompte compte) {
		CompteDTO compteDTO =new CompteDTO();
		compteDTO.setNumeroCompte(compte.getNumeroCompte());
		compteDTO.setPlafondCompte(compte.getPlafondCompte());
		compteDTO.setSoldeCompte(compte.getSoldeCompte());
		compteDTO.setMontantDepotMinimal(compte.getMontantDepotMinimal());
		compteDTO.setLibelleType2Compte(compte.getLibelleType2Compte());
		compteDTO.setLibelleCodeDevise(compte.getLibelleCodeDevise());
	
		return compteDTO;
	}
	
	/**
	 * 
	 */
	public static ReponseListeComptesDTO convertCommandToDTO(ReponseContextePorteur contextePorteur) {
		
		return new ReponseListeComptesDTO(contextePorteur.getPan(), contextePorteur.getIdAtm(), contextePorteur.getCodeReponse(), contextePorteur.getLibelleCodeReponse(),convertListeComptesToDto(contextePorteur.getComptes()) );
	}
	/**
	 * 
	 */
	private AdaptorDtoToCommand() {
		super();
	}

}
