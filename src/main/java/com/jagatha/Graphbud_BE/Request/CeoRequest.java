package com.jagatha.Graphbud_BE.Request;

public class CeoRequest {

    Long id;
    Long companyId;
    String name;
    String email;
    public CeoRequest(Long id, Long companyId, String name, String email) {
        this.id = id;
        this.companyId = companyId;
        this.name = name;
        this.email = email;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getCompanyId() {
        return companyId;
    }
    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
