/**
 * @author Karan Shah
 * @version 1.0
 * @created 10-Oct-2019
 */

package org.theenergymashuplab.cts.repository;

import org.theenergymashuplab.cts.model.EiRequestTransactionModel;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EiRequestTransactionRepository extends JpaRepository<EiRequestTransactionModel, Long> {

}
