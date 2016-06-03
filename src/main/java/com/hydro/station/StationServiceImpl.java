package com.hydro.station;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by User on 3/6/2559.
 */
@Service
public class StationServiceImpl implements StationService{
    @Autowired
    private StationDao stationDao;

}
