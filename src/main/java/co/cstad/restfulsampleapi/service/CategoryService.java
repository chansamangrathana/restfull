package co.cstad.restfulsampleapi.service;

import co.cstad.restfulsampleapi.dto.CategoryRequest;
import co.cstad.restfulsampleapi.dto.CategoryResponse;

import java.util.List;

public interface CategoryService {
    public List<CategoryResponse> getAllCategory(String categoryName);
    public CategoryResponse createCategory(CategoryRequest categoryRequest);
    public void deleteProductById(int id);
    public CategoryResponse updateCategory(int id, CategoryRequest categoryRequest);
    public CategoryResponse findCategoryById(int id);
}
