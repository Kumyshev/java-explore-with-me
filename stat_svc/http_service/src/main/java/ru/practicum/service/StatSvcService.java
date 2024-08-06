package ru.practicum.service;

import java.security.InvalidParameterException;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import ru.practicum.impl.IStatSvcService;
import ru.practicum.mapper.StatSvcMapper;
import ru.practicum.model.EndpointHit;
import ru.practicum.model.Stats;
import ru.practicum.model.ViewStats;
import ru.practicum.repository.StatSvcRepository;

@Service
@RequiredArgsConstructor
public class StatSvcService implements IStatSvcService {
    private final StatSvcRepository statSvcRepository;
    private final StatSvcMapper statSvcMapper;

    @Override
    public EndpointHit addEndpointHit(EndpointHit endpointHit) {
        Stats stats = statSvcMapper.toStats(endpointHit);
        statSvcRepository.save(stats);
        return endpointHit;
    }

    @Override
    public List<ViewStats> allViewStats(LocalDateTime start, LocalDateTime end, List<String> uris, Boolean unique) {
        if (end.isBefore(start)) {
            throw new InvalidParameterException("Неверно установлена дата!");
        }

        if (uris == null) {
            if (unique) {
                return statSvcRepository.getUniqueStats(start, end);
            } else {
                return statSvcRepository.getAllStats(start, end);
            }
        } else {
            if (unique) {
                return statSvcRepository.getUniqueStatsByUris(start, end, uris);
            } else {
                return statSvcRepository.getAllStatsByUris(start, end, uris);
            }
        }
    }
}
