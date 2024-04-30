package org.buildproduct.build_api.repository;

import org.buildproduct.build_api.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
     Category save(Category category);
}
