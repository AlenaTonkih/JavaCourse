package day6;

public class Task1 {
    public static void main(String[] args) {
    Auto auto = new Auto(2010, "Green", "Audi");
    auto.info();
        System.out.println(auto.yearDifference(2022));

    Motorbike motorbike = new Motorbike(2000, "Black", "Kawasaki");
    motorbike.info();
    System.out.println(motorbike.yearDifference(2022));

    }
}
class Auto{
    private int year;
    private String color;
    private String brand;

    public Auto(int year, String color, String brand) {
        this.year = year;
        this.color = color;
        this.brand = brand;
    }
    public void info(){
        System.out.println("Это автомобиль");
    }
    public int yearDifference(int inputYear){
        return inputYear - year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
class Motorbike{
    private int year;
    private String color;
    private String brand;

    public Motorbike(int year, String color, String brand) {
        this.year = year;
        this.color = color;
        this.brand = brand;
    }
    public void info(){
        System.out.println("Это мотоцикл");
    }
    public int yearDifference(int inputYear){
        return inputYear - year;
    }
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
