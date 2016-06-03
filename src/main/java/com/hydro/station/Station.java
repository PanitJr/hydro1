package com.hydro.station;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by User on 1/6/2559.
 */
@Document
public class Station {
    @Id
    private String id;
    private String name;
    private String address;
    private String status;
}
