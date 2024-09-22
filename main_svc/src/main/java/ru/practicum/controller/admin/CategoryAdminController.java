package ru.practicum.controller.admin;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import ru.practicum.dto.CategoryDto;
import ru.practicum.dto.NewCategoryDto;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping(value = "/admin/categories")
@RequiredArgsConstructor
public class CategoryAdminController {

    @PostMapping
    public CategoryDto saveCategory(@Valid @RequestBody NewCategoryDto newCategoryDto) {
        return null;
    }

    @DeleteMapping("/{catId}")
    public void deleteCategory(
            @PathVariable Long catId) {

    }

    @PatchMapping("/{catId}")
    public CategoryDto updateCategory(
            @PathVariable Long catId,
            @Valid @RequestBody NewCategoryDto newCategoryDto) {
        return null;
    }
}
