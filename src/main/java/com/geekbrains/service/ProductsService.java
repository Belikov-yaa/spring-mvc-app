package com.geekbrains.service;

import com.geekbrains.entites.Product;
import com.geekbrains.repositaries.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductsService {
    private ProductsRepository productsRepository;

    @Autowired
    public void setProductsRepository(ProductsRepository productsRepository) {
        this.productsRepository = productsRepository;
    }

    public ProductsService() {
    }

    public Product getProductById(int id) {
        return productsRepository.getProductByID(id);
    }
}
