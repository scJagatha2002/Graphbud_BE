package com.jagatha.Graphbud_BE.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.jagatha.Graphbud_BE.Model.ceo;





public interface ceo_repo extends JpaRepository<ceo,Long> {

    @SuppressWarnings("null")
    public Optional<ceo> findById(Long id);

    @Query("SELECT c FROM ceo c WHERE c.company.id = :companyId")
    public Optional<ceo> findByCompanyId(@Param("companyId") Long companyId);
    
}
