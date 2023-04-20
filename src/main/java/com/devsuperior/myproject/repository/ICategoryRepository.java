package com.devsuperior.myproject.repository;

import com.devsuperior.myproject.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface ICategoryRepository extends JpaRepository <Category, Long> {
}
