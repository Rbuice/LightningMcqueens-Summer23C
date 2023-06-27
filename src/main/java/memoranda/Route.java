package main.java.memoranda;

public class Route {
    private Node[] nodes;
    private int length;
    private int duration;
    public Route(Node[] node, int length, int duration) {
        this.nodes = node;
        this.length = length;
        this.duration = duration;
    }
    public int getDuration() {
        return this.duration;
    }
}
