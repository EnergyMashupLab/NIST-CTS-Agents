/**
 * @author Karan Shah
 * @version 1.0
 * @created 10-Oct-2019
 */

package org.theenergymashuplab.cts.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.theenergymashuplab.cts.model.EiTenderModel;
import org.theenergymashuplab.cts.repository.EiTenderRepository;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

@Service
public class EiTenderType { /*Service class used to process the requests */

	@Autowired
	EiTenderRepository tenderRepo;
	
	/*To save the tender */
	public EiTenderModel save( EiTenderModel eiTen ) {
		return tenderRepo.save(eiTen);
	}
	
	/*To delete the tender */
	public void delete( Object bks ) {
		tenderRepo.delete((EiTenderModel) bks);
	}
	
	/*get a tender by id */
	public Optional findOne(Long tenderId) {
		// @Query("SELECT * FROM EiTender ET WHERE ET.tendId = ?")
		
		return  tenderRepo.findById(tenderId);
		//return null;
	}
	
	
	
	/*get a tender by id */
	public EiTenderModel getOne(Long tenderId) {
		// @Query("SELECT * FROM EiTender ET WHERE ET.tendId = ?")
		
		return  tenderRepo.getOne(tenderId);
		//return null;
	}
	/*Search all books */
	public List<EiTenderModel> findAll(){
		return tenderRepo.findAll();
	}

	public EiTenderModel update(@Valid EiTenderModel bks) {
		// TODO Auto-generated method stub
		return null;
	}
}
