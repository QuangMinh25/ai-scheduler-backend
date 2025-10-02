package com.example.aischeduler.service;

import com.example.aischeduler.model.Schedule;
import com.example.aischeduler.repository.ScheduleRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ScheduleService {
    private final ScheduleRepository repo;

    public ScheduleService(ScheduleRepository repo) {
        this.repo = repo;
    }

    public Schedule create(Schedule s) {
        s.setStatus("pending");
        return repo.save(s);
    }

    public List<Schedule> findAll() {
        return repo.findAll();
    }
}
