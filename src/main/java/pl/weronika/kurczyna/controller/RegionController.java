package pl.weronika.kurczyna.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.weronika.kurczyna.model.dto.RegionDto;
import pl.weronika.kurczyna.service.RegionServiceInterface;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class RegionController {
    @Autowired
    private RegionServiceInterface regionService;

    @GetMapping(path = "/regions", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<RegionDto>> getRegions() {
        return new ResponseEntity<>(regionService.getRegions(), HttpStatus.OK);
    }

    @GetMapping(path = "/region/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<RegionDto> getRegion(@PathVariable(value = "id") Integer regionID) {
        return new ResponseEntity<>(regionService.getRegionID(regionID), HttpStatus.OK);
    }
}
