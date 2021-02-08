package pl.weronika.kurczyna.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.weronika.kurczyna.model.dto.CountryDto;
import pl.weronika.kurczyna.service.CountryService;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class CountryController {
    @Autowired
    private CountryService countryService;

    @GetMapping(path = "/countries")
    public ResponseEntity<List<CountryDto>> getCountries() {
        return new ResponseEntity<>(countryService.getCountries(), HttpStatus.OK);
    }


    @GetMapping(path = "/country/{id}")
    public ResponseEntity<CountryDto> getCountry(@PathVariable(value = "id") String countryID) {
        return new ResponseEntity<>(countryService.getCountryByCountryId(countryID), HttpStatus.OK);
    }

    @PostMapping("/countries")
    public ResponseEntity<CountryDto> createCountry(@RequestBody CountryDto countryDto) {
        return new ResponseEntity<>(countryService.createCountry(countryDto), HttpStatus.CREATED);
    }

    @DeleteMapping(path = "/country/{id}")
    public ResponseEntity<String> deleteCountry(@PathVariable(value = "id") String countryID) {
        countryService.deleteCountry(countryID);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
