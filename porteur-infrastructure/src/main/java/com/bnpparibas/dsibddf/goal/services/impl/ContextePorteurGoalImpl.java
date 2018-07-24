/**
 * 
 */
package com.bnpparibas.dsibddf.goal.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bnpparibas.dsibddf.domain.entity.Compte;
import com.bnpparibas.dsibddf.domain.entity.ContextePorteur;
import com.bnpparibas.dsibddf.domain.entity.DemandeContextePorteur;
import com.bnpparibas.dsibddf.goal.Services.IContextePorteurGoal;

/**
 * @author ADMINIBM
 *
 */
@Service
public class ContextePorteurGoalImpl implements IContextePorteurGoal {

	@Override
	public ContextePorteur callContextePorteurGoal(DemandeContextePorteur dataIn) {
		
		return getModeBouchon(dataIn);
	}

	
	
	 /**
     * Cette méthode va permettre de mis en place un bouchon qui remplace l'appel du goal
     * 
     * @param DemandeListeComptesIn
     * @return ReponseListeComptes
     */
    private ContextePorteur getModeBouchon(final DemandeContextePorteur dataIn) {

        final List<Compte> comptes = new ArrayList<Compte>();
        final Compte compte = new Compte();
        // On renseigne l'identifiant du compte
        for (int i = 0; i < 4; i++) {
            compte.setId("123654789123456789451");
            // On renseigne la devise du compte
            compte.setTypeCompte("libelleType2Compte");
            // On renseigne le solde du compte
            compte.setSolde(15260.0);
            compte.setSoldeMaxi(9000.0);
            compte.setSoldeMini(0);
            compte.setDevise("EUR");
            comptes.add(compte);
        }
        ContextePorteur contextePorteur =new ContextePorteur();
        contextePorteur.setCodeRetour(1);
        contextePorteur.setLibelleRetour("Appel Mode bouchon");
        contextePorteur.setListeComptes(comptes);
        
       return  contextePorteur;
         
    }
}
