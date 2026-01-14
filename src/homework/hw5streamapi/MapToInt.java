package homework.hw5streamapi;

import java.util.Arrays;
import java.util.List;

// Найти среднюю длину названий товаров
public class MapToInt {
    public static void main(String[] args) {
        List<String> productNames = Arrays.asList(
                "Ноутбук Lenovo IdeaPad",
                "Смартфон Samsung Galaxy",
                "Наушники Sony WH-1000XM4",
                "Планшет Apple iPad Pro",
                "Часы Apple Watch Series 7",
                "Фотоаппарат Canon EOS R5"
        );

        productNames.stream()
                .mapToInt(String::length)
                .average()
                .ifPresent(avg -> System.out.println((int) avg));
    }
}
