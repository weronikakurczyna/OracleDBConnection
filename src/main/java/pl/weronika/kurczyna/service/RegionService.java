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
public class RegionService implements RegionServiceInterface {
    @Autowired
    private RegionRepository regionRepository;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<RegionDto> getRegions() {
        List<Region> regions = regionRepository.findAll();
        return regions.stream()
                .map(region -> convertToDto(region))
                .collect(Collectors.toList());
    }

    @Override
    public RegionDto getRegionID(Integer regionID) {
        return convertToDto(regionRepository.findById(regionID).get());
    }

    private RegionDto convertToDto(Region region) {
        return modelMapper.map(region, RegionDto.class);
    }

}
