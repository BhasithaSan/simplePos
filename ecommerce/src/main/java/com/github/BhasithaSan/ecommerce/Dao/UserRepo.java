package com.github.BhasithaSan.ecommerce.Dao;

import com.github.BhasithaSan.ecommerce.Model.User.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<Users, String> {

    Users findByUsername(String username);
}