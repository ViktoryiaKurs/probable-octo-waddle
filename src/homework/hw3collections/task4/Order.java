package homework.hw3collections.task4;

import java.util.Objects;

public class Order {
    private int id;
    private String customerName;
    private double amount;

    public Order(int id, String customerName, double amount) {
        this.id = id;
        this.customerName = customerName;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return id == order.id && Double.compare(amount, order.amount) == 0 && Objects.equals(customerName, order.customerName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, customerName, amount);
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", customerName='" + customerName + '\'' +
                ", amount=" + amount +
                '}';
    }
}
