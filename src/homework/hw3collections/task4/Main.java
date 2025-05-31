package homework.hw3collections.task4;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/*
Создайте простую систему учета заказов:
- Класс Order с полями:
id (уникальный номер заказа, можно int или String),
customerName (имя клиента),
amount (сумма заказа, double)
- Создайте LinkedHashMap<Integer, Order>, где ключ — id заказа, а значение — сам заказ.,
- Добавьте 5-7 тестовых заказов.,
- Реализуйте метод findOrderById(int id), который ищет заказ по id и выводит его данные.,
- Создайте TreeMap<Integer, Order> (сортировка по id по возрастанию) и выведите все заказы.
 */
public class Main {
    static LinkedHashMap<Integer, Order> orders = new LinkedHashMap<>();


    public static void main(String[] args) {
        orders.put(1, new Order(1, "John", 5.4));
        orders.put(2, new Order(2, "Jack", 5));
        orders.put(10, new Order(10, "Jill", 1.4));
        orders.put(334, new Order(334, "Jessica", 3.14));
        orders.put(5, new Order(5, "Jennifer", 2.28));

        findOrderById(2);
        findOrderById(500);
        findOrderById(334);

        TreeMap<Integer, Order> sortedOrders = new TreeMap<>(orders);

        for (Map.Entry<Integer, Order> entry : sortedOrders.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

    }

    public static void findOrderById(int id){
        System.out.println(orders.get(id));
    }
}
