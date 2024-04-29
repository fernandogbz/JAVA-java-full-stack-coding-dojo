package com.sherlock.productscategories.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sherlock.productscategories.models.Category;
import com.sherlock.productscategories.models.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long>{

    List<Product> findByCategoriesNotContains(Category category);
    
}
