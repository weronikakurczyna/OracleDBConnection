package pl.weronika.kurczyna.model.entity;

import org.springframework.lang.Nullable;

import javax.persistence.*;

@Entity(name = "countries")
@Table(name = "COUNTRIES")
public class Country {
    @Id
    @Column(unique = true, name = "COUNTRY_ID")
    private String countryID;
    @Column(name = "COUNTRY_NAME")
    @Nullable
    private String countryName;
    @JoinColumn(name = "REGION_ID")
    @Nullable
    @ManyToOne(fetch = FetchType.EAGER)
    private Region regionID;

    public Country() {

    }

    public String getCountryID() {
        return countryID;
    }

    public void setCountryID(String countryID) {
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
    public Region getRegionID() {
        return regionID;
    }

    public void setRegionID(@Nullable Region regionID) {
        this.regionID = regionID;
    }
}
