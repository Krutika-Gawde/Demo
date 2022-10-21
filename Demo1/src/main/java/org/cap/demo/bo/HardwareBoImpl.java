package org.cap.demo.bo;

import java.util.List;



//import javax.transaction.Transactional;

//import org.cap.demo.dao.Hardwaredb;
import org.cap.demo.eo.HardwareEo;
import org.cap.demo.exception.TableNotFoundException;
import org.cap.demo.mapper.HardwareMapper;
import org.cap.demo.model.Hardware;
import org.cap.demo.model.HardwareVo;
import org.cap.demo.model.HealthcheckEndpoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.BadSqlGrammarException;
import org.springframework.stereotype.Service;


@Service("hardwareBo")
public class HardwareBoImpl implements HardwareBo  {
	
	/*@Autowired
	private Hardwaredb hardwaredb;
	@Autowired
	private HardwareMapper hardwaremapper;*/
	
	@Autowired
	private HardwareEo hardwareEo;
	
	Logger logger = LoggerFactory.getLogger(HardwareBoImpl.class);

	@Override
	public List<Hardware> getAllHardware() {
		// TODO Auto-generated method stub
		logger.info("Hardware data retrieved");
		return hardwareEo.getAllHardware();
	}

	@Override
	public Hardware saveHardware(Hardware hardware) {
		// TODO Auto-generated method stub
		logger.info("Hardware data saved");
		return hardwareEo.saveHardware(hardware);
	}
	
	
	
	@Override
	public HealthcheckEndpoint healthcheck() throws TableNotFoundException{
    logger.debug("Begining of table availability check");
	HealthcheckEndpoint healthcheckEndpoint= new HealthcheckEndpoint();
	healthcheckEndpoint.setSystemName("Check Table is available in db");
	try
	{
		if(getAllHardware()!=null)
		{
			healthcheckEndpoint.setSystemCode("Success");
			healthcheckEndpoint.setSystemDescription("Table is availabe");
		}
	}
	catch(BadSqlGrammarException ex)
	{
		healthcheckEndpoint.setSystemCode("Failure");
		healthcheckEndpoint.setSystemDescription("Table is not availabe");
		logger.error("Exception in property loading healthcheck");
	}
	return healthcheckEndpoint;
	}
	
	

	/*@Override
	public HealthcheckEndpoint healthcheck() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	@Transactional
	@Override
	public List<Hardware> getAllHardware(){
		// TODO Auto-generated method stub
		logger.info("Getting Customers");
		return hardwaremapper.toHardwares(hardwaredb.getAllHardwareVo());
	}
     
	@Transactional
	@Override
	public  Hardware saveHardware(Hardware hardware) {
		// TODO Auto-generated method stub
		
		List<HardwareVo> hardware2= hardwaredb.saveHardwareVo(hardwaremapper.toHardwareVo(hardware));
		logger.info("Getting Customers");
	
		return hardware;
	}
	
	@Override
	public HealthcheckEndpoint healthcheck() {
		
		HealthcheckEndpoint healthcheckEndpoint = hardwaredb.healthcheck();
		return healthcheckEndpoint;
	}*/


}
