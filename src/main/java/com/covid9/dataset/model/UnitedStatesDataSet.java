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
@Table(name="whole_stats_united_states")
public class UnitedStatesDataSet {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int countyId;
	@NotEmpty(message= " it can't be empty")
	@Size(min=1,max=50,message="name must be between 1 and 50 chars")
	private String countyName;
	@NotNull(message="it cant be empty")
	private long population;
	@NotNull(message="it cant be empty")
	private double area;
	@NotNull(message="it cant be empty")
	private int density;
	@NotNull(message="it cant be empty")
	private double activePopulation;
	@NotNull(message="it cant be empty")
	private double employmentRate;
	@NotEmpty(message= " it can't be empty")
	@Size(min=1,max=50,message="name must be between 1 and 50 chars")
	private String state;
	@NotNull(message="it cant be empty")
	private double educationAttainment;
	@NotNull(message="it cant be empty")
	private double droveAlone;
	@NotNull(message="it cant be empty")
	private double carpool;
	@NotNull(message="it cant be empty")
	private double publicTransport;
	@NotNull(message="it cant be empty")
	private double walked;
	@NotNull(message="it cant be empty")
	private long totalCases;
	
	public UnitedStatesDataSet()
	{
		
	}
	
	public UnitedStatesDataSet(int countyId, String countyName, long population, double area, int density,
			double activePopulation, double employmentRate, String state, double educationAttainment, double droveAlone,
			double carpool, double publicTransport, double walked, long totalCases) {
		super();
		this.countyId = countyId;
		this.countyName = countyName;
		this.population = population;
		this.area = area;
		this.density = density;
		this.activePopulation = activePopulation;
		this.employmentRate = employmentRate;
		this.state = state;
		this.educationAttainment = educationAttainment;
		this.droveAlone = droveAlone;
		this.carpool = carpool;
		this.publicTransport = publicTransport;
		this.walked = walked;
		this.totalCases = totalCases;
	}

	public int getCountyId() {
		return countyId;
	}

	public void setCountyId(int countryId) {
		this.countyId = countryId;
	}

	public String getCountyName() {
		return countyName;
	}

	public void setCountyName(String countryName) {
		this.countyName = countryName;
	}

	public long getPopulation() {
		return population;
	}

	public void setPopulation(long population) {
		this.population = population;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public int getDensity() {
		return density;
	}

	public void setDensity(int density) {
		this.density = density;
	}

	public double getActivePopulation() {
		return activePopulation;
	}

	public void setActivePopulation(double activePopulation) {
		this.activePopulation = activePopulation;
	}

	public double getEmploymentRate() {
		return employmentRate;
	}

	public void setEmploymentRate(double employmentRate) {
		this.employmentRate = employmentRate;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public double getEducationAttainment() {
		return educationAttainment;
	}

	public void setEducationAttainment(double educationAttainment) {
		this.educationAttainment = educationAttainment;
	}

	public double getDroveAlone() {
		return droveAlone;
	}

	public void setDroveAlone(double droveAlone) {
		this.droveAlone = droveAlone;
	}

	public double getCarpool() {
		return carpool;
	}

	public void setCarpool(double carpool) {
		this.carpool = carpool;
	}

	public double getPublicTransport() {
		return publicTransport;
	}

	public void setPublicTransport(double publicTransport) {
		this.publicTransport = publicTransport;
	}

	public double getWalked() {
		return walked;
	}

	public void setWalked(double walked) {
		this.walked = walked;
	}

	public long getTotalCases() {
		return totalCases;
	}

	public void setTotalCases(long totalCases) {
		this.totalCases = totalCases;
	}
	
	
	
	

}
