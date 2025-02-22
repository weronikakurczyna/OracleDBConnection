package pl.weronika.kurczyna.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.weronika.kurczyna.model.dto.LocationDto;
import pl.weronika.kurczyna.model.entity.Location;
import pl.weronika.kurczyna.model.repository.LocationRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LocationService {
    @Autowired
    private LocationRepository locationRepository;
    @Autowired
    private ModelMapper modelMapper;

    public List<LocationDto> getLocations() {
        List<Location> locations = locationRepository.findAll();
        return locations
                .stream()
                .map(location -> convertToDto(location))
                .collect(Collectors.toList());
    }

    public LocationDto getLocationByLocationId(String locationID) {
        return convertToDto(locationRepository.findById(locationID).get());
    }


    public LocationDto createLocation(LocationDto locationDto) {
        Location newLocation = new Location();
        newLocation.setLocationID(locationDto.getLocationID());
        newLocation.setStreetAddress(locationDto.getStreetAddress());
        newLocation.setPostalCode(locationDto.getPostalCode());
        newLocation.setCity(locationDto.getCity());
        newLocation.setStateProvince(locationDto.getStateProvince());
        newLocation.setCountryID(null);
        Location savedLocation = locationRepository.save(newLocation);

        return convertToDto(savedLocation);
    }

    public void deleteLocation(String locationID) {
        locationRepository.deleteById(locationID);
    }

    private LocationDto convertToDto(Location location) {
        return modelMapper.map(location, LocationDto.class);
    }

}
