package dyte.demo.dyte.Service; 
 
import dyte.demo.dyte.Entity.LogEntity; 
 
import java.time.OffsetDateTime;
import java.util.List;


 
public interface LogService { 
 
    public LogEntity saveLogEntity(LogEntity logEntity); 
    public LogEntity updateLogEntity(LogEntity logEntity);
    public  List<LogEntity> listAll(String keyword); 
    public void deleteLogEntity (Long id);        
    List<LogEntity> listAll(String keyword, OffsetDateTime startDate, OffsetDateTime endDate);

}
