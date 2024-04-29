package com.sherlock.productscategories.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sherlock.productscategories.models.Category;
import com.sherlock.productscategories.models.Product;
import com.sherlock.productscategories.repositories.CategoryRepostiory;
import com.sherlock.productscategories.repositories.ProductRepository;

@Service
public class AppService {
    private final CategoryRepostiory categoryRepostiory;
    private final ProductRepository productRepository;

    public AppService(CategoryRepostiory categoryRepostiory, ProductRepository productRepository) {
        this.categoryRepostiory = categoryRepostiory;
        this.productRepository = productRepository;
    }

    //Categories
    public Category createCategory(Category category) {
        return categoryRepostiory.save(category);
    }

    public Category saveCategory(Category category) {
        return categoryRepostiory.save(category);
    }

    public Category getCategory(Long id) {
        return categoryRepostiory.findById(id).orElse(null);
    }

    public List<Category> getCategoriesNotInProduct(Product product) {
        return categoryRepostiory.findByProductsNotContains(product);
    }

    public List<Category> getAllCategories() {
        return (List<Category>)categoryRepostiory.findAll();
    }

    //Products
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    public Product getProduct(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    public List<Product> getProductsNotInCategory(Category category) {
        return productRepository.findByCategoriesNotContains(category);
    }

    public List<Product> getAllProducts() {
        return (List<Product>)productRepository.findAll();
    }


}
