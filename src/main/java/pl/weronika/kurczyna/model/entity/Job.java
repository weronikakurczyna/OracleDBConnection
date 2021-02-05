package pl.weronika.kurczyna.model.entity;

import org.springframework.lang.Nullable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "jobs")
@Table(name = "JOBS")
public class Job {
    @Id
    @Column(unique = true, name = "JOB_ID")
    private String id;
    @Column(name = "JOB_TITLE")
    private String jobTitle;
    @Nullable
    @Column(name = "MIN_SALARY")
    private Integer minSalary;
    @Nullable
    @Column(name = "MAX_SALARY")
    private Integer maxSalary;
//    @OneToMany(
//            mappedBy = "JOBS",
//            cascade = CascadeType.ALL,
//            orphanRemoval = true
//    )
//    private List<Employee> emp = new ArrayList<>();


    public Job() {
    }

    public String getId() {
        return id;
    }

    public void setId(String jobID) {
        this.id = jobID;
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
