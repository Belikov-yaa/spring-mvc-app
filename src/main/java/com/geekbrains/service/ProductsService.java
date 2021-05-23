package com.geekbrains.service;

import com.geekbrains.entites.Product;
import com.geekbrains.repositaries.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public List<Product> getProductsList() {
        return productsRepository.getProducts();
    }

    public void addProductToRepository(Product product) {
        productsRepository.addProductToList(product);
    }
}
