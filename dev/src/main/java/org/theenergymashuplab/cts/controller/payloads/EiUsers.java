
package org.theenergymashuplab.cts.controller.payloads;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.theenergymashuplab.cts.dao.EiUserInfo;
import org.theenergymashuplab.cts.model.EiUsersModel;

import java.util.List;

//package XSD-01.EiPayloads;

/*import XSD-01.EIClasses.actorID;
import XSD-01.EIClasses.EiTenderType;
import XSD-01.EIClasses.refID;
*/

@RestController
@RequestMapping("/Users")

public class EiUsers {
	
	/* public actorID counterPartyID; public EiTenderType eiTender; public actorID
	 * partyID; public refID requestID;
	  */

	@Autowired
	EiUserInfo userdao;
	@RequestMapping("/")
	public String home(){ 
		return "Hell World!"; 
	}
	/*1) To Save an tender*/
	//@RequestMapping(value = "/add", method = RequestMethod.POST  )
	
	@PostMapping("/add")
	public EiUsersModel newUser(@Valid @RequestBody EiUsersModel bks) {
	
		return userdao.save(bks);
	}

	/* 2) Get created tender */
	@GetMapping("/search/{id}")
	
	public ResponseEntity<Object> getCreatedTender(@PathVariable(value = "id") Long tenderID) {
		Object bks =  userdao.findOne(tenderID);
		if (bks == null) {
			return ResponseEntity.notFound().build();
		}

		return ResponseEntity.ok().body(bks);
	}

	/* 3) delete a tender by tenderid */
    @DeleteMapping("/delete/{id}")
	//@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET  )
	public ResponseEntity <EiUsersModel> deleteBook(@PathVariable(value = "id") Long tenderID) {

    	EiUsersModel bks = (EiUsersModel) userdao.getOne(tenderID);
		if (bks == null) {
			return ResponseEntity.notFound().build();
		}
		
		userdao.delete( bks);

		return ResponseEntity.ok().build();
	}

	/* 4) get all Tenders */
	@GetMapping("/allTenders")
	public List<EiUsersModel> getAllTenders(){
		
		return userdao.findAll();
	}
}