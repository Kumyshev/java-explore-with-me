package ru.practicum.controller;

import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import ru.practicum.EndpointHitDto;
import ru.practicum.properties.StatSvcProperties;
import ru.practicum.service.HttpClientService;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequiredArgsConstructor
public class HttpClientController {
    private final HttpClientService service;

    @PostMapping(StatSvcProperties.API_PREFIX_HIT)
    public ResponseEntity<Object> postHit(@RequestBody EndpointHitDto dto) {
        return service.postHit(dto);
    }

    @GetMapping(StatSvcProperties.API_PREFIX_STATS)
    public ResponseEntity<Object> getStats(
            @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") LocalDateTime start,
            @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") LocalDateTime end,
            @RequestParam(required = false) List<String> uris,
            @RequestParam(required = false, defaultValue = "false") Boolean unique) {
        if (start.isAfter(end)) {
            throw new IllegalArgumentException("Неверно указана дата!!!");
        }
        return service.getStats(start, end, uris, unique);
    }

}
