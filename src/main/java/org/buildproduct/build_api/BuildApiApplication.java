package org.buildproduct.build_api;

import org.buildproduct.build_api.models.Category;
import org.buildproduct.build_api.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Optional;

@SpringBootApplication
public class BuildApiApplication {

//	@Autowired
//	private static CategoryRepository categoryRepository;

	public static void main(String[] args) {
		SpringApplication.run(BuildApiApplication.class, args);

//		Optional<Category> categoryOptional = categoryRepository.findById(1L);
		


	}

}
