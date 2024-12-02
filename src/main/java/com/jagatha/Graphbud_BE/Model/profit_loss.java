package com.jagatha.Graphbud_BE.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class profit_loss {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private int loss;

    private int profit;

    
    @OneToOne
    @JoinColumn(name = "company_id")
    private company company;


    public Long getId() {
        return Id;
    }


    public void setId(Long Id) {
        this.Id = Id;
    }


    public int getLoss() {
        return loss;
    }


    public void setLoss(int loss) {
        this.loss = loss;
    }


    public int getProfit() {
        return profit;
    }


    public void setProfit(int profit) {
        this.profit = profit;
    }


    public company getCompany() {
        return company;
    }


    public void setCompany(company company) {
        this.company = company;
    }

    
    
}
