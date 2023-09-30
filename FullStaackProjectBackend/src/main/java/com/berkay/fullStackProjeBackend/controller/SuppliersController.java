package com.berkay.fullStackProjeBackend.controller;

import com.berkay.fullStackProjeBackend.entities.SupplierEntity;
import com.berkay.fullStackProjeBackend.jpaRepository.SupplierRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("suppliers")
@CrossOrigin
public class SuppliersController {
    private final SupplierRepository supplierRepository;

    public SuppliersController(SupplierRepository supplierRepository) {
        this.supplierRepository = supplierRepository;
    }

    @GetMapping()
    public List<SupplierEntity> getAll(){
        return this.supplierRepository.findAll();
    }
}
