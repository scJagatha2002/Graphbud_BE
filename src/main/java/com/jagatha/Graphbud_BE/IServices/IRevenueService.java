package com.jagatha.Graphbud_BE.IServices;

import java.util.List;

import com.jagatha.Graphbud_BE.Model.profit_loss;
import com.jagatha.Graphbud_BE.Request.RevenueReq;

public interface IRevenueService {
    public profit_loss add(RevenueReq profit_loss);
    public void delete(Long id);
    public List<profit_loss> get_all();
    public profit_loss get_by_id(Long id);
    public profit_loss update(RevenueReq profit_loss,Long id);
    
}
