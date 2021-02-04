package pl.weronika.kurczyna.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.weronika.kurczyna.model.dto.RegionDto;
import pl.weronika.kurczyna.model.entity.Region;
import pl.weronika.kurczyna.model.repository.RegionRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RegionService {
    @Autowired
    private RegionRepository regionRepository;
    @Autowired
    private ModelMapper modelMapper;

    public List<RegionDto> getRegions() {
        List<Region> regions = regionRepository.findAll();
        return regions.stream()
                .map(region -> convertToDto(region))
                .collect(Collectors.toList());
    }

    public RegionDto getRegionID(String regionID) {
        return convertToDto(regionRepository.findById(regionID).get());
    }

    private RegionDto convertToDto(Region region) {
        return modelMapper.map(region, RegionDto.class);
    }

}
