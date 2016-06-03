package com.hydro.station;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by User on 3/6/2559.
 */
@CrossOrigin
@RestController
public class StationController {
    @Autowired
    private StationService stationService;
}
