package com.devsuperior.myproject;

import com.devsuperior.myproject.entities.Category;
import com.devsuperior.myproject.repository.ICategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyprojectApplication implements CommandLineRunner {
    @Autowired
    private ICategoryRepository iCategoryRepository;

    public static void main(String[] args) {
        SpringApplication.run(MyprojectApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Category cat1 = new Category(1L, "Eletronics");
        Category cat2 = new Category(2L, "Boocks");
        iCategoryRepository.save(cat1);
        iCategoryRepository.save(cat2);
    }
}
