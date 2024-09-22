package ru.practicum.controller.closed;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import ru.practicum.dto.EventFullDto;
import ru.practicum.dto.EventRequestStatusUpdateRequest;
import ru.practicum.dto.EventRequestStatusUpdateResult;
import ru.practicum.dto.EventShortDto;
import ru.practicum.dto.NewEventDto;
import ru.practicum.dto.ParticipationRequestDto;
import ru.practicum.dto.UpdateEventUserRequest;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping(value = "/users/{userId}/events")
@RequiredArgsConstructor
public class EventPrivateController {

    @GetMapping
    public List<EventShortDto> findEvents(
            @PathVariable Long userId,
            @RequestParam(name = "from") Integer from,
            @RequestParam(name = "size") Integer size) {
        return null;
    }

    @PostMapping
    public EventFullDto saveEvent(
            @PathVariable Long userId,
            @Valid @RequestBody NewEventDto newEventDto) {
        return null;
    }

    @GetMapping("/{eventId}")
    public EventFullDto findEvent(
            @PathVariable Long userId,
            @PathVariable Long eventId) {
        return null;
    }

    @PatchMapping("/{eventId}")
    public EventFullDto updateEvent(
            @PathVariable Long userId,
            @PathVariable Long eventId,
            @Valid @RequestBody UpdateEventUserRequest updateEventUserRequest) {
        return null;
    }

    @GetMapping("/{eventId}/requests")
    public List<ParticipationRequestDto> findEventRequests(
            @PathVariable Long userId,
            @PathVariable Long eventId) {
        return null;
    }

    @PatchMapping("/{eventId}/requests")
    public EventRequestStatusUpdateResult findEventRequestStatusUpdate(
            @PathVariable Long userId,
            @PathVariable Long eventId,
            @RequestBody EventRequestStatusUpdateRequest eventRequestStatusUpdateRequest) {
        return null;
    }

}
