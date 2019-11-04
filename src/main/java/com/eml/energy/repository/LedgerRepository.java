package com.eml.energy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.eml.energy.model.Ledger;

public interface LedgerRepository extends JpaRepository<Ledger, Long>{

}
