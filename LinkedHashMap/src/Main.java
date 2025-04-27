
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<Integer, Order> orders = new     LinkedHashMap<>();
        orders.put(11, Order.newOrder(1, "Vlad", 199.9));
        orders.put(22, Order.newOrder(2, "Jan", 200.9));
        orders.put(33, Order.newOrder(3, "Vika", 0.9));
        orders.put(44, Order.newOrder(4, "McGregor", 1990.9));
        orders.put(55, Order.newOrder(5, "Goose", 0.8));
        Order.findOrderById(33, orders);

        Map<Integer, Order> ordersTreeMap = new TreeMap<>();
        ordersTreeMap.putAll(orders);
        for (Map.Entry<Integer, Order> entry : ordersTreeMap.entrySet()){
            entry.getValue().get();
        }
    }
}
