package com.covid9.dataset.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="state_info")
public class StateInfo {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int stateId;
	@NotEmpty(message= " it can't be empty")
	@Size(min=1,max=50,message="name must be between 1 and 50 chars")
	private String state;
	@NotNull(message="it cant be empty")
	private int density;
	@NotNull(message="it cant be empty")
	private double urbanPercent;
	@NotNull(message="it cant be empty")
	private double literacyPercent;
	
	public StateInfo()
	{
		
	}
	
	public StateInfo(int stateId, String state, int density, double urbanPercent, double literacyPercent) {
		super();
		this.stateId = stateId;
		this.state = state;
		this.density = density;
		this.urbanPercent = urbanPercent;
		this.literacyPercent = literacyPercent;
	}

	public int getStateId() {
		return stateId;
	}

	public void setStateId(int stateId) {
		this.stateId = stateId;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getDensity() {
		return density;
	}

	public void setDensity(int density) {
		this.density = density;
	}

	public double getUrbanPercent() {
		return urbanPercent;
	}

	public void setUrbanPercent(double urbanPercent) {
		this.urbanPercent = urbanPercent;
	}

	public double getLiteracyPercent() {
		return literacyPercent;
	}

	public void setLiteracyPercent(double literacyPercent) {
		this.literacyPercent = literacyPercent;
	}
	
	
	
	

}
