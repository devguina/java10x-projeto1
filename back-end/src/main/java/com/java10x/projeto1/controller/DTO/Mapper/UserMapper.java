package com.java10x.projeto1.controller.DTO.Mapper;

import com.java10x.projeto1.controller.DTO.request.UserRequest;
import com.java10x.projeto1.controller.DTO.response.UserResponse;
import com.java10x.projeto1.entity.User;
import lombok.experimental.UtilityClass;

@UtilityClass
public class UserMapper {

    public static User toUser(UserRequest request){
        return User
                .builder()
                .username(request.username())
                .password(request.password())
                .email(request.email())
                .build();
    }

    public static UserResponse toUserResponse(User user){
        return UserResponse
                .builder()
                .id(user.getId())
                .username(user.getUsername())
                .email(user.getEmail())
                .build();
    }
}
