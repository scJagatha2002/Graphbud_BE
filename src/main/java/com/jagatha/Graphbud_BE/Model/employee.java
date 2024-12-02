package com.jagatha.Graphbud_BE.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private int full_time;

    private int intern;

    private int third_party;

    @OneToOne
    @JoinColumn(name = "company_id")
    private company company;

    public Long getId() {
        return Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }

    public int getFull_time() {
        return full_time;
    }

    public void setFull_time(int full_time) {
        this.full_time = full_time;
    }

    public int getIntern() {
        return intern;
    }

    public void setIntern(int intern) {
        this.intern = intern;
    }

    public int getThird_party() {
        return third_party;
    }

    public void setThird_party(int third_party) {
        this.third_party = third_party;
    }

    public company getCompany() {
        return company;
    }

    public void setCompany(company company) {
        this.company = company;
    }

    

    

}
