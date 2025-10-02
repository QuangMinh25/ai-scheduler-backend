package com.example.aischeduler.repository;

import com.example.aischeduler.model.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDateTime;
import java.util.List;

public interface ScheduleRepository extends JpaRepository<Schedule, Long> {
    List<Schedule> findByStatusAndScheduledAtBefore(String status, LocalDateTime now);
}
