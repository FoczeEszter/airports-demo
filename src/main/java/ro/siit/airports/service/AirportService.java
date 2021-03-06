package ro.siit.airports.service;

import org.springframework.data.domain.Page;
import ro.siit.airports.domain.Airport;
import ro.siit.airports.model.Search;

import java.util.List;

public interface AirportService {

    List<Airport> findFilteredAirports(Search search);


}
