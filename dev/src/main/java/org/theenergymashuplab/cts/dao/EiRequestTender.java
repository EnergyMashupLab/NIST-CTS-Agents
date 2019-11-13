package org.theenergymashuplab.cts.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.theenergymashuplab.cts.model.EiRequestTenderModel;
import org.theenergymashuplab.cts.repository.EiRequestTenderRepository;

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
	
	public Object findOne(Long requestID) {
		// @Query("SELECT * FROM EiTender ET WHERE ET.tendId = ?")
		
		return  tenderRepo.findById(requestID);
		//return null;
	}
	public EiRequestTenderModel getOne(Long requestID) {
		// @Query("SELECT * FROM EiTender ET WHERE ET.tendId = ?")
		
		return  tenderRepo.getOne(requestID);
		//return null;
	}
	/*Search all books */
	public List<EiRequestTenderModel> findAll(){
		return tenderRepo.findAll();
	}
}

