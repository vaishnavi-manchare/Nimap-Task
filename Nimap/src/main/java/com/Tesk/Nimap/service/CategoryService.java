package com.Tesk.Nimap.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Tesk.Nimap.model.Category;
import com.Tesk.Nimap.repository.CategoryRepository;

@Service
public class CategoryService {
	 @Autowired
	    private CategoryRepository categoryRepository;

	    public List<Category> getAllCategories(int page) {
	        // Implement pagination here
	        return categoryRepository.findAll();
	    }

	    public Optional<Category> getCategoryById(Long id) {
	        return categoryRepository.findById(id);
	    }

	    public Category createCategory(Category category) {
	        return categoryRepository.save(category);
	    }

	    public Category updateCategory(Long id, Category updatedCategory) {
	        return categoryRepository.save(updatedCategory);
	    }

	    public void deleteCategory(Long id) {
	        categoryRepository.deleteById(id);
	    }
}
