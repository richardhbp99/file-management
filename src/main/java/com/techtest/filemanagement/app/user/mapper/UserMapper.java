package com.techtest.filemanagement.app.user.mapper;

import com.techtest.filemanagement.app.user.model.dto.UserDTO;
import com.techtest.filemanagement.app.user.model.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserDTO toDTO(User user);
    User toEntity(UserDTO userDTO);
}