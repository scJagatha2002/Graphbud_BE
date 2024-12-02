package com.jagatha.Graphbud_BE.Request;

public class EmployeeReq {

    private Long id;
    private Long CompanyId;
    private int intern;
    private int full_time;
    private int third_party;

    public EmployeeReq() {
       
    }
    
    public EmployeeReq(Long id, Long companyId, int intern, int full_time, int third_party) {
        this.id = id;
        CompanyId = companyId;
        this.intern = intern;
        this.full_time = full_time;
        this.third_party = third_party;
    }
    public Long getCompanyId() {
        return CompanyId;
    }
    public void setCompanyId(Long companyId) {
        CompanyId = companyId;
    }
    public int getIntern() {
        return intern;
    }
    public void setIntern(int intern) {
        this.intern = intern;
    }
    public int getFull_time() {
        return full_time;
    }
    public void setFull_time(int full_time) {
        this.full_time = full_time;
    }
    public int getThird_party() {
        return third_party;
    }
    public void setThird_party(int third_party) {
        this.third_party = third_party;
    }
    public EmployeeReq(Long id) {
        this.id = id;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    

    
    
}
