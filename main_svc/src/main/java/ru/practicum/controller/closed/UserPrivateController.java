package ru.practicum.controller.closed;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import ru.practicum.dto.ParticipationRequestDto;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping(value = "/users/{userId}/requests")
@RequiredArgsConstructor
public class UserPrivateController {

    @GetMapping
    public List<ParticipationRequestDto> findRequests(@PathVariable Long userId) {
        return null;
    }

    @PostMapping
    public ParticipationRequestDto saveRequest(
            @PathVariable Long userId,
            @RequestParam(name = "eventId") Integer eventId) {
        return null;
    }

    @PatchMapping("/{requestId}/cancel")
    public ParticipationRequestDto updateRequest(
            @PathVariable Long userId,
            @PathVariable Long requestId) {
        return null;
    }
}
