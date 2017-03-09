/**
 * 
 */
package com.example.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Administrator
 *
 */
@Document(collection = "toll")
public class TollUsage {

	@Id
	private String id;

	private String stationId;

	private String licencePlate;

	private String timeStamp;

	public TollUsage() {

	}

	public TollUsage(String string, String string2, String string3, String string4) {
		this.id = string;
		this.stationId = string2;
		this.licencePlate = string3;
		this.timeStamp = string4;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@JsonProperty(required = true)
	public String getStationId() {
		return stationId;
	}

	public void setStationId(String stationId) {
		this.stationId = stationId;
	}

	@JsonProperty(required = true)
	public String getLicencePlate() {
		return licencePlate;
	}

	public void setLicencePlate(String licencePlate) {
		this.licencePlate = licencePlate;
	}

	@JsonProperty(required = true)
	public String getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}

}
