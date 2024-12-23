package com.nit.binders;

import java.util.Arrays;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="StudentRegister_TBL")
public class StudentFormBinders {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "STudent_Id")
	private Integer id;
	@Column(name = "Name")
	private String name;
	@Column(name = "Email")
	private String email;
	@Column(name = "Mobile_No")
	private Long phNo;
	@Column(name = "Gender")
	private String gender;
	@Column(name = "Course")
	private String course;
	@Column(name = "Timings")
	private String[] timings;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getPhNo() {
		return phNo;
	}
	public void setPhNo(Long phNo) {
		this.phNo = phNo;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String[] getTimings() {
		return timings;
	}
	public void setTimings(String[] timings) {
		this.timings = timings;
	}
	
	@Override
	public String toString() {
		return "FormBinders [name=" + name + ", email=" + email + ", phNo=" + phNo + ", gender=" + gender + ", course="
				+ course + ", timings=" + Arrays.toString(timings) + "]";
	}
	
	
}
