package ru.practicum.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.practicum.enums.State;

@Entity(name = "events")
@Table(name = "events")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String annotation;
    @ManyToOne
    Category category;
    @Column(name = "confirmed_requests")
    Integer confirmedRequests;
    @Column(name = "created_on")
    String createdOn;
    String description;
    @Column(name = "event_date")
    String eventDate;
    @ManyToOne
    User initiator;
    Float lat;
    Float lon;
    Boolean paid;
    @Column(name = "participant_limit")
    Integer participantLimit;
    @Column(name = "published_on")
    String publishedOn;
    @Column(name = "request_moderation")
    Boolean requestModeration;
    State state;
    String title;
    Integer views;
}
