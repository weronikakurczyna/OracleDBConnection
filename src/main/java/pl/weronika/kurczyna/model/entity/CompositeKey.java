package pl.weronika.kurczyna.model.entity;

import java.io.Serializable;
import java.sql.Date;

public class CompositeKey implements Serializable {
    private Employee employeeID;
    private Date startDate;
    private Date endDate;
    private Job jobID;
    private Department departmentID;

}
