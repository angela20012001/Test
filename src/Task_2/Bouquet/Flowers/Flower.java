package Task_2.Bouquet.Flowers;

public class Flower {

    protected int price;
    protected int height;
    protected int freshnessDegree;
    protected String color;

    public Flower() {

    }

    public Flower(int price, int height, int freshnessDegree, String color) {
        this.price = price;
        this.height = height;
        this.freshnessDegree = freshnessDegree;
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getFreshnessDegree() {
        return freshnessDegree;
    }

    public void setFreshnessDegree(int freshnessDegree) {
        this.freshnessDegree = freshnessDegree;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return ". Цена: " + this.price + " руб. Степень свежести: " + this.freshnessDegree + " %." + "Высота: " +
                this.height + ". Цвет: " + this.color;
    }
}
