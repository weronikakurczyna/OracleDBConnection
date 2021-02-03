package pl.weronika.kurczyna.model.entity;

import org.springframework.lang.Nullable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity (name = "regions")
@Table(name = "REGIONS")
public class Region {
    @Id
    @Column(unique = true, name = "REGION_ID")
    private Integer regionID;
    @Nullable
    @Column(name = "REGION_NAME")
    private String regionName;

    public Region() {
    }

    public Integer getRegionID() {
        return regionID;
    }

    public void setRegionID(Integer regionID) {
        this.regionID = regionID;
    }

    @Nullable
    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(@Nullable String regionName) {
        this.regionName = regionName;
    }
}
