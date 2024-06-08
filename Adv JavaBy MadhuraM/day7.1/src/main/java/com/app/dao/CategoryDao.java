package com.app.dao;

import com.app.dao.*; 
import java.util.List;
import com.app.entities.Category;

public interface CategoryDao {
	String createcategory(Category category);
	List<Category> getAllcategories();
	Category getCategoryByName(String name);
}
