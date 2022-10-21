package org.cap.demo.service;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.cap.demo.model.Hardware;
import org.cap.demo.model.HardwareVo;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-09-15T12:28:43+0530",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.5.jar, environment: Java 17.0.3 (Eclipse Adoptium)"
)
@Component
public class HardwareMapperImpl implements HardwareMapper {

    @Override
    public List<HardwareVo> toHardwareVos(List<Hardware> list) {
        if ( list == null ) {
            return null;
        }

        List<HardwareVo> list1 = new ArrayList<HardwareVo>( list.size() );
        for ( Hardware hardware : list ) {
            list1.add( toHardwareVo( hardware ) );
        }

        return list1;
    }

    @Override
    public Hardware toHardware(HardwareVo hardware) {
        if ( hardware == null ) {
            return null;
        }

        Hardware hardware1 = new Hardware();

        hardware1.setHardwareId( hardware.getHardwareId() );
        hardware1.setHardwareName( hardware.getHardwareName() );
       

        return hardware1;
    }

    @Override
    public HardwareVo toHardwareVo(Hardware hardware1) {
        if ( hardware1 == null ) {
            return null;
        }

        HardwareVo hardwareVo = new HardwareVo();

        hardwareVo.setHardwareId( hardware1.getHardwareId() );
        hardwareVo.setHardwareName( hardware1.getHardwareName() );
        

        return hardwareVo;
    }

    @Override
    public List<Hardware> toHardwares(List<HardwareVo> list) {
        if ( list == null ) {
            return null;
        }

        List<Hardware> list1 = new ArrayList<Hardware>( list.size() );
        for ( HardwareVo hardwareVo : list ) {
            list1.add( toHardware( hardwareVo ) );
        }

        return list1;
    }
}
