package com.nit.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="gender_tbl")
public class GendersEntity {

	@Id
	@Column(name="gender_id")
	private Integer genderID;
	@Column(name="gender_name",length = 12)
	private String genderName;
	public Integer getGenderID() {
		return genderID;
	}
	public void setGenderID(Integer genderID) {
		this.genderID = genderID;
	}
	public String getGenderName() {
		return genderName;
	}
	public void setGenderName(String genderName) {
		this.genderName = genderName;
	}
	@Override
	public String toString() {
		return "GendersEntity [genderID=" + genderID + ", genderName=" + genderName + "]";
	}
	
	
}
