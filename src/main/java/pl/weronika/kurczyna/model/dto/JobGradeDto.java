package pl.weronika.kurczyna.model.dto;

public class JobGradeDto {
    private String gradeLevel;
    private Integer lowestSal;
    private Integer highestSal;

    public String getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(String gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public Integer getLowestSal() {
        return lowestSal;
    }

    public void setLowestSal(Integer lowestSal) {
        this.lowestSal = lowestSal;
    }

    public Integer getHighestSal() {
        return highestSal;
    }

    public void setHighestSal(Integer highestSal) {
        this.highestSal = highestSal;
    }
}
