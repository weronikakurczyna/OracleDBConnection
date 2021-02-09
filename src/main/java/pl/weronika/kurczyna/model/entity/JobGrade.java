package pl.weronika.kurczyna.model.entity;

import org.springframework.lang.Nullable;

import javax.persistence.*;

@Entity(name = "jobGrades")
@Table(name = "JOB_GRADES")
public class JobGrade {
    @Id
    @Nullable
    @Column(unique = true, name = "GRADE_LEVEL")
    private String gradeLevel;
    @Nullable
    @Column(name = "LOWEST_SAL")
    private Integer lowestSal;
    @Nullable
    @Column(name = "HIGHEST_SAL")
    private Integer highestSal;

    @Nullable
    public String getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(@Nullable String gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    @Nullable
    public Integer getLowestSal() {
        return lowestSal;
    }

    public void setLowestSal(@Nullable Integer lowestSal) {
        this.lowestSal = lowestSal;
    }

    @Nullable
    public Integer getHighestSal() {
        return highestSal;
    }

    public void setHighestSal(@Nullable Integer highestSal) {
        this.highestSal = highestSal;
    }
}
