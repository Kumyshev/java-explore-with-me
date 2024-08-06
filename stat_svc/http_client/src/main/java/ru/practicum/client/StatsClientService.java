package ru.practicum.client;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.util.DefaultUriBuilderFactory;

import ru.practicum.model.EndpointHit;
import ru.practicum.properties.StatSvcProperties;

@Service
public class StatsClientService extends BaseClient {
    private static final String API_PREFIX_HIT = "/hit";

    public StatsClientService(@Value("${stats-server.url}") String serverUrl, RestTemplateBuilder builder) {
        super(
                builder
                        .uriTemplateHandler(new DefaultUriBuilderFactory(serverUrl))
                        .requestFactory(() -> new HttpComponentsClientHttpRequestFactory())
                        .build());
    }

    public ResponseEntity<Object> postHit(String app, String uri, String ip, LocalDateTime timestamp) {
        return post(API_PREFIX_HIT, EndpointHit.builder()
                .app(app)
                .uri(uri)
                .ip(ip)
                .timestamp(timestamp.format(StatSvcProperties.DATE_TIME_FORMATTER))
                .build());
    }

    public ResponseEntity<Object> getStatistic(String start, String end, List<String> uris, Boolean unique) {
        Map<String, Object> params = Map.of(
                "start", start,
                "end", end,
                "uris", String.join(",", uris),
                "unique", unique);
        return get("/stats?start={start}&end={end}&uris={uris}&unique={unique}", params);
    }

}
