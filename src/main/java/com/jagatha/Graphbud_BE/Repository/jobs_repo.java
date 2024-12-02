package com.jagatha.Graphbud_BE.Repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;



import com.jagatha.Graphbud_BE.Model.jobs;

public interface jobs_repo extends JpaRepository<jobs,Long> {

    @SuppressWarnings("null")
    public Optional<jobs> findById(Long id);

    
    
}