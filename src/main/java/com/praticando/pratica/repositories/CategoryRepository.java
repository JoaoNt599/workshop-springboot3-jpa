package com.praticando.pratica.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.praticando.pratica.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
