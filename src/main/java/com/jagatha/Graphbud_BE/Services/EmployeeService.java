package com.jagatha.Graphbud_BE.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jagatha.Graphbud_BE.IServices.IEmployeeService;
import com.jagatha.Graphbud_BE.Model.company;
import com.jagatha.Graphbud_BE.Model.employee;

import com.jagatha.Graphbud_BE.Repository.company_repo;
import com.jagatha.Graphbud_BE.Repository.employee_repo;

import com.jagatha.Graphbud_BE.Request.EmployeeReq;

@Service
public class EmployeeService implements IEmployeeService {

    @Autowired
    private employee_repo repo;

    @Autowired
    private company_repo repoC;

    @Override
    public employee add(EmployeeReq employee) {
        employee e = new employee();
        company c = new company();
        Optional<company> c1 = repoC.findById(employee.getCompanyId());

        if (c1 != null) {
            c = c1.get();
        }
        e.setCompany(c);
        e.setFull_time(employee.getFull_time());
        e.setIntern(employee.getIntern());
        e.setThird_party(employee.getThird_party());
        e.setId(employee.getId());
        repo.save(e);
        return e;
    }

    @SuppressWarnings("null")
    @Override
    public void delete(Long id) {
        Optional<employee> c = repo.findById(id);
        if (c.isPresent()) {
            repo.delete(c.get());
        }
    }

    @Override
    public List<employee> get_all() {
        List<employee> c = repo.findAll();
        return c;
    }

    @Override
    public employee get_by_id(Long id) {
        Optional<employee> c = repo.findByCompanyId(id);
        if (c.isPresent()) {
            return c.get();
        }
        return null;
    }

    @Override
    public employee update(EmployeeReq employee, Long id) {
        Optional<employee> c = repo.findById(id);
        if (c.isPresent()) {
            employee c1 = c.get();
            c1.setFull_time(employee.getFull_time());
            c1.setIntern(employee.getIntern());
            c1.setThird_party(employee.getThird_party());
            repo.save(c1);
            return c1;
        }
        return null;
    }

}
