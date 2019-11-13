
package org.theenergymashuplab.cts.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.theenergymashuplab.cts.model.EiUsersModel;
import org.theenergymashuplab.cts.repository.EiUserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class EiUserInfo { /*Service class used to process the reqquests */

	@Autowired
	EiUserRepository userRepo;
	
	/*To save the tender */
	public EiUsersModel save( EiUsersModel eiTen ) {
		return userRepo.save(eiTen);
	}
	
	/*To delete the tender */
	public void delete( Object bks ) {
		userRepo.delete((EiUsersModel) bks);
	}
	
	/*get a tender by id */
	public Optional<EiUsersModel> findOne(Long tenderId) {
		// @Query("SELECT * FROM EiTender ET WHERE ET.tendId = ?")
		
		return  userRepo.findById(tenderId);
		//return null;
	}
	
	
	
	/*get a tender by id */
	public EiUsersModel getOne(Long tenderId) {
		// @Query("SELECT * FROM EiTender ET WHERE ET.tendId = ?")
		
		return  userRepo.getOne(tenderId);
		//return null;
	}
	/*Search all books */
	public List<EiUsersModel> findAll(){
		return userRepo.findAll();
	}

	
}
