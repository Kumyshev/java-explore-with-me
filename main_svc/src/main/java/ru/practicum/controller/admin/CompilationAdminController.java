package ru.practicum.controller.admin;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import ru.practicum.dto.CompilationDto;
import ru.practicum.dto.NewCompilationDto;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping(value = "/admin/compilations")
@RequiredArgsConstructor
public class CompilationAdminController {

    @PostMapping
    public CompilationDto saveCompilation(
            @Valid @RequestBody NewCompilationDto newCompilationDto) {
        return null;
    }

    @DeleteMapping("/{compId}")
    public void deleteCompilation(@PathVariable Long compId) {

    }

    @PatchMapping("/{compId}")
    public CompilationDto updateCompilation(
            @PathVariable Long compId,
            @Valid @RequestBody NewCompilationDto newCompilationDto) {
        return null;
    }
}
