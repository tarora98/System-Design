package Example.MovieTicketApplication;
import java.util.*;

import javafx.stage.Screen;

public class Threatre {
    int threatreId;
    String address;
    City city;
    List<Screen> screen = new ArrayList<>();
    List<Show> shows = new ArrayList<>();

    public int getThreatreId(){
        return threatreId;
    }

    public void setThreadId(int threatId){
        this.threatreId = threatId; 
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public List<Screen> getScreen(){
        return screen;
    }

    public List<Screen> getScreen(){
        return screen;
    }

    public void setScreen(List<Screen> screen){
        this.screen = screen;
    }

    public List<Show> getShows(){
        return shows;
    }

    public void setShows(List<Show> shows){
        this.shows = shows;
    }

    public City getCity(){
        return city;
    }

    public void setCity(City city){
        this.city = city;
    }
}
