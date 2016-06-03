package com.hydro.user;

import com.hydro.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by User on 3/6/2559.
 */
@Repository
public class UserDaoImpl implements UserDao{
    @Autowired
    private UserRepository userRepository;
}
