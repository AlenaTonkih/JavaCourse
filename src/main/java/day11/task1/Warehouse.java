package day11.task1;

public class Warehouse {
    public int countPickedOrders; //кол-во собранных заказов
    public int countDeliveredOrders;//кол-во доставленных заказов

    public int getCountPickedOrders() {
        return countPickedOrders;
    }

    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }
    public void incrementPickedOrders(){
        countPickedOrders++;
    }
    public void incrementDeliveredOrders(){
        countDeliveredOrders++;
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "countPickedOrders=" + countPickedOrders +
                ", countDeliveredOrders=" + countDeliveredOrders +
                '}';
    }

}
