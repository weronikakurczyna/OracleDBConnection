package pl.weronika.kurczyna.model.repository;

import pl.weronika.kurczyna.model.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, String> {
}

