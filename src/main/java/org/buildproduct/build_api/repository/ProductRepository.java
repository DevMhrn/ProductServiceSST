package org.buildproduct.build_api.repository;

import io.micrometer.common.lang.NonNullApi;
import org.buildproduct.build_api.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@NonNullApi
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {


    @Override
    Optional<Product> findById(Long id);
    Product save(Product product);



}
