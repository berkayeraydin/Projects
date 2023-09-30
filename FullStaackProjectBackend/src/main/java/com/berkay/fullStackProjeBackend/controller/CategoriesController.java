package com.berkay.fullStackProjeBackend.controller;

import com.berkay.fullStackProjeBackend.entities.CategoryEntity;
import com.berkay.fullStackProjeBackend.jpaRepository.CategoryRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("categories")
@CrossOrigin
public class CategoriesController {
    private CategoryRepository categoryRepository;

    public CategoriesController(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @GetMapping()
    public List<CategoryEntity> getAll() throws InterruptedException{
        return categoryRepository.findAll();
    }
}
