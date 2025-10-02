package com.example.aischeduler.service;

import com.example.aischeduler.model.Schedule;
import com.example.aischeduler.repository.ScheduleRepository;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class PostService {
    private final ScheduleRepository repo;

    public PostService(ScheduleRepository repo) {
        this.repo = repo;
    }

    public void publishScheduledPosts() {
        List<Schedule> pending = repo.findByStatusAndScheduledAtBefore("pending", LocalDateTime.now());
        for (Schedule s : pending) {
            System.out.println("📢 Đăng bài: " + s.getTopic() + " (ID=" + s.getId() + ")");
            s.setStatus("posted");
            repo.save(s);
        }
    }
}
