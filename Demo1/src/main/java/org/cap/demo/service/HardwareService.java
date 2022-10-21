package org.cap.demo.service;

import java.util.List;

//import org.cap.demo.model.Hardware;
import org.cap.demo.model.HardwareVo;
import org.cap.demo.model.HealthcheckEndpoint;

public interface HardwareService {

	public List<HardwareVo> getAllHardwareVo();
	public HardwareVo saveHardwareVo(HardwareVo hardware);
	public HealthcheckEndpoint healthcheck();
	
}
