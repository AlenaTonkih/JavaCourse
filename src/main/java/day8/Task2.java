package day8;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Boeing", 2010, 30, 10);
        System.out.println(airplane1);

    }
}
class Airplane {
    private String manufacturer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public Airplane(String manufacturer, int year, int length, int weight) {
        this.manufacturer = manufacturer;
        this.year = year;
        this.length = length;
        this.weight = weight;

    }

    public String toString() { //используем, чтобы вывести строку, а не хэшкод
        return manufacturer + ", " + year + ", " + length + ", " + weight;

    }
}


