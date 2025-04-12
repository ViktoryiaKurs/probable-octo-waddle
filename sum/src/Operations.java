public class Operations {
    public static <T extends Number> double sum(T[] Array, int Start, int End){
        if (Start == End){
            return Array[Start].doubleValue();
        }
        else {
            return Array[Start].doubleValue() + sum(Array, Start + 1, End);
        }
    }
}
