package com.jagatha.Graphbud_BE.IServices;

import java.util.List;

import com.jagatha.Graphbud_BE.Model.company;
import com.jagatha.Graphbud_BE.Request.CompanyReq;


public interface ICompnayService {

    public company add(CompanyReq company);
    public void delete(Long id);
    public List<company> get_all();
    public company get_by_id(Long id);
    public company update(CompanyReq company,Long id);
}
