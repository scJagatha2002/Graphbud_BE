package com.jagatha.Graphbud_BE.Request;

public class JobRequest {
    private Long JobId;
    private Long CompanyId;
    private String title;
    private String description;
    public JobRequest(Long jobId, Long companyId, String title, String description) {
        JobId = jobId;
        CompanyId = companyId;
        this.title = title;
        this.description = description;
    }
    public Long getJobId() {
        return JobId;
    }
    public void setJobId(Long jobId) {
        JobId = jobId;
    }
    public Long getCompanyId() {
        return CompanyId;
    }
    public void setCompanyId(Long companyId) {
        CompanyId = companyId;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    
}
