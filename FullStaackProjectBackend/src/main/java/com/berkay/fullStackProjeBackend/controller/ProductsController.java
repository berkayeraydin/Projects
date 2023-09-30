package com.berkay.fullStackProjeBackend.controller;

import com.berkay.fullStackProjeBackend.entities.CategoryEntity;
import com.berkay.fullStackProjeBackend.dto.requestDto.AddProductRequest;
import com.berkay.fullStackProjeBackend.dto.requestDto.UpdateProductRequest;
import com.berkay.fullStackProjeBackend.entities.ProductEntity;
import com.berkay.fullStackProjeBackend.jpaRepository.ProductRepository;
import com.berkay.fullStackProjeBackend.entities.SupplierEntity;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("products")
@CrossOrigin
public class ProductsController {

    private ProductRepository productRepository;

    @Autowired
    public ProductsController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping()
    public List<ProductEntity> getAll(){
        return productRepository.findAll();
    }

    @GetMapping("getById")
    public ProductEntity getById(@RequestParam int id){
        return productRepository.findById(id).orElseThrow();
    }

    @PostMapping()
    public void add(@Valid @RequestBody AddProductRequest request) {

        // eğer aynı isimde ürün varsa BusinessException fırlat..
        // throw new BusinessException("Aynı isimde bir ürün zaten mevcut");
        
        ProductEntity productEntity = new ProductEntity();
        productEntity.setName(request.getProductName());
        productEntity.setSupplierEntity(SupplierEntity.builder().supplierId(request.getSupplierId()).build());
        productEntity.setCategoryEntity(CategoryEntity.builder().categoryId(request.getCategoryId()).build());
        productEntity.setDiscontinued(0);
        productEntity.setUnitPrice(request.getUnitPrice());
        productEntity.setUnitsInStock(request.getUnitsInStock());
        productRepository.save(productEntity);

    }

    @PutMapping()
    public void update(@RequestBody UpdateProductRequest request){
        ProductEntity productEntityToUpdate = productRepository.findById(request.getId()).orElseThrow();

        productEntityToUpdate.setName(request.getProductName());
        productEntityToUpdate.setSupplierEntity(SupplierEntity.builder().supplierId(request.getSupplierId()).build());
        productEntityToUpdate.setCategoryEntity(CategoryEntity.builder().categoryId(request.getCategoryId()).build());

        productRepository.save(productEntityToUpdate);
    }

    @DeleteMapping()
    public void delete(@RequestParam int id){
        ProductEntity productEntityToDelete = productRepository.findById(id).orElseThrow();
        productRepository.delete(productEntityToDelete);
    }

}
