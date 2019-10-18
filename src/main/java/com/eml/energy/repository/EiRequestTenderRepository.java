/**
 * @author Karan Shah
 * @version 1.0
 * @created 10-Oct-2019
 */

package com.eml.energy.repository;

import com.eml.energy.model.EiRequestTenderModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EiRequestTenderRepository extends JpaRepository<EiRequestTenderModel, Long> {

}
