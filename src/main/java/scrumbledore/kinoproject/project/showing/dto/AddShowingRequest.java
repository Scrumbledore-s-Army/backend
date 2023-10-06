package scrumbledore.kinoproject.project.showing.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import scrumbledore.kinoproject.project.showing.entity.Showing;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AddShowingRequest {

    private int filmId;
    private int theaterId;
    private Double ticketPrice;
    @JsonFormat(pattern = "yyyy-MM-dd", shape = JsonFormat.Shape.STRING)
    private LocalDateTime timeAndDate;

//    public static Showing getShowingRequest(AddShowingRequest addShowingRequest){
//        Showing showing = Showing.builder().film(addShowingRequest.getFilmId());
//    }

    public AddShowingRequest(Showing showing){
        this.filmId=showing.getFilm().getId();
        this.theaterId=showing.getTheater().getId();
        this.ticketPrice=showing.getTicketPrice();
        this.timeAndDate=showing.getTimeAndDate();
    }

}
