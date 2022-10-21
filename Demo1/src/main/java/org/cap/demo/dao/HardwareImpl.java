package org.cap.demo.dao;

import java.util.List;

import org.cap.demo.exception.TableNotFoundException;
import org.cap.demo.model.Hardware;
import org.cap.demo.model.HardwareVo;
import org.cap.demo.dao.Hardwaredb;
import org.cap.demo.model.HealthcheckEndpoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.BadSqlGrammarException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository("hardwareDb")
public class HardwareImpl implements Hardwaredb {
	@Autowired
	JdbcTemplate jdbcTemplate;


	
	Logger logger = LoggerFactory.getLogger(Hardwaredb.class);



	@Override
	public List<Hardware> getAllHardware() {
		// TODO Auto-generated method stub
		logger.info("Get Hardware info from database");
		return jdbcTemplate.query("SELECT * FROM Hardware", BeanPropertyRowMapper.newInstance(Hardware.class));
	}



	@Override
	public Hardware saveHardware(Hardware hardware) {
		// TODO Auto-generated method stub
		jdbcTemplate.update("INSERT INTO Hardware(HARDWAREID, HARDWARENAME) VALUES (?,?)",
				new Object[] {hardware.getHardwareId(), hardware.getHardwareName()});
 		return hardware;
	}





	
	
/*	@Override
	public List<HardwareVo> getAllHardwareVo() {
		// TODO Auto-generated method stub
		String query1="select * from hardwarevo";
		logger.info("Find all the data");
		return jdbcTemplate1.query(query1,(rs,rowNum) ->
		new HardwareVo(
		rs.getInt("hardwareId"),
		rs.getString("hardwareName")
		));
	}

	@Override
	public List<HardwareVo> saveHardwareVo(HardwareVo hardware) {
		// TODO Auto-generated method stub
		String query="insert into hardwarevo values('"+hardware.getHardwareId()+"','"+hardware.getHardwareName()+"')";
			jdbcTemplate1.update(query);
			logger.info("Creating");
		return getAllHardwareVo();
	}
	
	@Override
	public HealthcheckEndpoint healthcheck() throws TableNotFoundException{
    logger.debug("Begining of table availability check");
	HealthcheckEndpoint healthcheckEndpoint= new HealthcheckEndpoint();
	healthcheckEndpoint.setSystemName("Check Table is available in db");
	try
	{
		if(getAllHardwareVo()!=null)
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
	}*/

	


}
