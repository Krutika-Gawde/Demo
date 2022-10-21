package org.cap.demo.mapper;

import java.util.List;



import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.Mapping;
import org.slf4j.Logger;

import org.cap.demo.model.Hardware;
import org.cap.demo.model.HardwareVo;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "Spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface HardwareMapper {
	

	
		 Logger Logger = LoggerFactory.getLogger("mapper is mapping vo to dto");
			
		    HardwareMapper MAPPER= Mappers.getMapper(HardwareMapper.class);
		    List<HardwareVo> toHardwareVos(List<Hardware> list);
		    Hardware toHardware(HardwareVo hardware);
		    HardwareVo toHardwareVo(Hardware hardware1);
		    List<Hardware> toHardwares(List<HardwareVo> list);
	}