/**
 * @author Karan Shah
 * @version 1.0
 * @created 10-Oct-2019
 */

package com.eml.energy.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.eml.energy.model.EiTenderModel;
import com.eml.energy.repository.EiTenderRepository;

import java.util.List;

@Service
public class EiTenderType { /*Service class used to process the reqquests */

	@Autowired
	EiTenderRepository tenderRepo;
	
	/*To save the tender */
	public EiTenderModel save( EiTenderModel eiTen ) {
		return tenderRepo.save(eiTen);
	}
	
	/*To delete the tender */
	public void delete( EiTenderModel eiTen ) {
		tenderRepo.delete(eiTen);
	}
	
	/*get a tender by id */
	public EiTenderModel findOne(Long tenderID) {
		// @Query("SELECT * FROM EiTender ET WHERE ET.tendId = ?")
<<<<<<< HEAD
		return (EiTenderModel) tenderRepo.findOne(tenderID);
=======
		//return tenderRepo.findOne(tenderID);
		return null;
>>>>>>> 698019c634dbfa4d7ec5cc947dd8440186ee4a76
	}
	
	/*Search all books */
	public List<EiTenderModel> findAll(){
		return tenderRepo.findAll();
	}
}
