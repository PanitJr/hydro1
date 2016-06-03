package com.hydro.report;

import com.hydro.image.Image;
import com.hydro.station.Station;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by User on 1/6/2559.
 */
@Document
public class Report {
    @Id
    private String id;
    @DBRef
    private Station station;
    @CreatedDate
    private Date date;
    private String description;
    @DBRef
    private Set<Image> imageSet = new HashSet<>();
}
