package org.cap.demo.model;

public class Hardware {

	private int hardwareId;
    private String hardwareName;
    
    
	public int getHardwareId() {
		return hardwareId;
	}


	public void setHardwareId(int hardwareId) {
		this.hardwareId = hardwareId;
	}


	public String getHardwareName() {
		return hardwareName;
	}


	public void setHardwareName(String hardwareName) {
		this.hardwareName = hardwareName;
	}


	public Hardware(int hardwareId, String hardwareName) {
		super();
		this.hardwareId = hardwareId;
		this.hardwareName = hardwareName;
	}


	public Hardware() {
		super();
		// TODO Auto-generated constructor stub
	}
  
	
}
