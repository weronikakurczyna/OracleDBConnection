package pl.weronika.kurczyna.model.entity;

import org.springframework.lang.Nullable;

import javax.persistence.*;

@Entity(name = "locations")
@Table(name = "LOCATIONS")
public class Location {
    @Id
    @Column(unique = true, name = "LOCATION_ID")
    private String locationID;
    @Nullable
    @Column(name = "STREET_ADDRESS")
    private String streetAddress;
    @Nullable
    @Column(name = "POSTAL_CODE")
    private String postalCode;
    @Column(name = "CITY")
    private String city;
    @Nullable
    @Column(name = "STATE_PROVINCE")
    private String stateProvince;
    @JoinColumn(name = "COUNTRY_ID")
    @Nullable
    @ManyToOne(fetch = FetchType.EAGER)
    private Country countryID;

    public Location() {
    }

    public String getLocationID() {
        return locationID;
    }

    public void setLocationID(String locationID) {
        this.locationID = locationID;
    }

    @Nullable
    public Country getCountryID() {
        return countryID;
    }

    public void setCountryID(@Nullable Country countryID) {
        this.countryID = countryID;
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


}
