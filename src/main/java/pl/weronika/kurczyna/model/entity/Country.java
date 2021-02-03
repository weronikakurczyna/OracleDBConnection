package pl.weronika.kurczyna.model.entity;

import org.springframework.lang.Nullable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity(name = "countries")
public class Country {
    @Id
    @Column(unique = true)
    private String countryID;
    @Nullable
    private String countryName;
    @Nullable
    @ManyToOne
    private Region regionID;


    public Country() {
    }


    @Nullable
    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(@Nullable String countryName) {
        this.countryName = countryName;
    }

    @Nullable
    public Region getRegionID() {
        return regionID;
    }

    public void setRegionID(@Nullable Region regionID) {
        this.regionID = regionID;
    }
}
