package com.hydro.Role;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by User on 3/6/2559.
 */
@RestController
@CrossOrigin
public class RoleController {
    @Autowired
    private RoleService roleService;

}
