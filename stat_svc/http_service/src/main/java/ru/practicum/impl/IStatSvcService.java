package ru.practicum.impl;

import java.time.LocalDateTime;
import java.util.List;

import ru.practicum.model.EndpointHit;
import ru.practicum.model.ViewStats;

public interface IStatSvcService {

    EndpointHit addEndpointHit(EndpointHit endpointHit);

    List<ViewStats> allViewStats(LocalDateTime start, LocalDateTime end, List<String> uris, Boolean unique);
}
