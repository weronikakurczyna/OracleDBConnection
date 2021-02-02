package oracle.model.entity;

import org.springframework.lang.Nullable;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name = "jobs")
public class Job {
    @javax.persistence.Id
    @Column(unique = true)
    private Integer jobID;
    private String jobTitle;
    @Nullable
    private Integer minSalary;
    @Nullable
    private Integer maxSalary;

    public Job() {
    }

    public Integer getJobID() {
        return jobID;
    }

    public void setJobID(Integer jobID) {
        this.jobID = jobID;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Nullable
    public Integer getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(@Nullable Integer minSalary) {
        this.minSalary = minSalary;
    }

    @Nullable
    public Integer getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(@Nullable Integer maxSalary) {
        this.maxSalary = maxSalary;
    }
}
