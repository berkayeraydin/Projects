package com.berkay.fullStackProjeBackend.jpaRepository;

import com.berkay.fullStackProjeBackend.entities.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductEntity,Integer> {
}
