package com.jagatha.Graphbud_BE.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jagatha.Graphbud_BE.IServices.ICeoService;
import com.jagatha.Graphbud_BE.Model.ceo;
import com.jagatha.Graphbud_BE.Model.company;

import com.jagatha.Graphbud_BE.Repository.ceo_repo;
import com.jagatha.Graphbud_BE.Repository.company_repo;

import com.jagatha.Graphbud_BE.Request.CeoRequest;

@Service
public class CeoService  implements ICeoService{

    @Autowired
    private ceo_repo repo;

    @Autowired
    private company_repo repoC;

    @Override
    public ceo add(CeoRequest ceo) {
        ceo e = new ceo();
        company c = new company();
        Optional<company> c1 = repoC.findById(ceo.getCompanyId());

        if (c1 != null) {
            c = c1.get();
        }
        e.setCompany(c);
        e.setId(ceo.getId());
        e.setName(ceo.getName());
        e.setEmail(ceo.getEmail());
        repo.save(e);
        return e;
    }

    @SuppressWarnings("null")
    @Override
    public void delete(Long id) {
        Optional<ceo> c = repo.findById(id);
        if (c.isPresent()) {
            repo.delete(c.get());
        }
    }

    @Override
    public List<ceo> get_all() {
        List<ceo> c = repo.findAll();
        return c;
    }

    @Override
    public ceo get_by_id(Long id) {
        Optional<ceo> c = repo.findByCompanyId(id);
        if (c.isPresent()) {
            return c.get();
        }
        return null;
    }

    @Override
    public ceo update(CeoRequest ceo, Long id) {
        Optional<ceo> c = repo.findById(id);
        if (c.isPresent()) {
            ceo c1 = c.get();
            c1.setName(ceo.getName());
            c1.setEmail(ceo.getEmail());
            repo.save(c1);
            return c1;
        }
        return null;
    }
    
}
