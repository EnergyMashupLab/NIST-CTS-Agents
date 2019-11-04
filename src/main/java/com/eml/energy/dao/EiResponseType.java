package com.eml.energy.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.eml.energy.model.EiResponseModel;
import com.eml.energy.model.EiTenderModel;
import com.eml.energy.repository.EiResponseRepository;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

@Service
public class EiResponseType { /*Service class used to process the requests */

	@Autowired
	EiResponseRepository responseRepo;
	
	/*To save the save transaction */
	public EiResponseModel save( EiResponseModel eiRes ) {
		return responseRepo.save(eiRes);
	}
	
	
	public Object findOne(Long refID) {
		// @Query("SELECT * FROM EiResponse ET WHERE ET.refID = ?")
		
		return  responseRepo.findById(refID);
		
	}
	/*get a transaction by id */
	public EiResponseModel getOne(Long tenderId) {
		// @Query("SELECT * FROM EiTender ET WHERE ET.tendId = ?")
		
		return  responseRepo.getOne(tenderId);
		//return null;
	}

	public void delete (Object bks) {
		responseRepo.delete((EiResponseModel) bks);
	}
	
	/*Search all transactions */
	public List<EiResponseModel> findAll(){
		return responseRepo.findAll();
	}
}
