package com.api.lecturerscheduling.mapper;

import com.api.lecturerscheduling.dto.UserLoginDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    /**
     * Select user information
     * @param user_id
     * @param password
     * @return UserLoginDTO
     */
    @Select("SELECT " +
            "   user_id AS username, " +
            "   password, " +
            "   role_id AS roleId, " +
            "   status_id AS statusId, " +
            "   full_name AS fullName " +
            "FROM " +
            "   public.user " +
            "WHERE " +
            "   user_id = #{user_id} and password = #{password} and status_id = '1'")
    UserLoginDTO loginUser(@Param("user_id") String user_id,
                           @Param("password") String password);
}
