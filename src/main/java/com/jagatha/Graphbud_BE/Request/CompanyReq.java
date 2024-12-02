package com.jagatha.Graphbud_BE.Request;


public class CompanyReq {

    private Long Id;
    private String name;
    private String Location;
    
    public CompanyReq(Long id, String name, String location) {
        Id = id;
        this.name = name;
        Location = location;
    }

    public Long getId() {
        return Id;
    }
    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public String getLocation() {
        return Location;
    }
    public void setLocation(String location) {
        Location = location;
    }

    

    
}
