package scrumbledore.kinoproject.project.theater.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import scrumbledore.kinoproject.project.showing.entity.Showing;
import scrumbledore.kinoproject.project.theater.enity.Theater;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class TheaterResponse {
    private int id;
    private Integer seatCount;

    private List<Showing> showings = new ArrayList<>();
    public TheaterResponse(Theater theater) {
        this.id = theater.getId();
        this.seatCount = theater.getSeatCount();
        this.showings = theater.getShowings();}
}
