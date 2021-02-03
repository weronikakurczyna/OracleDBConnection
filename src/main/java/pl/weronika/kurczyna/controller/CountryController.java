package pl.weronika.kurczyna.controller;

import pl.weronika.kurczyna.model.dto.CountryDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.weronika.kurczyna.service.CountryServiceInterface;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class CountryController {
    @Autowired
    private CountryServiceInterface countryService;

    @GetMapping(path = "/countries", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<CountryDto>> getCountries() {
        return new ResponseEntity<>(countryService.getCountries(), HttpStatus.OK);
    }

    @GetMapping(path = "/country/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CountryDto> getCountry(@PathVariable(value = "id") Integer countryID) {
        return new ResponseEntity<>(countryService.getCountryID(countryID), HttpStatus.OK);
    }
}
