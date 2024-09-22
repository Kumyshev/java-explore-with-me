package ru.practicum.dto;

import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NewEventDto {
    @Size(min = 20, max = 2000)
    String annotation;
    Long category;
    @Size(min = 20, max = 7000)
    String description;
    String eventDate;
    Location location;
    Boolean paid = false;
    Integer participantLimit = 0;
    Boolean requestModeration = true;
    @Size(min = 3, max = 120)
    String title;
}
