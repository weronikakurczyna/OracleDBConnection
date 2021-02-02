package oracle.model.entity;

import org.springframework.lang.Nullable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity(name = "countries")
public class Country {
    @javax.persistence.Id
    @Column(unique = true)
    private Integer countryID;
    @Nullable
    private String countryName;
    @Nullable
    @ManyToOne
    private Region region;

    public Country() {}

    public Integer getCountryID() {
        return countryID;
    }

    public void setCountryID(Integer countryID) {
        this.countryID = countryID;
    }

    @Nullable
    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(@Nullable String countryName) {
        this.countryName = countryName;
    }

    @Nullable
    public Region getRegion() {
        return region;
    }

    public void setRegion(@Nullable Region region) {
        this.region = region;
    }
}
