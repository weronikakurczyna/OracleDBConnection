package pl.weronika.kurczyna.model.repository;

import pl.weronika.kurczyna.model.entity.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location, String> {}

