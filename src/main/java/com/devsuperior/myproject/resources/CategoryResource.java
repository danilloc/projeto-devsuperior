package com.devsuperior.myproject.resources;

import com.devsuperior.myproject.entities.Category;
import com.devsuperior.myproject.repository.ICategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {
    @Autowired
    private ICategoryRepository iCategoryRepository;

    @GetMapping
    public ResponseEntity<List<Category>> findAll() {
        List<Category> list = iCategoryRepository.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Optional<Category>> findId(@PathVariable Long id) {
        Optional<Category> cat = iCategoryRepository.findById(id);
        return ResponseEntity.ok().body(cat);
    }



}
