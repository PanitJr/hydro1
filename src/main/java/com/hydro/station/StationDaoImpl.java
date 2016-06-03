package com.hydro.station;

import com.hydro.repository.StationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by User on 3/6/2559.
 */
@Repository
public class StationDaoImpl implements StationDao{
    @Autowired
    private StationRepository stationRepository;
}
