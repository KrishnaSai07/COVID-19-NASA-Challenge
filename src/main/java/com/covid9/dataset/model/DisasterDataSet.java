package com.covid9.dataset.model;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
@Table(name="disaster_stats")
public class DisasterDataSet {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int entryId;
	@NotNull(message="it cant be empty")
	private Date timelineDate;
	@NotNull(message="it cant be empty")
	private long totalCases;
	@NotNull(message="it cant be empty")
	@Size(min=1,max=50,message="name must be between 1 and 50 chars")
	private String place;
	
	public DisasterDataSet()
	{
		
	}
	
	public DisasterDataSet(int entryId, Date timelineDate, long totalCases, String place) {
		super();
		this.entryId = entryId;
		this.timelineDate = timelineDate;
		this.totalCases = totalCases;
		this.place = place;
	}

	public int getEntryId() {
		return entryId;
	}

	public void setEntryId(int entryId) {
		this.entryId = entryId;
	}

	public Date getTimelineDate() {
		return timelineDate;
	}

	public void setTimelineDate(Date timelineDate) {
		this.timelineDate = timelineDate;
	}

	public long getTotalCases() {
		return totalCases;
	}

	public void setTotalCases(long totalCases) {
		this.totalCases = totalCases;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}
	
	
	
	
}
