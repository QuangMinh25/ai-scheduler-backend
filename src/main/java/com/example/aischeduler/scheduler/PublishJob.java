package com.example.aischeduler.scheduler;

import com.example.aischeduler.service.PostService;
import org.quartz.JobExecutionContext;
import org.springframework.scheduling.quartz.QuartzJobBean;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class PublishJob extends QuartzJobBean {
    @Autowired
    private PostService postService;

    @Override
    protected void executeInternal(JobExecutionContext context) {
        postService.publishScheduledPosts();
    }
}
