package ru.practicum.dto;

import java.util.List;

import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdateCompilationRequest {
    List<Long> events;
    Boolean pinned = false;
    @Size(min = 1, max = 50)
    String title;
}
