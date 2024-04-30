package org.buildproduct.build_api.services;

import org.buildproduct.build_api.exceptions.CategoryNotFoundException;
import org.buildproduct.build_api.exceptions.ProductNotFoundException;
import org.buildproduct.build_api.models.Category;
import org.buildproduct.build_api.models.Product;
import org.buildproduct.build_api.repository.CategoryRepository;
import org.buildproduct.build_api.repository.ProductRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Primary
public class SelfProductService implements ProductServices{
    ProductRepository productRepository ;
    CategoryRepository categoryRepository;
    SelfProductService(ProductRepository productRepository, CategoryRepository categoryRepository){
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;

    }
    @Override
    public Product getSingleProduct(Long id) {
        Optional<Product> optionalProduct =  productRepository.findById(id);
        if(optionalProduct.isEmpty()){
            throw  new ProductNotFoundException(id, "Product Not Found :( ");

        }

        return optionalProduct.get();
    }

    @Override
    public List<Product> getAllProducts() {
        return null;
    }

    @Override
    public Product updateProduct(Product product) {
        return null;
    }

    @Override
    public Product createProduct(Product product) {

        Category category = product.getCategory();
        if(category.getId() ==  null){
            //save the category
            product.setCategory(categoryRepository.save(category));


        }

        Product product1 = productRepository.save(product);
        Optional<Category> optionalCategory = categoryRepository.findById(category.getId());

        if(optionalCategory.isEmpty()){
            throw new CategoryNotFoundException("Category Not Found", category.getId());
        }

        product1.setCategory(optionalCategory.get());

        return productRepository.save(product);
    }

    @Override
    public Product deleteProduct(Long id) {
        return null;
    }
}

