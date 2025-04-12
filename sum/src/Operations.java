public class Operations {
    public static <T extends Number> double sum(T[] array, int start, int end) {
        if (array == null) {
            System.out.println("Нечего там суммировать йоу, сам, ручками");
            return 666;
        } else if (start == end) {
            return array[start].doubleValue();
        } else {
            return array[start].doubleValue() + sum(array, start + 1, end);
        }
    }
}
