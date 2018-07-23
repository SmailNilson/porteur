/**
 * 
 */
package com.bnpparibas.dsibddf.application.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bnpparibas.dsibddf.application.beans.CommandDemandePorteur;
import com.bnpparibas.dsibddf.application.beans.ReponseCompte;
import com.bnpparibas.dsibddf.application.beans.ReponseContextePorteur;
import com.bnpparibas.dsibddf.application.services.IDemandeContextePorteurService;

/**
 * @author ADMINIBM
 *
 */
@Service
public class DemandeContextePorteurServiceImpl implements IDemandeContextePorteurService{

	@Override
	public String getTest() {		

		return "yes i'm here";
	}

	@Override
	public ReponseContextePorteur getContextePorteur(CommandDemandePorteur demandePorteur) {

		return getModeBouchon(demandePorteur);
	}
	 /**
     * Cette méthode va permettre de mis en place un bouchon qui remplace l'appel du goal
     * 
     * @param DemandeListeComptesIn
     * @return ReponseListeComptes
     */
    private ReponseContextePorteur getModeBouchon(final CommandDemandePorteur dataIn) {

        final List<ReponseCompte> comptes = new ArrayList<ReponseCompte>();
        final ReponseCompte compte = new ReponseCompte();
        // On renseigne l'identifiant du compte
        for (int i = 0; i < 4; i++) {
            compte.setNumeroCompte("123654789123456789451");
            // On renseigne la devise du compte
            compte.setLibelleCodeDevise("libelleType2Compte");
            // On renseigne le solde du compte
            compte.setSoldeCompte(15260.0);
            compte.setPlafondCompte(9000.0);
            compte.setMontantDepotMinimal(0);
            compte.setLibelleCodeDevise("EUR");
            comptes.add(compte);
        }
       return  new ReponseContextePorteur(dataIn.getPan(), dataIn.getIdAtm(), 1, "test mode bouchon", comptes);
         
    }
}
