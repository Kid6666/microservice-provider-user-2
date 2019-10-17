package com.lejx.microserviceprovideruser.user.mapper;

import com.lejx.microserviceprovideruser.user.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
@Mapper
@Repository
public interface UserMapper {

    User findOne(long id);
}
