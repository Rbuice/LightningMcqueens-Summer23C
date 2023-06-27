package main.java.memoranda;

public class Tour {
    private String id;
    private Route route;
    private String currentbus;
    public Tour(String id, Route route) {
        this.id = id;
        this.route = route;
        this.currentbus = null;
    }
    public void setBus(String busid) {
        this.currentbus = busid;
    }
}
