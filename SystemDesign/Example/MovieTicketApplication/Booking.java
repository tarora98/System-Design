package Example.MovieTicketApplication;

public class Booking {
    Show show;
    list<Seat> bookedSeats = new ArrayList<>();
    Payment payment;

    public Show getShow() {return show;}

    public void setShow(Show show) {
        this.show = show;
    }

    public List<Seat> getBookedSeats(){
        return bookedSeats;
    }

    public void setBookedSeats(List<Seat> bookedSeats){
        this.bookedSeats = bookedSeats;
    }

    public Payment getPayment(){
        return payment;
    }

    public void setPayment(Payment payment){
        this.payment = payment;
    }
}
