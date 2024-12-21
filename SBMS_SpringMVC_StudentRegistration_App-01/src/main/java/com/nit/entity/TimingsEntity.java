package com.nit.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="TIMING_TBL")
public class TimingsEntity {

	@Id
	@Column(name="Timing_id")
	private Integer timing_id;
	@Column(name="Timing_Name",length = 12)
	private String timing_name;

	public Integer getTiming_id() {
		return timing_id;
	}
	public void setTiming_id(Integer timing_id) {
		this.timing_id = timing_id;
	}
	public String getTiming_name() {
		return timing_name;
	}
	public void setTiming_name(String timing_name) {
		this.timing_name = timing_name;
	}
	@Override
	public String toString() {
		return "TimingsEntity [timing_id=" + timing_id + ", timing_name=" + timing_name + "]";
	}
	
	
}
