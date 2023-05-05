package com.codewitheshan.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codewitheshan.blog.entities.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer>{

}
