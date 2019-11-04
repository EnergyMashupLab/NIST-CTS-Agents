package com.eml.energy.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.eml.energy.model.Ledger;
import com.eml.energy.repository.LedgerRepository;

@Service
public class LedgerService {

	@Autowired
	LedgerRepository ledgerRepo;
	
	public Ledger save( Ledger ledger ) {
		return ledgerRepo.save(ledger);
	}
}
