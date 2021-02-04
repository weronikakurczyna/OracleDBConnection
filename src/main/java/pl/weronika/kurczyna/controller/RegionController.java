package pl.weronika.kurczyna.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.weronika.kurczyna.model.dto.RegionDto;
import pl.weronika.kurczyna.service.RegionService;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class RegionController {
    @Autowired
    private RegionService regionService;

    @GetMapping(path = "/regions")
    public ResponseEntity<List<RegionDto>> getRegions() {
        return new ResponseEntity<>(regionService.getRegions(), HttpStatus.OK);
    }

    @GetMapping(path = "/region/{id}")
    public ResponseEntity<RegionDto> getRegion(@PathVariable(value = "id") String regionID) {
        return new ResponseEntity<>(regionService.getRegionID(regionID), HttpStatus.OK);
    }
}
