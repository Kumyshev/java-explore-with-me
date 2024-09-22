package ru.practicum.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EventShortDto {
    String annotation;
    CategoryDto category;
    Integer confirmedRequests;
    String eventDate;
    Long id;
    UserShortDto initiator;
    Boolean paid;
    String title;
    Integer views;
}
