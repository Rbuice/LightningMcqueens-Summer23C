package main.java.memoranda;

public class Bus {
    private String id;
    private int seats;
    private Route currentRoute;
    private int timebusy;
    public Bus(String id, int seat) {
        this.id = id;
        this.seats = seat;
        this.currentRoute = null;
        this.timebusy = 0;
    }
    public void setRoute(Route route) {
        this.currentRoute = route;
        this.timebusy = route.getDuration();
    }
}
