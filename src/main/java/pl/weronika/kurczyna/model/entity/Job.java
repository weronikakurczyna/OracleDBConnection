package pl.weronika.kurczyna.model.entity;

import org.springframework.lang.Nullable;

import javax.persistence.*;

@Entity(name = "jobs")
@Table(name = "JOBS")
public class Job {
    @Id
    @Column(unique = true, name = "JOB_ID")
    private String jobID;
    @Column(name = "JOB_TITLE")
    private String jobTitle;
    @Nullable
    @Column(name = "MIN_SALARY")
    private Integer minSalary;
    @Nullable
    @Column(name = "MAX_SALARY")
    private Integer maxSalary;

    public Job() {
    }

    public String getJobID() {
        return jobID;
    }

    public void setJobID(String jobID) {
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
