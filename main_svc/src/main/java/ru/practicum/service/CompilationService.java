package ru.practicum.service;

import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import ru.practicum.dto.CompilationDto;
import ru.practicum.impl.ICompilationService;
import ru.practicum.mapper.CompilationMapper;
import ru.practicum.model.Compilation;
import ru.practicum.repository.CompilationRepository;

@Service
@RequiredArgsConstructor
public class CompilationService implements ICompilationService {

    private final CompilationRepository compilationRepository;
    private final CompilationMapper compilationMapper;

    @Override
    public List<CompilationDto> findCompilations(Boolean pinned, Integer from, Integer size) {

        List<Compilation> compilations = compilationRepository.findByPinned(pinned, PageRequest.of(from, size));
        List<CompilationDto> compilationDtos = compilations.stream().map(compilationMapper::toCompilationDto).toList();
        return compilationDtos;
    }

}
