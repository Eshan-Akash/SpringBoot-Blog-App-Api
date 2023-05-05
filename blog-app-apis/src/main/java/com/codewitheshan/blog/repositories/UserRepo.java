package com.codewitheshan.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codewitheshan.blog.entities.User;

public interface UserRepo extends JpaRepository<User, Integer>{

}
