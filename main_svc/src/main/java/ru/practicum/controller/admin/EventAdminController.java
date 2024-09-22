package ru.practicum.controller.admin;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import ru.practicum.dto.EventFullDto;
import ru.practicum.dto.UpdateEventAdminRequest;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping(value = "/admin/events")
@RequiredArgsConstructor
public class EventAdminController {

    @GetMapping
    public List<EventFullDto> findEvents(
            @RequestParam(name = "users") List<Long> usres,
            @RequestParam(name = "states", required = false) List<String> states,
            @RequestParam(name = "categories") List<Long> categories,
            @RequestParam(name = "rangeStart") String rangeStart,
            @RequestParam(name = "rangeEnd") String rangeEnd,
            @RequestParam(name = "from") Integer from,
            @RequestParam(name = "size") Integer size) {
        return null;
    }

    @PatchMapping("/{eventId}")
    public EventFullDto updateEvent(
            @PathVariable Long eventId,
            @Valid @RequestBody UpdateEventAdminRequest updateEventAdminRequest) {
        return null;
    }
}
