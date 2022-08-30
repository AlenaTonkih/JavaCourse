package day6;

public class Task2 {
    public static void main(String[] args) {
    Airplane airplane = new Airplane("ATR", 2010, 50, 10);

    airplane.setYear(2018);
    airplane.setLength(30);

    airplane.fillUp(20);
    airplane.fillUp(10);

    airplane.info();
    }
}
class Airplane {
    private String manufacturer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    //можно автоматически создать конструктор: Правая кнопка мыши - Generation - Constructor
    public Airplane(String manufacturer, int year, int length, int weight) {
        this.manufacturer = manufacturer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }
    public void info(){
        System.out.println("Manufacturer: " + manufacturer + "\n" +
                "Year: " + year + "\n" +
                "Length: " + length + "\n" +
                "Weight: " + weight + "\n" +
                "Fuel: " + fuel + "\n");
    }

    public void fillUp(int n){
        fuel = fuel + n;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;

    }
}

