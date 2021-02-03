package pl.weronika.kurczyna.model.entity;

import org.springframework.lang.Nullable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

@Entity(name = "locations")
public class Location {
    @javax.persistence.Id
    @Column(unique = true)
    private Integer locationID;
    @Nullable
    private String streetAddress;
    @Nullable
    private String postalCode;
    private String city;
    @Nullable
    private String stateProvince;
    @Nullable
    @ManyToOne(fetch = FetchType.EAGER)
    private Country country;

    private Location() {
    }

    public Integer getLocationID() {
        return locationID;
    }

    public void setLocationID(Integer locationID) {
        this.locationID = locationID;
    }

    @Nullable
    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(@Nullable String streetAddress) {
        this.streetAddress = streetAddress;
    }

    @Nullable
    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(@Nullable String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Nullable
    public String getStateProvince() {
        return stateProvince;
    }

    public void setStateProvince(@Nullable String stateProvince) {
        this.stateProvince = stateProvince;
    }

    @Nullable
    public Country getCountry() {
        return country;
    }

    public void setCountry(@Nullable Country country) {
        this.country = country;
    }
}
