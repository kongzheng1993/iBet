package com.evil.ibet.mapper;

import com.evil.ibet.entity.BetSite;
import com.evil.ibet.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    void insertUser(@Param("user") User user);

    User selectUserByWxOpenId(String wxOpenId);

    User selectUserById(String id);

    int updateUserById(User user);

    List<BetSite> selectUserBetSitesByUserId(String userId);

    int updateUserBalanceByUserIdBetSiteId(Map map);

}
