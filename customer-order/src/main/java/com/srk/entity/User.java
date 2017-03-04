package com.srk.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * User Entity
 * @author Seetharama Krishna
 *
 */
@Entity
@Table(name = "USER")
public class User extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1995576042438122185L;
	
	@Column(name = "USER_NAME", length = 100)
	private String userName;
	
	@Column(name = "PASSWORD", length = 255)
	private String password;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}