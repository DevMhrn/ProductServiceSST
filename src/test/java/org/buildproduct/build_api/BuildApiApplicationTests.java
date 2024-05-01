package org.buildproduct.build_api;

import org.buildproduct.build_api.models.Category;
import org.buildproduct.build_api.models.Product;
import org.buildproduct.build_api.repository.CategoryRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

@SpringBootTest
class BuildApiApplicationTests {
	@Autowired
	private CategoryRepository categoryRepository;

	@Test
	void contextLoads() {
	}
	@Test
	void testEagerVSLazyLoading() {
		Optional<Category> optionalCategory = categoryRepository.findById(1L);

		Category category = optionalCategory.get();
		System.out.println("Fetching List of All products for the above of category");
		List<Product> productList = category.getProducts();



		System.out.println("DeBugging");


	}


}
