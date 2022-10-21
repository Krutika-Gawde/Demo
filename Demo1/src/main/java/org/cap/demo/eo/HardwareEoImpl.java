package org.cap.demo.eo;

import java.util.List;

import org.cap.demo.bo.HardwareBoImpl;
import org.cap.demo.dao.Hardwaredb;
import org.cap.demo.model.Hardware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component("hardwareEo")
public class HardwareEoImpl implements HardwareEo {
	
	@Autowired
	private Hardwaredb hardwareDb;
	
	Logger logger = LoggerFactory.getLogger(HardwareBoImpl.class);

	@Override
	public List<Hardware> getAllHardware() {
		// TODO Auto-generated method stub
		logger.info("Hardware data retrieved");
		return hardwareDb.getAllHardware();
	}

	@Override
	public Hardware saveHardware(Hardware hardware) {
		// TODO Auto-generated method stub
		logger.info("hardware data saved");
		return hardwareDb.saveHardware(hardware);
	}

}
