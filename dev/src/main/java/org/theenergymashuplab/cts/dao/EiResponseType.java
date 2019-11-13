package org.theenergymashuplab.cts.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.theenergymashuplab.cts.model.EiResponseModel;
import org.theenergymashuplab.cts.repository.EiResponseRepository;

import java.util.List;

@Service
public class EiResponseType { /*Service class used to process the requests */

	@Autowired
	EiResponseRepository responseRepo;
	
	/*To save the save transaction */
	public EiResponseModel save( EiResponseModel eiRes ) {
		return responseRepo.save(eiRes);
	}
	public void delete( Object bks ) {
		responseRepo.delete((EiResponseModel) bks);
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

	
	/*Search all transactions */
	public List<EiResponseModel> findAll(){
		return responseRepo.findAll();
	}
}
