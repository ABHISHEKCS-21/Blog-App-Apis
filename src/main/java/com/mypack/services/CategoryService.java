package com.mypack.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mypack.payloads.CategoryDto;

public interface CategoryService {

	public CategoryDto createCategory(CategoryDto categoryDto);
	
	public List<CategoryDto> getAllcategory();
	
	public CategoryDto getById(Integer categoryId);
	
	public CategoryDto updateCategory(CategoryDto categoryDto,Integer categoryId);
	
	public void deleteCategory(Integer categoryId);
	
}
