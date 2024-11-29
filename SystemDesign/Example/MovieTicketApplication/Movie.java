package Example.MovieTicketApplication;

public class Movie {

    int movieId;
    String movieName;
    int movieDurationInMinutes;

    public int getMovieId(){
        return movieId;
    }

    public void setMovieId(int movieId){
        this.movieId = movieId;
    }

    public String getMovieName(){
        return movieName;
    }

    public void setMovieName(String movieName){
        this.movieName = movieName;
    }

    public int getMovieDuration(int movieDuration){
        this.movieDurationInMinutes = movieDuration;
    }

    public void setMovieDuration( movieDuration){
        this.movieDurationInMinutes = movieDuration;
    }
}
