package pl.weronika.kurczyna.model.dto;

public class LocationDto {
    private String locationID;
    private String streetAddress;
    private String postalCode;
    private String city;
    private CountryDto countryID;
    private String stateProvince;

    public String getLocationID() {
        return locationID;
    }

    public void setLocationID(String locationID) {
        this.locationID = locationID;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public CountryDto getCountryID() {
        return countryID;
    }

    public void setCountryID(CountryDto countryID) {
        this.countryID = countryID;
    }

    public String getStateProvince() {
        return stateProvince;
    }

    public void setStateProvince(String stateProvince) {
        this.stateProvince = stateProvince;
    }
}
