package com.berkay.fullStackProjeBackend.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="products")
@NoArgsConstructor
@AllArgsConstructor
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="product_id")
    private int id;


    @Column(name="product_name")
    private String name;

    @Column(name="unit_price")
    private double unitPrice;

    @Column(name="units_in_stock")
    private int unitsInStock;

    @Column(name="discontinued")
    private int discontinued;

    @ManyToOne()
    @JoinColumn(name="category_id")
    private CategoryEntity categoryEntity;

    @ManyToOne()
    @JoinColumn(name="supplier_id")
    private SupplierEntity supplierEntity;
}
