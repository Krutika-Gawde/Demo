package org.cap.demo.dao;

import java.util.List;

import org.cap.demo.model.Hardware;
//import org.cap.demo.model.HardwareVo;
//import org.cap.demo.model.HealthcheckEndpoint;

public interface Hardwaredb {
	
	/*public List<HardwareVo> getAllHardwareVo();
	public List<HardwareVo> saveHardwareVo(HardwareVo hardware);
	public HealthcheckEndpoint healthcheck();*/
	
	public List<Hardware> getAllHardware();
	public Hardware saveHardware(Hardware hardware);

}
