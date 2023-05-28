package __k2.__sem2.arh.kurs.route;

public class route {
    private int id;
    private String from;
    private String direction;
    private String to;
    public route(){}
    public route(int id, String from, String direction, String to) {
        this.id = id;
        this.from = from;
        this.direction = direction;
        this.to = to;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getFrom() {
        return from;
    }
    public void setFrom(String from) {
        this.from = from;
    }
    public String getDirection() {
        return direction;
    }
    public void setDirection(String direction) {
        this.direction = direction;
    }
    public String getTo() {
        return to;
    }
    public void setTo(String to) {
        this.to = to;
    }
}
