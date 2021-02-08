package pl.weronika.kurczyna.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.weronika.kurczyna.model.dto.CountryDto;
import pl.weronika.kurczyna.model.entity.Country;
import pl.weronika.kurczyna.model.repository.CountryRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CountryService {
    @Autowired
    private CountryRepository countryRepository;
    @Autowired
    private ModelMapper modelMapper;

    public List<CountryDto> getCountries() {
        List<Country> countries = countryRepository.findAll();
        return countries
                .stream()
                .map(country -> convertToDto(country))
                .collect(Collectors.toList());
    }

    public CountryDto getCountryByCountryId(String countryID) {
        return convertToDto(countryRepository.findById(countryID).get());
    }

    private CountryDto convertToDto(Country department) {
        return modelMapper.map(department, CountryDto.class);
    }


    public CountryDto createCountry(CountryDto countryDto) {
        Country newCountry = new Country();
        newCountry.setCountryID(countryDto.getCountryID());
        newCountry.setCountryName(countryDto.getCountryName());
        newCountry.setRegionID(null);

        Country savedCountry = countryRepository.save(newCountry);

        return convertToDto(savedCountry);
    }

    public void deleteCountry(String countryID) {
        countryRepository.deleteById(countryID);
    }
}

