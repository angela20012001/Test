package Task_2.Bouquet.Flowers;

public class Rose extends Flower{

    private String fullRoseName;

    public Rose(int price, int height, int freshnessDegree, String color, String fullRoseName) {
        super(price, height, freshnessDegree, color);
        this.setFullRoseName(fullRoseName);
    }

    public Rose() {}

    public String getFullRoseName() {
        return fullRoseName;
    }

    public void setFullRoseName(String fullRoseName) {
        this.fullRoseName = fullRoseName;
    }

    @Override
    public String toString() {
        return "Роза " + fullRoseName + super.toString();
    }
}
