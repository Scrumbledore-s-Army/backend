package scrumbledore.kinoproject.project.seat.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import scrumbledore.kinoproject.project.reservation.entity.Reservation;
import scrumbledore.kinoproject.project.showing.entity.Showing;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Seat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    private Showing showing;
    private Integer seatNumber;
    @ManyToOne
    private Reservation reservation;
    Integer showingIdOnShowing;
}
