package com.example.SecretarioVirtual_Demo.entities.calendar;

import com.example.SecretarioVirtual_Demo.entities.enums.Days;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "calendars_range")
public class CalendarRange {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private LocalDateTime startsAt;

    private LocalDateTime endsAt;

    @Enumerated(EnumType.STRING)
    private Days day;

    private Integer appointmentDuration;

    private Integer breakTime;

    private Integer appointmentsAmount;
}
