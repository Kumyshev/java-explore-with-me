package ru.practicum.controller.open;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import ru.practicum.dto.EventFullDto;
import ru.practicum.dto.EventShortDto;
import ru.practicum.enums.AvailableValues;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping(value = "/events")
@RequiredArgsConstructor
public class EventPublicController {

    @GetMapping
    public List<EventShortDto> findEvents(
            @RequestParam(name = "text") String text,
            @RequestParam(name = "categories") List<Long> categories,
            @RequestParam(name = "paid") Boolean paid,
            @RequestParam(name = "rangeStart") String rangeStart,
            @RequestParam(name = "rangeEnd") String rangeEnd,
            @RequestParam(name = "onlyAvailable") Boolean onlyAvailable,
            @RequestParam(name = "sort") AvailableValues sort,
            @RequestParam(name = "from") Integer from,
            @RequestParam(name = "size") Integer size) {
        return null;
    }

    @GetMapping("/{id}")
    public EventFullDto findEvent(@PathVariable Long id) {
        return null;
    }

}
