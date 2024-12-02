package com.jagatha.Graphbud_BE.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import com.jagatha.Graphbud_BE.Model.profit_loss;

public interface profit_loss_repo extends JpaRepository<profit_loss,Long> {

    @SuppressWarnings("null")
    public Optional<profit_loss> findById(Long id);

    @Query("SELECT p FROM profit_loss p WHERE p.company.id = :companyId")
    public Optional<profit_loss> findByCompanyId(@Param("companyId") Long companyId);
    
}
