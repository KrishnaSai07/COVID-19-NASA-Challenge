package com.covid9.dataset.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="whole_stats")
public class IndiaDataSet {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int areaId;
	@NotEmpty(message= " it can't be empty")
	@Size(min=1,max=50,message="name must be between 1 and 50 chars")
	private String areaName;
	@NotNull(message="it cant be empty")
	private long population;
	@NotNull(message="it cant be empty")
	private long area;
	@NotNull(message="it cant be empty")
	private int density;
	@NotNull(message="it cant be empty")
	private long literates;
	@NotNull(message="it cant be empty")
	private long urban;
	@NotNull(message="it cant be empty")
	private long rural;
	@NotEmpty(message= " it can't be empty")
	@Size(min=1,max=50,message="name must be between 1 and 50 chars")
	private String state;
	@NotNull(message="it cant be empty")
	private double literacyPercent;
	@NotNull(message="it cant be empty")
	private long totalCases;
	@NotNull(message="it cant be empty")
	private double urbanPercent;
	@NotNull(message="it cant be empty")
	private double ruralPercent;
	@NotNull(message="it cant be empty")
	private double ruralLitPercent;
	
	
	public IndiaDataSet()
	{
		
	}
	
	public IndiaDataSet(int areaId, String areaName,long population,long area,int density,long literates,long urban, long rural, String state,
			double literacyPercent,long totalCases,
			double urbanPercent,double ruralPercent, double ruralLitPercent) {
		super();
		this.areaId = areaId;
		this.areaName = areaName;
		this.population = population;
		this.area = area;
		this.density = density;
		this.literates = literates;
		this.urban = urban;
		this.rural = rural;
		this.state = state;
		this.literacyPercent = literacyPercent;
		this.totalCases = totalCases;
		this.urbanPercent = urbanPercent;
		this.ruralPercent = ruralPercent;
		this.ruralLitPercent = ruralLitPercent;
	}
	public int getAreaId() {
		return areaId;
	}
	public void setAreaId(int areaId) {
		this.areaId = areaId;
	}
	public String getAreaName() {
		return areaName;
	}
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	public long getPopulation() {
		return population;
	}
	public void setPopulation(long population) {
		this.population = population;
	}
	public long getArea() {
		return area;
	}
	public void setArea(long area) {
		this.area = area;
	}
	public int getDensity() {
		return density;
	}
	public void setDensity(int density) {
		this.density = density;
	}
	public long getLiterates() {
		return literates;
	}
	public void setLiterates(long literates) {
		this.literates = literates;
	}
	public long getUrban() {
		return urban;
	}
	public void setUrban(long urban) {
		this.urban = urban;
	}
	public long getRural() {
		return rural;
	}
	public void setRural(long rural) {
		this.rural = rural;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public double getLiteracyPercent() {
		return literacyPercent;
	}
	public void setLiteracyPercent(double literacyPercent) {
		this.literacyPercent = literacyPercent;
	}
	public long getTotalCases() {
		return totalCases;
	}
	public void setTotalCases(long totalCases) {
		this.totalCases = totalCases;
	}
	public double getUrbanPercent() {
		return urbanPercent;
	}
	public void setUrbanPercent(double urbanPercent) {
		this.urbanPercent = urbanPercent;
	}
	public double getRuralPercent() {
		return ruralPercent;
	}
	public void setRuralPercent(double ruralPercent) {
		this.ruralPercent = ruralPercent;
	}

	public double getRuralLitPercent() {
		return ruralLitPercent;
	}

	public void setRuralLitPercent(double ruralLitPercent) {
		this.ruralLitPercent = ruralLitPercent;
	}
	
}
