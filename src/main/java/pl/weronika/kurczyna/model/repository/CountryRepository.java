package pl.weronika.kurczyna.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.weronika.kurczyna.model.entity.Country;

public interface CountryRepository extends JpaRepository<Country, String> {


}

