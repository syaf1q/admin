package my.com.adminpanelbackend.dto;

import java.util.Date;

public class ApLogin {
	
	
	private int id;
	private String username;
	private String password;
	private int id_ap_staff;
	private Date lastLogin;
	private boolean active;
	private String createdBy;
	private Date createdDate;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getId_ap_staff() {
		return id_ap_staff;
	}
	public void setId_ap_staff(int id_ap_staff) {
		this.id_ap_staff = id_ap_staff;
	}
	public Date getLastLogin() {
		return lastLogin;
	}
	public void setLastLogin(Date lastLogin) {
		this.lastLogin = lastLogin;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	
	

}
