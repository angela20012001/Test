package Task_2;

import Task_2.Bouquet.Accessories.Accessory;
import Task_2.Bouquet.Bouquet;
import Task_2.Bouquet.Flowers.Flower;
import Task_2.Bouquet.Flowers.Orchid;
import Task_2.Bouquet.Flowers.Rose;
import Task_2.Bouquet.Flowers.Tulip;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Создаем букет цветов\n");
        Bouquet bouquet = new Bouquet();

        System.out.print("Введите название букета: ");
        bouquet.setName(scanner.next());

        System.out.print("\nВведите количество цветов в букете: ");
        int numberOfFlowers = scanner.nextInt();
        for (int i = 0; i < numberOfFlowers; i++) {
            System.out.println("\nВыберете цветок:");
            System.out.println("1. Роза");
            System.out.println("2. Тюльпан");
            System.out.println("3. Орхидея");
            int flower = scanner.nextInt();
            switch (flower) {
                case 1:
                    Rose rose = new Rose();
                    System.out.print("Название: ");
                    rose.setFullRoseName(scanner.next());
                    System.out.print("Цена: ");
                    rose.setPrice(scanner.nextInt());
                    System.out.print("Высота: ");
                    rose.setHeight(scanner.nextInt());
                    System.out.print("Степень свежести: ");
                    rose.setFreshnessDegree(scanner.nextInt());
                    System.out.print("Цвет: ");
                    rose.setColor(scanner.next());
                    bouquet.addFlower(rose);
                    break;
                case 2:
                    Tulip tulip = new Tulip();
                    System.out.print("Название: ");
                    tulip.setFullTulipName(scanner.next());
                    System.out.print("Цена: ");
                    tulip.setPrice(scanner.nextInt());
                    System.out.print("Высота: ");
                    tulip.setHeight(scanner.nextInt());
                    System.out.print("Степень свежести: ");
                    tulip.setFreshnessDegree(scanner.nextInt());
                    System.out.print("Цвет: ");
                    tulip.setColor(scanner.next());
                    bouquet.addFlower(tulip);
                    break;
                case 3:
                    Orchid orchid = new Orchid();
                    System.out.print("Название: ");
                    orchid.setFullOrchidName(scanner.next());
                    System.out.print("Цена: ");
                    orchid.setPrice(scanner.nextInt());
                    System.out.print("Высота: ");
                    orchid.setHeight(scanner.nextInt());
                    System.out.print("Степень свежести: ");
                    orchid.setFreshnessDegree(scanner.nextInt());
                    System.out.print("Цвет: ");
                    orchid.setColor(scanner.next());
                    bouquet.addFlower(orchid);
                    break;
                default:
                    System.out.println("Данного цветка не существует. Повторите попытку.");
                    break;
            }
        }

        System.out.print("\nВведите количество аксессуаров: ");
        int numberOfAccessory = scanner.nextInt();
        for (int j = 0; j < numberOfAccessory; j++) {
            System.out.println("\n" + (j + 1) + " аксессуар:");
            Accessory accessory = new Accessory();
            System.out.print("Название: ");
            accessory.setName(scanner.next());
            System.out.print("Цена: ");
            accessory.setPrice(scanner.nextInt());
            System.out.print("Описание: ");
            accessory.setDescription(scanner.next());
            bouquet.addAccessory(accessory);
        }

        while (true) {
            System.out.println("\nВыберете операцию:");
            System.out.println("1. Определить стоимость букета");
            System.out.println("2. Отсортировать цветы в букете на основе уровня свежести");
            System.out.println("3. Найти цветок в букете в пределе диапазона длин стеблей");
            int operation = scanner.nextInt();
            switch (operation) {
                case 1:
                    System.out.println(bouquet);
                    System.out.println("Итоговая стоимость букета: " + bouquet.calculateTheCost() + " руб");
                    break;
                case 2:
                    System.out.println("\nБукет с отсортированными цветами по убыванию уровня свежести\n");
                    bouquet.sortFlowersByFreshness();
                    System.out.println(bouquet);
                    break;
                case 3:
                    System.out.print("Минимальная длина: ");
                    int minHeight = scanner.nextInt();
                    System.out.print("Максимальная длина: ");
                    int maxHeight = scanner.nextInt();
                    bouquet.printInfoAboutFlowersInHeightRange(minHeight, maxHeight);
                    break;
                default:
                    System.out.println("Данной операции не существует. Повторите попытку.");
                    break;
            }
        }
    }
}


