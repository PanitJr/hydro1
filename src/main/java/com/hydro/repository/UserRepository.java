package com.hydro.repository;

import com.hydro.user.User;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by User on 1/6/2559.
 */
public interface UserRepository extends MongoRepository<User, String> {
}
