package com.hydro.user;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by User on 1/6/2559.
 */
@Document
public class User {
    @Id
    private String id;
}
