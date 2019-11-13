package org.theenergymashuplab.cts.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.theenergymashuplab.cts.model.EiRequestTransactionModel;
import org.theenergymashuplab.cts.repository.EiRequestTransactionRepository;

import java.util.List;

@Service
public class EiRequestTransaction {

	@Autowired
	EiRequestTransactionRepository transactionRepo;

	/* To save the tender */
	public EiRequestTransactionModel save(EiRequestTransactionModel eiTen) {
		return transactionRepo.save(eiTen);
	}

	/* To delete the tender */
	public void delete(EiRequestTransactionModel eiTen) {
		transactionRepo.delete(eiTen);
	}

	public Object findOne(Long requestID) {
		// @Query("SELECT * FROM EiResponse ET WHERE ET.refID = ?")
		
		return  transactionRepo.findById(requestID);
		
	}
	/*get a transaction by id */
	public EiRequestTransactionModel getOne(Long requestID) {
		// @Query("SELECT * FROM EiTender ET WHERE ET.tendId = ?")
		
		return  transactionRepo.getOne(requestID);
		//return null;
	}


	/* Search all books */
	public List<EiRequestTransactionModel> findAll() {
		return transactionRepo.findAll();
	}
}
