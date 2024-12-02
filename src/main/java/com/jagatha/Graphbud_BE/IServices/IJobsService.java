package com.jagatha.Graphbud_BE.IServices;

import java.util.List;

import com.jagatha.Graphbud_BE.Model.jobs;
import com.jagatha.Graphbud_BE.Request.JobRequest;

public interface IJobsService {

    public jobs add(JobRequest jobs);
    public void delete(Long id);
    public List<jobs> get_all();
    public jobs get_by_id(Long id);
    public jobs update(JobRequest jobs,Long id);
    
}
