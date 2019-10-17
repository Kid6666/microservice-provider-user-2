package com.lejx.microserviceprovideruser.user;

import com.lejx.microserviceprovideruser.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {
    @Autowired
    private UserMapper userMapper;

    public User findOne(long id){
        return userMapper.findOne(id);
    }
}
