package com.jagatha.Graphbud_BE.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jagatha.Graphbud_BE.IServices.IJobsService;
import com.jagatha.Graphbud_BE.Model.company;
import com.jagatha.Graphbud_BE.Model.jobs;


import com.jagatha.Graphbud_BE.Repository.company_repo;

import com.jagatha.Graphbud_BE.Repository.jobs_repo;
import com.jagatha.Graphbud_BE.Request.JobRequest;

@Service
public class JobsService implements IJobsService {

    @Autowired
    private jobs_repo repo;

    @Autowired
    private company_repo repoC;

    @Override
    public jobs add(JobRequest jobs) {
        jobs e = new jobs();
        company c = new company();
        Optional<company> c1 = repoC.findById(jobs.getCompanyId());

        if (c1 != null) {
            c = c1.get();
        }
        e.setCompany(c);
        e.setDescription(jobs.getDescription());
        e.setId(jobs.getJobId());
        e.setTitle(jobs.getTitle());
        repo.save(e);
        return e;
    }

    @SuppressWarnings("null")
    @Override
    public void delete(Long id) {
        Optional<jobs> c = repo.findById(id);
        if (c.isPresent()) {
            repo.delete(c.get());
        }
    }

    @Override
    public List<jobs> get_all() {
        List<jobs> c = repo.findAll();
        return c;
    }

    @Override
    public jobs get_by_id(Long id) {
        Optional<jobs> c = repo.findById(id);
        if (c.isPresent()) {
            return c.get();
        }
        return null;
    }

    @Override
    public jobs update(JobRequest jobs, Long id) {
        Optional<jobs> c = repo.findById(id);
        if (c.isPresent()) {
            jobs c1 = c.get();
            c1.setDescription(jobs.getDescription());
            c1.setTitle(jobs.getTitle());
            repo.save(c1);
            return c1;
        }
        return null;
    }

}
