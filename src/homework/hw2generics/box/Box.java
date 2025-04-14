package homework.hw2generics.box;

import java.util.ArrayList;

/*
Создайте обобщённый класс `Box<T>`, который:
1. Хранит один элемент типа `T`.
2. Имеет методы:
   - `put(T item)` — для сохранения элемента.
   - `T get()` — для извлечения элемента.
   - `boolean isEmpty()` — проверяет, пуст ли бокс.

Добавьте **статический обобщённый метод** `Box<T> fromArray(T[] array)`, который:
- Принимает массив типа `T`.
- Возвращает `Box`, содержащий **первый элемент массива**.
- Если массив пуст, возвращает пустой `Box` (с `null` внутри).

**Опциональное задание:**
Добавьте метод `boolean isSameType(Box<?> other)`, который проверяет, содержит ли текущий `Box` элемент того же типа, что и другой `Box`.
*Подсказка:* Используйте `getClass()` для сравнения типов.
 */
public class Box<T> {
    private T item;

    public Box(){}

    public Box(T item){
        this.item = item;
    }

    public void putItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public boolean isEmpty() {
        return item == null;
    }

    public static <T> Box<T> fromArray(ArrayList<T> arr) {
        if (arr == null || arr.isEmpty()) {
            System.out.println("Argument is empty or null");
            return null;
        }
        Box<T> box = new Box<>();
        box.putItem(arr.get(0));
        return box;
    }

    public boolean isSameType(Box<?> other) {
        if (other == null){
            System.out.println("Argument is null");
            return false;
        }
        if (this.isEmpty() || other.isEmpty()) {
            System.out.println("One of the boxes is empty");
            return false;
        }
        return this.getItem().getClass() == other.getItem().getClass();
    }
}
