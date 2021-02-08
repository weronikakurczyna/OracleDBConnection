package pl.weronika.kurczyna.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.weronika.kurczyna.model.dto.LocationDto;
import pl.weronika.kurczyna.service.LocationService;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class LocationController {
    @Autowired
    private LocationService locationService;

    @GetMapping(path = "/locations")
    public ResponseEntity<List<LocationDto>> getLocations() {
        return new ResponseEntity<>(locationService.getLocations(), HttpStatus.OK);
    }

    @GetMapping(path = "/location/{id}")
    public ResponseEntity<LocationDto> getLocation(@PathVariable(value = "id") String locationID) {
        return new ResponseEntity<>(locationService.getLocationByLocationId(locationID), HttpStatus.OK);

    }

    @PostMapping("/locations")
    public ResponseEntity<LocationDto> createLocation(@RequestBody LocationDto locationDto) {
        return new ResponseEntity<>(locationService.createLocation(locationDto), HttpStatus.CREATED);
    }

    @DeleteMapping(path = "/location/{id}")
    public ResponseEntity<String> deleteLocation(@PathVariable(value = "id") String locationID) {
        locationService.deleteLocation(locationID);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
