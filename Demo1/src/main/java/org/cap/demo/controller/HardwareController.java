package org.cap.demo.controller;

import java.util.List;


import org.cap.demo.bo.HardwareBo;
import org.cap.demo.bo.HardwareBoImpl;
import org.cap.demo.dao.Hardwaredb;
import org.cap.demo.mapper.HardwareMapper;
import org.cap.demo.model.Hardware;
import org.cap.demo.model.HardwareVo;
import org.cap.demo.model.HealthcheckEndpoint;
import org.cap.demo.service.HardwareService;
import org.cap.demo.service.HardwareServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/demo1")
public class HardwareController {
	
	/*@Autowired
	private Hardwaredb hardwaredb;
	@Autowired
	private HardwareBo hardwarebo;*/
	@Autowired
	private HardwareService hardwareService;
	
	Logger logger = LoggerFactory.getLogger(HardwareServiceImpl.class);
	
	
	
	@GetMapping("/hardware")
	public ResponseEntity<List<HardwareVo>> getAllHardwareVo(){
		List<HardwareVo> hardware=hardwareService.getAllHardwareVo();
		if(hardware==null || hardware.isEmpty())
			return new ResponseEntity("Sorry! No  DB!", HttpStatus.NOT_FOUND);
		
		logger.info("Data is retriving");
		//return ResponseEntity.ok(hardware);
		return new ResponseEntity<List<HardwareVo>>(hardware,HttpStatus.OK);
	} 
	
	
	
	@PostMapping("/hardware")
	public ResponseEntity<HardwareVo> saveHardwareVo(@Validated @RequestBody HardwareVo hardwarevo){
    	HardwareVo hardware1=hardwareService.saveHardwareVo(hardwarevo);
		//hardwarebo.saveHardware(hardware1);
		if(hardware1==null)
			return new ResponseEntity("Sorry! Insertion Error!", HttpStatus.BAD_REQUEST);
					
		logger.info("Data is saving");		
		//return ResponseEntity.status(HttpStatus.OK).body(hardwarevo);
		return new ResponseEntity<HardwareVo>(hardware1, HttpStatus.OK);
	}
	
	
	
	@GetMapping("/healthcheck")
    public ResponseEntity <HealthcheckEndpoint> healthcheck(){
    	HealthcheckEndpoint healthcheckEndpoint = hardwareService.healthcheck();
    	logger.info("Data is saving in db");
    	return ResponseEntity.status(HttpStatus.OK).body(healthcheckEndpoint);
   }
	
	
  /*  @GetMapping("/hardware")
	public ResponseEntity<List<HardwareVo>> getAllHardwareVo(){
		List<HardwareVo> hardware=hardwaremapper.toHardwareVos(hardwarebo.getAllHardware());
		if(hardware==null || hardware.isEmpty())
			return new ResponseEntity("Sorry! No  DB!", HttpStatus.NOT_FOUND);
		
		logger.info("Data is retriving");
		return ResponseEntity.ok(hardware);
	} 
	
	
    
    @PostMapping("/hardware")
	public ResponseEntity<HardwareVo> saveHardwareVo(@Validated @RequestBody HardwareVo hardwarevo){
    	Hardware hardware1=hardwaremapper.toHardware(hardwarevo);
		hardwarebo.saveHardware(hardware1);
		if(hardware1==null)
			return new ResponseEntity("Sorry! Insertion Error!", HttpStatus.BAD_REQUEST);
					
		logger.info("Data is saving");		
		return ResponseEntity.status(HttpStatus.OK).body(hardwarevo);
	}
    
    @GetMapping("/healthcheck")
    public ResponseEntity <HealthcheckEndpoint> healthcheck(){
    	HealthcheckEndpoint healthcheckEndpoint = hardwaredb.healthcheck();
    	logger.info("Data is saving in db");
    	return ResponseEntity.status(HttpStatus.OK).body(healthcheckEndpoint);
   }*/

}
