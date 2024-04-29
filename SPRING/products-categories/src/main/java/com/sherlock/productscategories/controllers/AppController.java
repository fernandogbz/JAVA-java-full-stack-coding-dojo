package com.sherlock.productscategories.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sherlock.productscategories.models.Category;
import com.sherlock.productscategories.models.Product;
import com.sherlock.productscategories.services.AppService;

import jakarta.validation.Valid;

@Controller
public class AppController {
    private final AppService appService;

    public AppController(AppService appService) {
        this.appService = appService;
    }

    //index
    @GetMapping("/")
    public String index() {
        return "index.jsp";
    }

    //products
    //Create
    @GetMapping("/products/new")
    public String newProduct(@ModelAttribute ("product") Product product){
        return "newProduct.jsp";
    }

    @PostMapping("/products/new")
    public String createProduct(@Valid @ModelAttribute ("product") Product product, BindingResult result){
        if(result.hasErrors()){
            return "newProduct.jsp";
        } else {
            appService.createProduct(product);
            return "redirect:/products/" + product.getId();
        }
    }

    //Show
    @GetMapping("/products/{id}")
    public String showProduct(@PathVariable("id") Long id, Model model){
        model.addAttribute("product", appService.getProduct(id));
        model.addAttribute("categories", appService.getCategoriesNotInProduct(appService.getProduct(id)));
        for (Category category : appService.getCategoriesNotInProduct(appService.getProduct(id))) {
            System.out.println(category.getName());            
        }
        return "showProduct.jsp";
    }

    @PostMapping("/products/{id}")
    public String addCategoryToProduct(@PathVariable("id") Long id, @RequestParam("cat_id") Long categoryId){
        Product product = appService.getProduct(id);
        product.getCategories().add(appService.getCategory(categoryId));
        appService.saveProduct(product);
        return "redirect:/products/" + id;
    }


    //Categories
    //Create
    @GetMapping("/categories/new")
    public String newCategory(@ModelAttribute ("category") Category category){
        return "newCategory.jsp";
    }

    @PostMapping("/categories/new")
    public String createCategory(@Valid @ModelAttribute ("category") Category category, BindingResult result){
        if(result.hasErrors()){
            return "newCategory.jsp";
        } else {
            appService.createCategory(category);
            return "redirect:/categories/" + category.getId();
        }
    }
    
    //Show
    @GetMapping("/categories/{id}")
    public String showCategory(@PathVariable("id") Long id, Model model){
        model.addAttribute("category", appService.getCategory(id));
        model.addAttribute("products", appService.getProductsNotInCategory(appService.getCategory(id)));
        return "showCategory.jsp";
    }

    @PostMapping("/categories/{id}")
    public String addProductToCategory(@PathVariable("id") Long id, @RequestParam("prod_id") Long productId){
        Category category = appService.getCategory(id);
        category.getProducts().add(appService.getProduct(productId));
        appService.saveCategory(category);
        return "redirect:/categories/" + id;
    }

}
