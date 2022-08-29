package day5;


public class Task2 {
    public static void main(String[] args) {
        Motorbike motorbike1 = new Motorbike("Audi", "Green", 2015);
        String motoBrand = motorbike1.getBrand();
        String motoColor = motorbike1.getColor();
        int motoYear = motorbike1.getYear();

        System.out.println("Марка мотоцикла: " + motoBrand);
        System.out.println("Цвет мотоцикла: " + motoColor);
        System.out.println("Год выпуска мотоцикла: " + motoYear);
    }
}
class Motorbike {
    private String brand;
    private String color;
    private int year;

    public Motorbike(String brand, String color, int year){
        this.brand = brand;
        this.color = color;
        this.year = year;

    }
    public String getBrand(){
        return brand;
    }
    public String getColor(){
        return color;
    }
    public int getYear(){
        return year;
    }
}
