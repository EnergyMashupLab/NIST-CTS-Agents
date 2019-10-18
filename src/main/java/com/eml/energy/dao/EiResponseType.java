package com.eml.energy.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.eml.energy.model.EiResponseModel;

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
	
	/*To delete the transaction */
	public void delete( EiResponseModel eiTen ) {
		responseRepo.delete(eiTen);
	}
	
	
	
	
	/*get a transaction by refid */
	public EiResponseModel findOne(Long refID) {
		
		return (EiResponseModel) responseRepo.findOne(refID);
	}
	
	/*Search all transactions */
	public List<EiResponseModel> findAll(){
		return responseRepo.findAll();
	}

	public EiResponseModel findByresponseCode(Long refID) {
		// TODO Auto-generated method stub
		return (EiResponseModel) responseRepo.findOne(refID);
	}

	
	
}
