package ru.practicum.impl;

import java.util.List;

import ru.practicum.dto.CategoryDto;
import ru.practicum.dto.NewCategoryDto;

public interface ICategoryService {

    public CategoryDto saveCategory(NewCategoryDto newCategoryDto);

    public void deleteCategory(Long catId);

    public CategoryDto updateCategory(Long catId, NewCategoryDto newCategoryDto);

    public List<CategoryDto> findCategories(Integer from, Integer size);

    public CategoryDto findCategory(Long catId);
}
