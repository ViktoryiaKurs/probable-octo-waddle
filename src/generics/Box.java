package generics;

public class Box<T> {
    private T value;

    public void put(T item) {
        if (item == null) {
            System.out.println("The element is empty");
            return;
        }
        this.value = item;
    }

    public T getValue() {
        return value;
    }

    public boolean isEmpty() {
        return value == null;
    }

    public static <T> Box<T> fromArray(T[] array) {
        if (array == null || array.length == 0) {
            return null;
        }
        Box<T> box = new Box<>();
        box.put(array[0]);
        return box;
    }

    public boolean isSameType(Box<?> other) {
        if (this.value == null || other == null || other.getValue() == null) {
            return false;
        }
        return this.value.getClass().equals(other.getValue().getClass());
    }
}
