package com.hydro.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by User on 3/6/2559.
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;
}
