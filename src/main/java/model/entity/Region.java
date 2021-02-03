package model.entity;

import org.springframework.lang.Nullable;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity (name = "regions")
public class Region {
    @javax.persistence.Id
    @Column(unique = true)
    private Integer regionID;
    @Nullable
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
