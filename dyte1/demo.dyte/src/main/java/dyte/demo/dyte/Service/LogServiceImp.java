package dyte.demo.dyte.Service;

import java.time.OffsetDateTime;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dyte.demo.dyte.Entity.LogEntity;
import dyte.demo.dyte.Repository.LogRepository;

@Service
public class LogServiceImp implements LogService {

    @Autowired
    private LogRepository logRepository;

    @Override
    public LogEntity saveLogEntity(LogEntity logEntity) {
        
        return logRepository.save(logEntity);
    }

   

    @Override
    public List<LogEntity> listAll(String keyword) {
        if(keyword != null){
        return logRepository.findByKeyword(keyword);
        }
        else{
            return (List<LogEntity>) logRepository.findAll();
        }
    }




@Override
public List<LogEntity> listAll(String keyword, OffsetDateTime startDate, OffsetDateTime endDate) {
    if (keyword != null) {
        return logRepository.findByKeywordAndDateRange(keyword, startDate, endDate);
    } else {
        return (List<LogEntity>) logRepository.findAll();
    }
}



@Override
public LogEntity updateLogEntity(LogEntity logEntity) {
   return logRepository.save(logEntity);
}



@Override
public void deleteLogEntity(Long id) {
    logRepository.deleteById(id);
}

}
