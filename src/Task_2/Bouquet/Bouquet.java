package Task_2.Bouquet;

import Task_2.Bouquet.Accessories.Accessory;
import Task_2.Bouquet.Flowers.Flower;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Bouquet {

    private String name;
    private List<Flower> flowers = new ArrayList<>();
    private List<Accessory> accessories = new ArrayList<>();

    public Bouquet() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addFlower(Flower newFlower) {
        this.flowers.add(newFlower);
    }

    public void addAccessory(Accessory newAccessory) {
        this.accessories.add(newAccessory);
    }

    public int calculateTheCost() {
        int cost = 0;

        for (Flower flower : flowers) {
            cost += flower.getPrice();
        }

        for (Accessory accessory : accessories) {
            cost += accessory.getPrice();
        }

        return cost;
    }

    public void sortFlowersByFreshness() {
        this.flowers.sort(new Comparator<Flower>() {
            @Override
            public int compare(Flower o1, Flower o2) {
                return o2.getFreshnessDegree() - o1.getFreshnessDegree();
            }
        });
    }

    public void printInfoAboutFlowersInHeightRange(int minHeight, int maxHeight) {
        for (Flower flower : flowers) {
            if (flower.getHeight() > minHeight && flower.getHeight() < maxHeight) {
                System.out.println(flower);
            }
        }
    }


    @Override
    public String toString() {
        StringBuilder fullInfo = new StringBuilder();

        fullInfo.append("Букет: ").append(name).append("\nЦветы:\n");

        for (Flower flower : flowers) {
            fullInfo.append("--").append(flower).append("\n");
        }

        fullInfo.append("Дополнительные аксессуары:\n");

        for (Accessory accessory : accessories) {
            fullInfo.append("--").append(accessory).append("\n");
        }

        return fullInfo.toString();
    }
}
