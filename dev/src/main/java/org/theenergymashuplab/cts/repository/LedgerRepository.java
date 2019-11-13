package org.theenergymashuplab.cts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.theenergymashuplab.cts.model.Ledger;

public interface LedgerRepository extends JpaRepository<Ledger, Long>{

}
