package main.java.memoranda;

public class Driver {
    private String id;
    private String name;
    private String phone;
    private Bus bus;
    public Driver(String id, String name, String phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.bus = null;
    }
    public void setBus(Bus bus) {
        this.bus = bus;
    }
}
