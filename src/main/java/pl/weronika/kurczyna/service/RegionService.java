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

    public RegionDto createRegion(RegionDto regionDto) {
        Region newRegion = new Region();
        newRegion.setRegionID(regionDto.getRegionID());
        newRegion.setRegionName(regionDto.getRegionName());
        Region savedRegion = regionRepository.save(newRegion);

        return convertToDto(savedRegion);
    }

    public void deleteRegion(String regionID) {
        regionRepository.deleteById(regionID);
    }

    private RegionDto convertToDto(Region region) {
        return modelMapper.map(region, RegionDto.class);
    }

}
