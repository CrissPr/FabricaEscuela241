package co.edu.udea.sitas.persistence;

import co.edu.udea.sitas.domain.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightDAO extends JpaRepository<Flight, Integer> {
}