package com.techtest.filemanagement.app.user.model.entity;
import org.springframework.security.core.GrantedAuthority;

import com.techtest.filemanagement.app.common.model.EntityBase;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "role")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Role  extends EntityBase implements GrantedAuthority {


    @Column(name = "name", nullable = false, unique = true)
    private String name;

    @Column(name = "description")
    private String description;

    @Override
    public String getAuthority() {
    
        return name;
    }
}