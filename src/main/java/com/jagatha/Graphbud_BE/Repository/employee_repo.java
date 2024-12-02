package com.jagatha.Graphbud_BE.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.jagatha.Graphbud_BE.Model.employee;

public interface employee_repo extends JpaRepository<employee,Long> {

    @SuppressWarnings("null")
    public Optional<employee> findById(Long id);
    
    @Query("SELECT e FROM employee e WHERE e.company.id = :companyId")
    public Optional<employee> findByCompanyId(@Param("companyId") Long companyId);
    
}

