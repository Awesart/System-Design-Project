package com.example.systemdesignproject.repository;

import com.example.systemdesignproject.model.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
    Boolean existsByName(String name);
    UserEntity findByName(String name);
}
