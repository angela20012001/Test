package com.company;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

class Wheel {
    private String producer;
    private double diameter;
    private int maxPressure;

    public Wheel() {}

    public Wheel (String producer, double diameter, int maxPressure) {
        this.producer = producer;
        this.diameter = diameter;
        this.maxPressure = maxPressure;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public int getMaxPressure() {
        return maxPressure;
    }

    public void setMaxPressure(int maxPressure) {
        this.maxPressure = maxPressure;
    }

    @Override
    public String toString() {
        return "Колесо: " +
                "производитель: " + producer +
                ", диаметр: " + diameter +
                ", максимальное давление: " + maxPressure + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wheel wheel = (Wheel) o;
        return Double.compare(wheel.diameter, diameter) == 0 && maxPressure == wheel.maxPressure && Objects.equals(producer, wheel.producer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(producer, diameter, maxPressure);
    }
}

class Engine {
    private String serialNumber;
    private String producer;
    private boolean isStart = false;

    public Engine () {}

    public Engine (String serialNumber, String producer, boolean isStart) {
        this.serialNumber = serialNumber;
        this.producer = producer;
        this.isStart = isStart;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public boolean isStart() {
        return isStart;
    }

    public void setStart(boolean start) {
        isStart = start;
    }

    @Override
    public String toString() {
        return "серийный номер: " + serialNumber +
                ", производитель: " + producer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engine engine = (Engine) o;
        return isStart == engine.isStart && Objects.equals(serialNumber, engine.serialNumber) && Objects.equals(producer, engine.producer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serialNumber, producer, isStart);
    }
}

class Auto {

    private String mark;
    private int year;
    private Wheel[] wheels;
    private Engine engine;
    private int fuelLevel;

    Auto() {
        this.setWheels(new Wheel[4]);
        for (int i = 0; i < 4; i++) {
            this.getWheels()[i] = new Wheel();
        }

        this.setEngine(new Engine());
    }

    Auto (String mark, int year, Wheel[] wheels, Engine engine, int fuelLevel) {
        this.mark = mark;
        this.year = year;
        this.wheels = wheels;
        this.engine = engine;
        this.fuelLevel = fuelLevel;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Wheel[] getWheels() {
        return wheels;
    }

    public void setWheels(Wheel[] wheels) {
        this.wheels = wheels;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setFuelLevel(int fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public int getFuelLevel() {
        return fuelLevel;
    }

    public void go() {
        this.engine.setStart(true);
        System.out.println("Поехали!");
    }

    public void stop() {
        this.engine.setStart(false);
        System.out.println("Стоп!");
    }

    public void drive() {
        this.fuelLevel -= 1;
        System.out.println("Едем...");
        System.out.println("Уровень топлива: " + getFuelLevel());
    }

    public void addFuel(int fuel) {
        this.fuelLevel += fuel;
        System.out.println("Добавили топливо");
        System.out.println("Уровень топлива: " + getFuelLevel());
    }

    public void changeWheel(int position) {
        Scanner scanner = new Scanner(System.in);
        wheels[position] = new Wheel();
        System.out.print("Введите производителя: ");
        wheels[position].setProducer(scanner.next());
        System.out.print("Введите диаметр колеса: ");
        wheels[position].setDiameter(scanner.nextDouble());
        System.out.print("Введите максимально давление колеса: ");
        wheels[position].setMaxPressure(scanner.nextInt());
        System.out.println("\nПоменяли колесо");
    }

    @Override
    public String toString() {
        return "Марка: " + mark +
                "\nГод выпуска: " + year +
                "\nКолеса:\n" + Arrays.toString(wheels) +
                "\nДвигатель: " + engine +
                "\nУровень топлива: " + fuelLevel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Auto auto = (Auto) o;
        return year == auto.year && fuelLevel == auto.fuelLevel && mark.equals(auto.mark) && Arrays.equals(wheels, auto.wheels) && engine.equals(auto.engine);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(mark, year, engine, fuelLevel);
        result = 31 * result + Arrays.hashCode(wheels);
        return result;
    }

}

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Wheel[] wheels = new Wheel[4];

        System.out.println("Создание автомобиля");

        for (int i = 0; i < wheels.length; i++) {
            System.out.println("\nСоздание " + (i + 1) + " колеса");

            wheels[i] = new Wheel();
            System.out.print("Введите производителя: ");
            wheels[i].setProducer(scanner.next());
            System.out.print("Введите диаметр колеса: ");
            wheels[i].setDiameter(scanner.nextDouble());
            System.out.print("Введите максимально давление колеса: ");
            wheels[i].setMaxPressure(scanner.nextInt());
        }

        System.out.println("\nСоздание двигателя:");
        Engine engine = new Engine();
        System.out.print("Введите производителя: ");
        engine.setProducer(scanner.next());
        System.out.print("Введите серийный номер: ");
        engine.setSerialNumber(scanner.next());

        Auto auto = new Auto();

        System.out.print("\nВведите марку автомобиля: ");
        auto.setMark(scanner.next());
        System.out.print("Введите год выпуска: ");
        auto.setYear(scanner.nextInt());
        auto.setWheels(wheels);
        auto.setEngine(engine);
        System.out.print("Введите уровень топлива: ");
        auto.setFuelLevel(scanner.nextInt());

        System.out.println("\nПолучившийся автомобиль:");
        System.out.println(auto.toString());

        while(true) {

            System.out.println();
            System.out.println("Укажите следующую операцию:");
            System.out.println("1. Поехать");
            System.out.println("2. Остановиться");
            System.out.println("3. Заправиться");
            System.out.println("4. Поменять колесо");
            System.out.println("5. Вывести информацию об автомобиле");
            int operation = scanner.nextInt();

            switch (operation) {
                case 1:
                    auto.go();
                    auto.drive();
                    break;
                case 2:
                    auto.stop();
                    break;
                case 3:
                    System.out.print("Укажите на сколько процентов заполняем бак: ");
                    auto.addFuel(scanner.nextInt());
                    break;
                case 4:
                    System.out.print("Какое колесо нужно поменять: ");
                    auto.changeWheel(scanner.nextInt());
                    break;
                case 5:
                    System.out.println(auto.toString());
                    break;
                default:
                    System.out.println("Данной операции не существует. Повторите попытку");
                    break;
            }
        }
    }
}
