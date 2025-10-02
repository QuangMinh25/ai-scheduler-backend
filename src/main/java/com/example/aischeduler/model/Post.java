package com.example.aischeduler.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "posts")
@Data
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "schedule_id")
    private Schedule schedule;

    @Column(columnDefinition = "TEXT")
    private String content;
    private String platform;
    private String publishedUrl;
    private String status;
}
