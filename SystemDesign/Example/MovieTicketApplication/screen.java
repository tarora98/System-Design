package Example.MovieTicketApplication;

import java.util.*;

public class screen {
    
    int screenId;
    List<Seat> seats = new ArrayList<>();

    public int getScreenId(){
        return screenId;
    }

    public void setScreen(int screenId){
        this.screenId = screenId;
    }

    public List<Seat> getSeats(){
        return seats;
    }

    public void setSeats(List<Seat> seats){
        this.seats = seats;
    }

}
