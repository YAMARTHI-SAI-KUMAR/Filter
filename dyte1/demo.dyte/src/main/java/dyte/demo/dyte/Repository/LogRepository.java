package dyte.demo.dyte.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import dyte.demo.dyte.Entity.LogEntity;

import java.time.OffsetDateTime;
import java.util.List;

public interface LogRepository extends JpaRepository<LogEntity, Long> {

    



    @Query("SELECT logEntity FROM LogEntity logEntity WHERE " +
    "(:keyword IS NULL OR CONCAT(logEntity.id, ' ', logEntity.level, ' ', logEntity.message, ' ', logEntity.resourceId, ' ', logEntity.traceId, ' ', logEntity.spanId, ' ', logEntity.commit, ' ', logEntity.parentResourceId) LIKE %:keyword%) " +
    "AND (logEntity.timestamp BETWEEN :startDate AND :endDate)")
public List<LogEntity> findByKeywordAndDateRange(@Param("keyword") String keyword,
                                             @Param("startDate") OffsetDateTime startDate,
                                             @Param("endDate") OffsetDateTime endDate);






       @Query("SELECT logEntity FROM LogEntity logEntity WHERE CONCAT(logEntity.id, ' ', logEntity.level, ' ', logEntity.message, ' ', logEntity.resourceId, ' ', logEntity.timestamp, ' ', logEntity.traceId, ' ', logEntity.spanId, ' ', logEntity.commit, ' ', logEntity.parentResourceId) LIKE %:keyword%")

        public List<LogEntity> findByKeyword(String keyword);





}
