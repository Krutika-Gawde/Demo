package org.cap.demo.eo;

import java.util.List;

import org.cap.demo.model.Hardware;

public interface HardwareEo {
	public List<Hardware> getAllHardware();
	public Hardware saveHardware(Hardware hardware);
}
