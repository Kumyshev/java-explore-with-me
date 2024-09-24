package ru.practicum.impl;

import java.util.List;

import ru.practicum.dto.CompilationDto;

public interface ICompilationService {

    List<CompilationDto> findCompilations(Boolean pinned, Integer from, Integer size);
}
