package ru.practicum.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CompilationDto {

    List<EventShortDto> events;

    Long id;

    Boolean pinned;

    String title;
}
