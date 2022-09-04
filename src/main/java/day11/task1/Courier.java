package day11.task1;

public class Courier implements Worker {
    private int salary;
    private static final int isPayed = 100;
    private Warehouse w;
    private boolean isPay = false;

    public Courier(Warehouse w) {
        this.w = w;
    }

    @Override
    public void doWork() {
        salary = salary + 100;
        w.incrementDeliveredOrders();
    }

    @Override
    public void bonus() {
        if (w.countDeliveredOrders < 10000) {
            System.out.println("Бонус не доступен");
            return;
        }
        if (isPay) {
            System.out.println("Бонус уже был начислен");
            return;
        }
        salary = salary + 50000;
        isPay = true;
    }

    @Override
    public String toString() {
        return "Courier{" +
                "salary=" + salary +
                ", isPay=" + isPay +
                '}';
    }
}
