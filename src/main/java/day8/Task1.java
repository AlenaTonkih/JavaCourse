package day8;

public class Task1 {
    public static void main(String[] args) {
    String numbers = "";
        long startTime = System.currentTimeMillis();
    for(int i = 0; i <= 20000; i++)
        numbers += i + " ";

        //System.out.println(numbers);
        long stopTime = System.currentTimeMillis();
        System.out.println("Длительность работы: " + (stopTime - startTime));


        long startTime2 = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder(numbers);
        System.out.println(sb.toString());
        long stopTime2 = System.currentTimeMillis();
        System.out.println("Длительность работы StringBuilder: " + (stopTime2 - startTime2));
    }
}
