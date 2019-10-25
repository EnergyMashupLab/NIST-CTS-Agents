package com.eml.energy.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eml.energy.model.EiRequestTransactionModel;
import com.eml.energy.repository.EiRequestTransactionRepository;

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

	/* get a tender by id */
	/*public EiRequestTransactionModel findOne(Long tenderID) {
		// @Query("SELECT * FROM EiTender ET WHERE ET.tendId = ?")
		return (EiRequestTransactionModel) transactionRepo.findOne(tenderID);
	}*/

	/* Search all books */
	public List<EiRequestTransactionModel> findAll() {
		return transactionRepo.findAll();
	}
}
