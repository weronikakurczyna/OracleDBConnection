package pl.weronika.kurczyna.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.weronika.kurczyna.model.entity.Region;

public interface RegionRepository extends JpaRepository<Region, String> {
}


