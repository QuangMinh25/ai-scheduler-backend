package com.example.aischeduler.controller;

import com.example.aischeduler.model.Schedule;
import com.example.aischeduler.service.ScheduleService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/schedule")
public class ScheduleController {
    private final ScheduleService service;

    public ScheduleController(ScheduleService service) {
        this.service = service;
    }

    @PostMapping
    public Schedule create(@RequestBody Schedule s) {
        return service.create(s);
    }

    @GetMapping
    public List<Schedule> list() {
        return service.findAll();
    }
}
