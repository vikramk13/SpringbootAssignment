package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFilter;

@Table(name="infouser")
@Entity
@JsonFilter("Info")
public class Info {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private String  city;

	private String  urbanStatus;
	
	private  String  stateCode;
	
	private String  state;
	
	private String district;
	
	private String districtCode;
	public Info() {
		
	}
	public Info(Integer id, String city, String urbanStatus, String stateCode, String state, String district,
			String districtCode) {
		super();
		this.id = id;
		this.city = city;
		this.urbanStatus = urbanStatus;
		this.stateCode = stateCode;
		this.state = state;
		this.district = district;
		this.districtCode = districtCode;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getUrbanStatus() {
		return urbanStatus;
	}
	public void setUrbanStatus(String urbanStatus) {
		this.urbanStatus = urbanStatus;
	}
	public String getStateCode() {
		return stateCode;
	}
	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getDistrictCode() {
		return districtCode;
	}
	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}
	@Override
	public String toString() {
		return "Info [id=" + id + ", city=" + city + ", urbanStatus=" + urbanStatus + ", stateCode=" + stateCode
				+ ", state=" + state + ", district=" + district + ", districtCode=" + districtCode + "]";
	}
	
}
