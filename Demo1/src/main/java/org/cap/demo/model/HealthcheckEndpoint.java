package org.cap.demo.model;

public class HealthcheckEndpoint {
	
	String systemName;
	String systemCode;
	String systemDescription;
	public String getSystemName() {
		return systemName;
	}
	public void setSystemName(String systemName) {
		this.systemName = systemName;
	}
	public String getSystemCode() {
		return systemCode;
	}
	public void setSystemCode(String systemCode) {
		this.systemCode = systemCode;
	}
	public String getSystemDescription() {
		return systemDescription;
	}
	public void setSystemDescription(String systemDescription) {
		this.systemDescription = systemDescription;
	}
	public HealthcheckEndpoint(String systemName, String systemCode, String systemDescription) {
		super();
		this.systemName = systemName;
		this.systemCode = systemCode;
		this.systemDescription = systemDescription;
	}
	public HealthcheckEndpoint() {
		super();
	}
	@Override
	public String toString() {
		return "HealthcheckEndpoint [systemName=" + systemName + ", systemCode=" + systemCode + ", systemDescription="
				+ systemDescription + "]";
	}
	
	

}
