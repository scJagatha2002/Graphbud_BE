package com.jagatha.Graphbud_BE.IServices;

import java.util.List;

import com.jagatha.Graphbud_BE.Model.employee;

import com.jagatha.Graphbud_BE.Request.EmployeeReq;

public interface IEmployeeService {

    public employee add(EmployeeReq employee);
    public void delete(Long id);
    public List<employee> get_all();
    public employee get_by_id(Long id);
    public employee update(EmployeeReq employee,Long id);
    
}
