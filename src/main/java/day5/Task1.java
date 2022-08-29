package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setBrand("Audi"); //сеттеры - назначают методы
        car1.setColor("Green");
        car1.setYear(2013);

        System.out.println("Вывод значения марки автомобиля: " + car1.getBrand());
        System.out.println("Вывод значения цвета автомобиля: " + car1.getColor());
        System.out.println("Вывод значения года выпуска автомобиля: " + car1.getYear());
        //геттеры методы выводят
    }
}
class Car {
    private String brand;
    private String color;
    private int year;

    public void setBrand(String userBrand){
        brand = userBrand;
    }
    public String getBrand(){
        return brand;
    }
    public void setColor(String userColor){
        color = userColor;
    }
    public String getColor(){
        return color;
    }
    public void setYear(int userYear){
        year = userYear;
    }

    public int getYear() {
        return year;
    }
}
