package com.jagatha.Graphbud_BE.IServices;

import java.util.List;

import com.jagatha.Graphbud_BE.Model.ceo;
import com.jagatha.Graphbud_BE.Request.CeoRequest;

public interface ICeoService {
    public ceo add(CeoRequest ceo);
    public void delete(Long id);
    public List<ceo> get_all();
    public ceo get_by_id(Long id);
    public ceo update(CeoRequest ceo,Long id);
    
    
}
