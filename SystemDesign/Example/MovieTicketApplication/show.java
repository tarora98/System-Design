package Example.MovieTicketApplication;

import java.util.*;

public class show {

    int showId;
    Movie movie;
    Screen screen;
    int showStartTime;
    list<Integer> bookedSeats = new ArrayList<>();

    public int getShowId(){
        return showId;
    }

    public void setShowId(int showId){
        this.showId = showId;
    }

    public Movie getMovie(){
        return movie;
    }

    public void setMovie(Movie movie){
        this.movie = movie;
    }
    
    public Screen getScreen(){
        return screen;
    }

    public void setScreen(Screen screen){
        this.screen = screen;
    }

    public int getShowStartTime(){
        return showStartTime;
    }
}
