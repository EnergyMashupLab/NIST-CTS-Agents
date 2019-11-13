
package org.theenergymashuplab.cts.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name="User")
//@EntityListeners(AuditingEntityListener.class)

public class EiUsersModel {

	// private static final Date CurrentDateTimeProvider ;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long userID; /*Primary key, we can have only one tender with same ID */
	
	@NotNull
	@Email
	private String emailID;	
	
	@NotNull
	private String password;
	
	@NotNull
	private String userType;
	
	// public Date sysdate = CurrentDateTimeProvider  ;
   
     public String status = "Active";
	//@Temporal(TemporalType.DATE)
	//@DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
	
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
/*	public static Date getCurrentdatetimeprovider() {
		return CurrentDateTimeProvider;
	}
	public Date getSysdate() {
		return sysdate;
	}
	public void setSysdate(Date sysdate) {
		this.sysdate = sysdate;
	}*/
	public Long getUserID() {
		return userID;
	}
	public void setUserID(Long userID) {
		this.userID = userID;
	}
	
	/* @Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
	public Date getStartDate() {
	    return startDate;
	}
	public void setStartDate(Date startDate) {
	    this.startDate = startDate;
	} */
	
	
	
}
