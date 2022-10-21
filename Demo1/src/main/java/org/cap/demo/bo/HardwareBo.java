package org.cap.demo.bo;

import java.util.List;

import org.cap.demo.model.Hardware;
import org.cap.demo.model.HealthcheckEndpoint;

public interface HardwareBo {
	
	public List<Hardware> getAllHardware();
	public Hardware saveHardware(Hardware hardware);
	public HealthcheckEndpoint healthcheck();

}
