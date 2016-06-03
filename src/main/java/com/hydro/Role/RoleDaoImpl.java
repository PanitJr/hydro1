package com.hydro.Role;

import com.hydro.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by User on 3/6/2559.
 */
@Repository
public class RoleDaoImpl implements RoleDao {
    @Autowired
    private RoleRepository roleRepository;
}
