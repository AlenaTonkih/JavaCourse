package day11.task1;

public class Picker implements Worker {
    private int salary;
    private static final int isPayed = 80;
    private Warehouse w;
    private boolean isPay = false;
    public Picker(Warehouse w) {
        this.w = w;
    }

    public Picker(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public int getIsPayed() {
        return isPayed;
    }

    @Override
    public void doWork() {
        salary = salary + isPayed;
        w.incrementPickedOrders();
    }

    @Override
    public void bonus() {
   if(w.countPickedOrders < 10000){
       System.out.println("Бонус не доступен");
       return;
   }
   if(isPay){
       System.out.println("Бонус уже был начислен");
       return;
   }
   salary = salary + 70000;
   isPay = true;

    }

    @Override
    public String toString() {
        return "Picker{" +
                "salary=" + salary +
                ", isPay=" + isPay +
                '}';
    }
}
