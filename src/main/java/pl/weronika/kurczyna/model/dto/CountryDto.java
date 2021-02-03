package pl.weronika.kurczyna.model.dto;

public class CountryDto {
    private String countryID;
    private String countryName;
    private RegionDto regionID;

    public String getCountryID() {
        return countryID;
    }

    public void setCountryID(String countryID) {
        this.countryID = countryID;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public RegionDto getRegionID() {
        return regionID;
    }

    public void setRegionID(RegionDto regionID) {
        this.regionID = regionID;
    }
}
