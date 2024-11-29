package Example.MovieTicketApplication;

public class BookMyshow {
    
    MovieController movieController;
    ThreatreController threatreController;

    BookMyShow(){
        movieController = new MovieController();
        threatreController = new ThreatreController();
    }

    public static void main(String[] args){
        BookMyshow bookMyShow = new BookMyshow();

        bookMyShow.initialize();

        // user1
        bookMyShow.createBooking

    }

    private void initialize(){
        createMovie();
        createThreatre();
    }

    public void createThreatre(){
        Movie avengerMovie  = movieController.getMovieByName("AVENGER");

    }

    private void createMovie(){
        // create Movie1
        Movie avenger = new Movie();
        avenger.setMovieId(1);
        avenger.setMovieName("AVENGER");
        avenger.setMovieDuration(128);

        // create Movie2
        Movie baahubali = new Movie();
        avenger.setMovieId(2);
        avenger.setMovieName("BAAHUBALI");
        avenger.setMovieDuration(200);

        // add movie to the cities
        movieController.addMovie(avenger, "Banglore");
        movieController.addMovie(avenger, "Delhi");
        movieController.addMovie(baahubali, "Chandigarh");
        movieController.addMovie(baahubali, "delhi");
    }

    private void createThreatre(){

        Movie avengerMovie = movieController.getMovieByName("AVENGER");
        Movie bhabhuli = movieController.getMovieByName("BAHUBHALI");

        Threatre inoxThreater = new Threatre();
        inoxThreater.setThreadId(1);
        inoxThreater.setScreen(createScreen());
        inoxThreater.setCity(City.Banglore);
        
    }






}
