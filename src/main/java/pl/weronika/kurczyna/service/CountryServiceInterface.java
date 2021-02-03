package pl.weronika.kurczyna.service;

import pl.weronika.kurczyna.model.dto.CountryDto;

import java.util.List;

public interface CountryServiceInterface {
    List<CountryDto> getCountries();

    CountryDto getCountryID(Integer countryID);
}
