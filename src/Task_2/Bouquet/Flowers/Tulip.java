package Task_2.Bouquet.Flowers;

public class Tulip extends Flower{

    private String fullTulipName;

    public Tulip(int price, int height, int freshnessDegree, String color, String fullTulipName) {
        super(price, height, freshnessDegree, color);
        this.setFullTulipName(fullTulipName);
    }

    public Tulip() {}

    public String getFullRoseName() {
        return fullTulipName;
    }

    public void setFullTulipName(String fullTulipName) {
        this.fullTulipName = fullTulipName;
    }

    @Override
    public String toString() {
        return "Тюльпан " + fullTulipName + super.toString();
    }
}
