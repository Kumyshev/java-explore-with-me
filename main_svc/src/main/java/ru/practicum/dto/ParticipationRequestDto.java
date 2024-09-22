package ru.practicum.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ParticipationRequestDto {
    String created;
    Long event;
    Long id;
    Long requester;
    String status;
}
