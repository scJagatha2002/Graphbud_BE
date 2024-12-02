package com.jagatha.Graphbud_BE.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jagatha.Graphbud_BE.IServices.ICompnayService;
import com.jagatha.Graphbud_BE.Model.company;
import com.jagatha.Graphbud_BE.Repository.company_repo;
import com.jagatha.Graphbud_BE.Request.CompanyReq;


@Service
public class CompanyService implements ICompnayService {

    @Autowired
    private company_repo repo;

    @Override
    public company add(CompanyReq company) {
        company c = new company();
        c.setId(company.getId());
        c.setName(company.getName());
        c.setLocation(company.getLocation());
        repo.save(c);
        return c;
    }

    @SuppressWarnings("null")
    @Override
    public void delete(Long id) {
        Optional<company> c = repo.findById(id);
        if(c.isPresent()){
            repo.delete(c.get());
        }
        
    }

    @Override
    public List<company> get_all() {
        List<company> c = repo.findAll();
        return c;
    }

    @Override
    public company get_by_id(Long id) {
        Optional<company> c = repo.findById(id);
        if(c.isPresent()){
            return c.get();
        }
        return null;
       
    }

    @Override
    public company update(CompanyReq company, Long id) {
        Optional<company> c = repo.findById(id);
        if(c.isPresent()){
            company c1 = c.get();
            c1.setName(company.getName());
            c1.setLocation(company.getLocation());
            repo.save(c1);
            return c1;
        }
        return null;
    }
    
    
}
