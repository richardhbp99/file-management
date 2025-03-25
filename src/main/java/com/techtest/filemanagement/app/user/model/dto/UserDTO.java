package com.techtest.filemanagement.app.user.model.dto;


import com.fasterxml.jackson.annotation.JsonProperty;

// import com.techtest.filemanagement.app.user.model.entity.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class UserDTO {

    private Long id;
    private String username;
    private String email;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY) 
    private String passwordHash;

}
