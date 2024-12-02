package com.jagatha.Graphbud_BE.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jagatha.Graphbud_BE.Model.company;

import java.util.Optional;




public interface company_repo extends JpaRepository<company,Long> {

    @SuppressWarnings("null")
    public Optional<company> findById(Long id);
    
}
