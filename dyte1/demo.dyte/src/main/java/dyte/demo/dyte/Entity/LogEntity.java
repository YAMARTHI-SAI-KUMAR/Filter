package dyte.demo.dyte.Entity;
// import com.fasterxml.jackson.core.JsonProcessingException;
// import com.fasterxml.jackson.databind.JsonNode;
// import com.fasterxml.jackson.databind.ObjectMapper;

import jakarta.persistence.*;
import java.time.OffsetDateTime;

@Entity
@Table(name = "dyte")
public class LogEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)   
     private Long id;
    private String level;
    private String message;    
    private String resourceId;
    private OffsetDateTime timestamp;    
    private String traceId;
    private String spanId;    
    private String commit;
    
    private String parentResourceId;
   
    




    public String getParentResourceId() {
        return parentResourceId;
    }
    public void setParentResourceId(String parentResourceId) {
        this.parentResourceId = parentResourceId;
    }

    public Long getId() {       
         return id;
    }
    public void setId(Long id) {        
        this.id = id;
    }
    public String getLevel() {        
        return level;
    }
    public void setLevel(String level) {       
         this.level = level;
    }
    public String getMessage() {       
         return message;
    }
    public void setMessage(String message) {       
         this.message = message;
    }
    public String getResourceId() {        
        return resourceId;
    }
    public void setResourceId(String resourceId) {       
         this.resourceId = resourceId;
    }
    public OffsetDateTime getTimestamp() {       
         return timestamp;
    }
    public void setTimestamp(OffsetDateTime timestamp) {     
           this.timestamp = timestamp;
    }
    public String getTraceId() {
        return traceId;
    }
    public void setTraceId(String traceId) {       
         this.traceId = traceId;
    }
    public String getSpanId() {       
         return spanId;
    }
    public void setSpanId(String spanId) {       
         this.spanId = spanId;
    }
    public String getCommit() {       
         return commit;
    }
    public void setCommit(String commit) {       
         this.commit = commit;
    }
    
}
