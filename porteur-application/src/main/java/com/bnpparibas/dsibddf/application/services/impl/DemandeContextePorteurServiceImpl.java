/**
 * 
 */
package com.bnpparibas.dsibddf.application.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bnpparibas.dsibddf.application.adaptors.GenerateAdaptorCommandAndEntity;
import com.bnpparibas.dsibddf.application.beans.CommandDemandePorteur;
import com.bnpparibas.dsibddf.application.beans.ReponseContextePorteur;
import com.bnpparibas.dsibddf.application.services.IDemandeContextePorteurService;
import com.bnpparibas.dsibddf.domain.entity.DemandeContextePorteur;
import com.bnpparibas.dsibddf.goal.Services.IContextePorteurGoal;

/**
 * @author ADMINIBM
 *
 */
@Service
public class DemandeContextePorteurServiceImpl implements IDemandeContextePorteurService{

	@Autowired
	private transient IContextePorteurGoal contxetePorteurGoalService;

	@Override
	public ReponseContextePorteur getContextePorteur(CommandDemandePorteur demandePorteur) {
		
		DemandeContextePorteur demandeContextePorteur = GenerateAdaptorCommandAndEntity.convertToDataIn(demandePorteur);
		ReponseContextePorteur reponseContextePorteur = GenerateAdaptorCommandAndEntity.convertCommandToDTO(demandePorteur,contxetePorteurGoalService.callContextePorteurGoal(demandeContextePorteur));

		return reponseContextePorteur;
	}

	@Override
	public String getTest() {
		// TODO Auto-generated method stub
		return null;
	}
	 
}
