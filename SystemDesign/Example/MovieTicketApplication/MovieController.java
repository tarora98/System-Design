package Example.MovieTicketApplication;
import java.util.*;

import Example.MovieTicketApplication.Enum.City;

public class MovieController {

    Map<City, List<Movie>> cityVsMovie;
    List<Movie> allMovie;

    void addMovie(Movie movie, City city){
        allMovie.add(movie);

        List<Movie> movies = cityVsMovie.getOrDefault(city, new ArrayList<>());
        movies.add(movie);
        cityVsMovie.put(city, movies);
    }

    Movie getMovieByName(String movieName){
        for(Movie movie: allMovie){
            if((movie.getMovieName().equals(movieName))){
                return movie;
            }
        }

        return null;
    }


    
}
