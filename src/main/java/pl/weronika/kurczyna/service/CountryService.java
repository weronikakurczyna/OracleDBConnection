package pl.weronika.kurczyna.service;

import pl.weronika.kurczyna.model.dto.CountryDto;
import pl.weronika.kurczyna.model.entity.Country;
import pl.weronika.kurczyna.model.repository.CountryRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CountryService implements CountryServiceInterface {
    @Autowired
    private CountryRepository countryRepository;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<CountryDto> getCountries() {
        List<Country> countries = countryRepository.findAll();
        return countries.stream()
                .map(country -> convertToDto(country))
                .collect(Collectors.toList());
    }

    @Override
    public CountryDto getCountryID(Integer countryID) {
        return convertToDto(countryRepository.findById(countryID).get());
    }

    private CountryDto convertToDto(Country department) {
        return modelMapper.map(department, CountryDto.class);
    }
}
