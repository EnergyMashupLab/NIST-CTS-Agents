/**
 * 
 */
package org.theenergymashuplab.cts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.theenergymashuplab.cts.model.EiTransactionModel;

/**
 * @author Dhruvin Desai
 *
 */
public interface EiTransactionRepository extends JpaRepository<EiTransactionModel, Long>{

}
