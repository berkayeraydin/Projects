package com.berkay.fullStackProjeBackend.jpaRepository;

import com.berkay.fullStackProjeBackend.entities.SupplierEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepository extends JpaRepository<SupplierEntity,Integer> {
}
