package com.example.aischeduler.repository;

import com.example.aischeduler.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
