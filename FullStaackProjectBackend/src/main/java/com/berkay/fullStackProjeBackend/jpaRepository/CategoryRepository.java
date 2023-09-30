package com.berkay.fullStackProjeBackend.jpaRepository;

import com.berkay.fullStackProjeBackend.entities.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<CategoryEntity,Integer> {
}
