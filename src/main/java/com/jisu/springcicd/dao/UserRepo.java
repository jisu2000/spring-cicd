package com.jisu.springcicd.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.jisu.springcicd.model.User;
import java.util.List;

@RepositoryRestResource(collectionResourceRel = "user", path = "users")
public interface UserRepo extends JpaRepository<User, Integer> {

    List<User> findByEmail(String email);
}
