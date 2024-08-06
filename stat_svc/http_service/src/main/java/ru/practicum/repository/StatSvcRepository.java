package ru.practicum.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import ru.practicum.model.Stats;
import ru.practicum.model.ViewStats;

public interface StatSvcRepository extends JpaRepository<Stats, Long> {

        @Query("select new ru.practicum.model.ViewStats(s.app, s.uri, count(distinct s.ip) as hits) " +
                        "from stats s " +
                        "where s.timestamp between :start and :end " +
                        "group by s.app, s.uri " +
                        "order by hits desc")
        List<ViewStats> getUniqueStats(@Param("start") LocalDateTime start, @Param("end") LocalDateTime end);

        @Query("select new ru.practicum.model.ViewStats(s.app, s.uri, count(s.ip) as hits) " +
                        "from stats s " +
                        "where s.timestamp between :start and :end " +
                        "group by s.app, s.uri " +
                        "order by hits desc")
        List<ViewStats> getAllStats(@Param("start") LocalDateTime start, @Param("end") LocalDateTime end);

        @Query("select new ru.practicum.model.ViewStats(s.app, s.uri, count(distinct s.ip) as hits) " +
                        "from stats s " +
                        "where s.timestamp between :start and :end " +
                        "and s.uri in (:uris) " +
                        "group by s.app, s.uri " +
                        "order by hits desc")
        List<ViewStats> getUniqueStatsByUris(@Param("start") LocalDateTime start, @Param("end") LocalDateTime end,
                        @Param("uris") List<String> uris);

        @Query("select new ru.practicum.model.ViewStats(s.app, s.uri, count(s.ip) as hits) " +
                        "from stats s " +
                        "where s.timestamp between :start and :end " +
                        "and s.uri in (:uris) " +
                        "group by s.app, s.uri " +
                        "order by hits desc")
        List<ViewStats> getAllStatsByUris(@Param("start") LocalDateTime start, @Param("end") LocalDateTime end,
                        @Param("uris") List<String> uris);

}
