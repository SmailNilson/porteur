/**
 * 
 */
package com.bnpparibas.dsibddf.application.adaptors;

import java.util.ArrayList;
import java.util.List;

import com.bnpparibas.dsibddf.application.beans.CommandDemandePorteur;
import com.bnpparibas.dsibddf.application.beans.ReponseCompte;
import com.bnpparibas.dsibddf.application.beans.ReponseContextePorteur;
import com.bnpparibas.dsibddf.domain.entity.Compte;
import com.bnpparibas.dsibddf.domain.entity.ContextePorteur;
import com.bnpparibas.dsibddf.domain.entity.DemandeContextePorteur;

/**
 * @author ADMINIBM
 *
 */
public class adaptorCommandAndEntity {
	
	public static DemandeContextePorteur convertToDataIn(CommandDemandePorteur demandePorteur) {
		DemandeContextePorteur demandeContextePorteur=new DemandeContextePorteur();
		demandeContextePorteur.setIdAtm(demandePorteur.getIdAtm());
		demandeContextePorteur.setPan(demandePorteur.getPan());
		return demandeContextePorteur;
	}
	/**
	 * 
	 */
	public static List<ReponseCompte> convertCompteToReponseCompte(List<Compte> comptes) {
		
		final List<ReponseCompte> listeCompteDTO = new ArrayList<>();
		for (Compte compte : comptes) {
			listeCompteDTO.add(ComptToReponseCompte(compte));
		}
		return listeCompteDTO;
	}
	/**
	 * 
	 */
	public static ReponseCompte ComptToReponseCompte(Compte compte) {
		ReponseCompte compteDTO =new ReponseCompte();
		compteDTO.setNumeroCompte(compte.getId());
		compteDTO.setPlafondCompte(compte.getSoldeMaxi());
		compteDTO.setSoldeCompte(compte.getSolde());
		compteDTO.setMontantDepotMinimal((int) compte.getSoldeMini());
		compteDTO.setLibelleType2Compte(compte.getTypeCompte());
		compteDTO.setLibelleCodeDevise(compte.getDevise());
	
		return compteDTO;
	}
	
	/**
	 * 
	 */
	public static ReponseContextePorteur convertCommandToDTO(CommandDemandePorteur demandePorteur,ContextePorteur contextePorteur) {
		
		return new ReponseContextePorteur(demandePorteur.getPan(), demandePorteur.getIdAtm(), contextePorteur.getCodeRetour(), contextePorteur.getLibelleRetour(),convertCompteToReponseCompte(contextePorteur.getListeComptes()) );
	}
}
