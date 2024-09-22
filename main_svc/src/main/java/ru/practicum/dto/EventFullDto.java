package ru.practicum.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.practicum.enums.State;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EventFullDto {
    String annotation;
    CategoryDto category;
    Integer confirmedRequests;
    String createdOn;
    String description;
    String eventDate;
    Long id;
    UserShortDto initiator;
    Location location;
    Boolean paid;
    Integer participantLimit;
    String publishedOn;
    Boolean requestModeration;
    State state;
    String title;
    Integer views;
}
