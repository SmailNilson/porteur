package com.bnpparibas.dsibddf.webapp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bnpparibas.dsibddf.application.beans.CommandDemandePorteur;
import com.bnpparibas.dsibddf.application.services.IDemandeContextePorteurService;
import com.bnpparibas.dsibddf.webapp.adaptors.AdaptorDtoToCommand;
import com.bnpparibas.dsibddf.webapp.dto.CompteDTO;
import com.bnpparibas.dsibddf.webapp.dto.DemandeCompteDTO;
import com.bnpparibas.dsibddf.webapp.dto.ReponseListeComptesDTO;

@RestController
public class Facade {

	@Autowired
	private IDemandeContextePorteurService contextePorteur;

	@RequestMapping(path = "/hell")
	public String getTest() {
		DemandeCompteDTO compteDTO = new DemandeCompteDTO("test", "test");
		CommandDemandePorteur commandPorteur = AdaptorDtoToCommand.convertDtoToCommand(compteDTO);
		return commandPorteur.getPan();
	}

	@PostMapping(path = "/getdata", produces = MediaType.APPLICATION_ATOM_XML_VALUE)
	public DemandeCompteDTO getData() {

		return new DemandeCompteDTO("test", "test");
	}

	@PostMapping(path = "/getliste", produces = MediaType.APPLICATION_ATOM_XML_VALUE)
	public ReponseListeComptesDTO getliste() {

		return getModeBouchon(new DemandeCompteDTO("test", "test"));
	}

	@PostMapping(path = "/getlisteComptes", produces = MediaType.APPLICATION_ATOM_XML_VALUE)
	public ReponseListeComptesDTO getComptes() {

		CommandDemandePorteur commandPorteur = AdaptorDtoToCommand
				.convertDtoToCommand(new DemandeCompteDTO("test", "test"));
		ReponseListeComptesDTO reponseListeComptesDTO = AdaptorDtoToCommand
				.convertCommandToDTO(contextePorteur.getContextePorteur(commandPorteur));

		return reponseListeComptesDTO;
	}

	/**
	 * Cette méthode va permettre de mis en place un bouchon qui remplace l'appel du
	 * goal
	 * 
	 * @param DemandeListeComptesIn
	 * @return ReponseListeComptes
	 */
	private ReponseListeComptesDTO getModeBouchon(final DemandeCompteDTO dataIn) {

		final List<CompteDTO> comptes = new ArrayList<CompteDTO>();
		final CompteDTO compte = new CompteDTO();
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
		return new ReponseListeComptesDTO(dataIn.getPan(), dataIn.getIdAtm(), 1, "test mode bouchon", comptes);

	}

}
