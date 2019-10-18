package com.eml.energy.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eml.energy.model.EiRequestTenderModel;
import com.eml.energy.repository.EiRequestTenderRepository;

import java.util.List;

@Service
public class EiRequestTender {

	@Autowired
	EiRequestTenderRepository tenderRepo;
	
	/*To save the tender */
	public EiRequestTenderModel save( EiRequestTenderModel eiTen ) {
		return tenderRepo.save(eiTen);
	}
	
	/*To delete the tender */
	public void delete( EiRequestTenderModel eiTen ) {
		tenderRepo.delete(eiTen);
	}
	
	/*Search all books */
	public List<EiRequestTenderModel> findAll(){
		return tenderRepo.findAll();
	}
}

