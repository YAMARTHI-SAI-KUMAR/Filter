package dyte.demo.dyte.Controller; 
 
import dyte.demo.dyte.Entity.LogEntity; 
import dyte.demo.dyte.Service.LogService; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model; 
import org.springframework.web.bind.annotation.*;
import java.time.OffsetDateTime;

import java.util.List;
 
@Controller
public class LogEntityController { 
 
    @Autowired 
    private LogService logService; 
 
    @PostMapping("/logs") 
    public LogEntity insertLogEntity(@RequestBody LogEntity logEntity) { 
        logService.saveLogEntity(logEntity); 
        return logEntity; 
    } 
 
    
@RequestMapping("/index")
public String viewHomePage1(Model model,
                            @RequestParam(name = "keyword", required = false) String keyword,
                            @RequestParam(name = "startDate", required = false) @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ssXXX") OffsetDateTime startDate,
                            @RequestParam(name = "endDate", required = false) @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ssXXX") OffsetDateTime endDate) {

    List<LogEntity> logList;
    if (startDate != null && endDate != null) {
        logList = logService.listAll(keyword, startDate, endDate);
    } else {
        logList = logService.listAll(keyword);
    }

    model.addAttribute("logList", logList);
    model.addAttribute("keyword", keyword);

    return "index";
}

@PutMapping("/logs/{id}")
public String update(@PathVariable Long id,@RequestBody LogEntity logEntity){
    logEntity.setId(id);
   logService.updateLogEntity(logEntity);
   return "index"; 

}

@DeleteMapping("/{id}")
public ResponseEntity<String> delete(Model model,@PathVariable Long id){
   logService.deleteLogEntity(id);
    return ResponseEntity.ok("index");
}









   
   

    





    




}
