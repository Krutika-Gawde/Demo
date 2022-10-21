package org.cap.demo.service;

import java.util.List;

import org.cap.demo.bo.HardwareBo;
import org.cap.demo.mapper.HardwareMapper;
import org.cap.demo.model.HardwareVo;
import org.cap.demo.model.HealthcheckEndpoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component("hardwareService")
public class HardwareServiceImpl implements HardwareService {

	
	@Autowired
	private HardwareBo hardwareBo;
	
	@Autowired 
	private HardwareMapper hardwareMapper;
	
	
	Logger logger= LoggerFactory.getLogger(HardwareServiceImpl.class);
	
	@Override
	public List<HardwareVo> getAllHardwareVo() {
		// TODO Auto-generated method stub
		logger.info("Hardware data retrieved");
		return hardwareMapper.toHardwareVos(hardwareBo.getAllHardware());
	}

	@Override
	public HardwareVo saveHardwareVo(HardwareVo hardware) {
		// TODO Auto-generated method stub
		logger.info("Hardware data saved");
		return hardwareMapper.toHardwareVo(hardwareBo.saveHardware(hardwareMapper.toHardware(hardware)));
	}

	@Override
	public HealthcheckEndpoint healthcheck() {
		// TODO Auto-generated method stub
		logger.info("Healthcheck in progress");
		return hardwareBo.healthcheck();
	}

}
