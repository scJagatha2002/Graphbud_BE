package com.jagatha.Graphbud_BE.Request;

public class RevenueReq {

    private Long RevenueId;
    private Long CompanyId;
    private int profit;
    private int loss;
    public RevenueReq(Long revenueId, Long companyId, int profit, int loss) {
        RevenueId = revenueId;
        CompanyId = companyId;
        this.profit = profit;
        this.loss = loss;
    }
    public Long getRevenueId() {
        return RevenueId;
    }
    public void setRevenueId(Long revenueId) {
        RevenueId = revenueId;
    }
    public Long getCompanyId() {
        return CompanyId;
    }
    public void setCompanyId(Long companyId) {
        CompanyId = companyId;
    }
    public int getProfit() {
        return profit;
    }
    public void setProfit(int profit) {
        this.profit = profit;
    }
    public int getLoss() {
        return loss;
    }
    public void setLoss(int loss) {
        this.loss = loss;
    }

    
    
}
