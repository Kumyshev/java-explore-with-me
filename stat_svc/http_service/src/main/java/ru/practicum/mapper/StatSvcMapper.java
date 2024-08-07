package ru.practicum.mapper;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

import ru.practicum.model.EndpointHit;
import ru.practicum.model.Stats;
import ru.practicum.properties.StatSvcProperties;

@Component
public class StatSvcMapper {

    public Stats toStats(EndpointHit endpointHit) {
        return Stats.builder()
                .app(endpointHit.getApp())
                .uri(endpointHit.getUri())
                .ip(endpointHit.getIp())
                .timestamp(LocalDateTime.parse(endpointHit.getTimestamp(), StatSvcProperties.DATE_TIME_FORMATTER))
                .build();
    }
}
