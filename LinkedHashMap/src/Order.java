
import java.util.Map;

public class Order {
    private int id;
    private String customerName;
    private double amount;

    public static Order newOrder(Integer id, String customerName, double amount){
        Order obj = new Order();
        obj.id = id;
        obj.customerName = customerName;
        obj.amount = amount;
        return obj;
    }

    public void get(){
        System.out.println("ID: " + id + "; customer name: " + customerName + "; amount: " + amount + ";");
    }

    public static void findOrderById(int id, Map<Integer, Order> map){
        System.out.println(map.get(id).id + " " + map.get(id).customerName + " " + map.get(id).amount);
    }
}
