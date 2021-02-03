package pl.weronika.kurczyna.service;

import pl.weronika.kurczyna.model.dto.RegionDto;

import java.util.List;

public interface RegionServiceInterface {
    List<RegionDto> getRegions();

    RegionDto getRegionID(Integer regionID);
}
