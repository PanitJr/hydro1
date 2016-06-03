package com.hydro.repository;

import com.hydro.Role.Role;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by User on 1/6/2559.
 */
public interface RoleRepository extends MongoRepository<Role, String> {
}
