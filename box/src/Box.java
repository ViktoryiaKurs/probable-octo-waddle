public class Box <T> {
    private T myBox;

    public void put(T item) {
        if (item != null) {
            this.myBox = item;
            return;
        }
        System.out.println("Element equal null");
    }

    public T get() {
        return myBox;
    }

    public boolean isEmpty() {
        return myBox == null;
    }

    public static <T> Box<T> fromArray(T[] array) {
        if ((array != null) || (array.length != 0)) {
            Box<T> value = new Box<>();
            value.put(array[0]);
            return value;
        }
        return null;
    }
    public boolean isTheSameType(Box<?> other){
        if (isEmpty() || other == null || other.get() == null) {
            return false;
        }
        return this.myBox.getClass().equals(other.get().getClass());
    }
}
