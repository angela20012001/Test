package Task_2.Bouquet.Flowers;

public class Orchid extends Flower{

    private String fullOrchidName;

    public Orchid(int price, int height, int freshnessDegree, String color, String fullOrchidName) {
        super(price, height, freshnessDegree, color);
        this.setFullOrchidName(fullOrchidName);
    }

    public Orchid() {}

    public String getFullOrchidName() {
        return fullOrchidName;
    }

    public void setFullOrchidName(String fullOrchidName) {
        this.fullOrchidName = fullOrchidName;
    }

    @Override
    public String toString() {
        return "Орхидея " + fullOrchidName + super.toString();
    }
}
