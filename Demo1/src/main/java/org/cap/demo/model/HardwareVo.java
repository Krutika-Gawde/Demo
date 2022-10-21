package org.cap.demo.model;

import io.micrometer.core.lang.NonNull;

public class HardwareVo {
	
	@NonNull 
	private int hardwareId;
	
	@NonNull 
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

	public HardwareVo(int hardwareId, String hardwareName) {
		super();
		this.hardwareId = hardwareId;
		this.hardwareName = hardwareName;
	}

	public HardwareVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
    
	

}
