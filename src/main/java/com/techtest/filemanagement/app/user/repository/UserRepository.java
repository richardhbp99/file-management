package com.techtest.filemanagement.app.user.repository;

import java.util.Optional;
import com.techtest.filemanagement.app.user.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}