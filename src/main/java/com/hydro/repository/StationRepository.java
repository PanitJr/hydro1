package com.hydro.repository;

import com.hydro.station.Station;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by User on 1/6/2559.
 */
public interface StationRepository extends MongoRepository<Station, String> {
}
