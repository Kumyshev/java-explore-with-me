package ru.practicum.controller.open;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import ru.practicum.dto.CategoryDto;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping(value = "/categories")
@RequiredArgsConstructor
public class CategoryPublicController {

    @GetMapping
    public List<CategoryDto> findCategories(
            @RequestParam(name = "from") Integer from,
            @RequestParam(name = "size") Integer size) {
        return null;
    }

    @GetMapping("/{catId}")
    public CategoryDto findCategory(@PathVariable Long catId) {
        return null;
    }

}
