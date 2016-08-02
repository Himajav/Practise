package com.walmart.epf;

/** Jun 27, 2016
 * 
 *@author Ranjan
 * 
 * EventProcessBean.java
 */
import java.io.Serializable;

public class EventProcessBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String eventID;
	private String eventCountryCode;
	private int eventInstanceID;
	private String eventPayload;
	private String systemCode;
	public String getEventID() {
		return eventID;
	}
	public void setEventID(String eventID) {
		this.eventID = eventID;
	}
	public String getEventCountryCode() {
		return eventCountryCode;
	}
	public void setEventCountryCode(String eventCountryCode) {
		this.eventCountryCode = eventCountryCode;
	}
	public int getEventInstanceID() {
		return eventInstanceID;
	}
	public void setEventInstanceID(int eventInstanceID) {
		this.eventInstanceID = eventInstanceID;
	}
	public String getEventPayload() {
		return eventPayload;
	}
	public void setEventPayload(String eventPayload) {
		this.eventPayload = eventPayload;
	}
	public String getSystemCode() {
		return systemCode;
	}
	public void setSystemCode(String systemCode) {
		this.systemCode = systemCode;
	}
	
	
	
	

}
