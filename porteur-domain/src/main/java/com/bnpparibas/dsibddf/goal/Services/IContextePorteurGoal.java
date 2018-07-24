/**
 * 
 */
package com.bnpparibas.dsibddf.goal.Services;

import com.bnpparibas.dsibddf.domain.entity.ContextePorteur;
import com.bnpparibas.dsibddf.domain.entity.DemandeContextePorteur;

/**
 * @author ADMINIBM
 *
 */
public interface IContextePorteurGoal {
	
	ContextePorteur callContextePorteurGoal(DemandeContextePorteur dataIn);

}
