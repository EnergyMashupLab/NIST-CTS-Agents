package org.theenergymashuplab.cts.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.theenergymashuplab.cts.model.Ledger;
import org.theenergymashuplab.cts.repository.LedgerRepository;

@Service
public class LedgerService {

	@Autowired
	LedgerRepository ledgerRepo;
	
	public Ledger save( Ledger ledger ) {
		return ledgerRepo.save(ledger);
	}
}
