/**
 * @author Karan Shah
 * @version 1.0
 * @created 10-Oct-2019
 */

package org.theenergymashuplab.cts.repository;

import org.theenergymashuplab.cts.model.EiTenderModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EiTenderRepository extends JpaRepository<EiTenderModel, Long>  {

}