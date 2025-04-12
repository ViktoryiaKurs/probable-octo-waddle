public class Main {
    public static void main(String[] args) {
        Integer[] arrayOfInt = {100, -50, -10, 40, -80};
        Double[] arrayOfFloat = {-4.5, 10.5, -6.0, 15.1, -15.1};
        System.out.println("Сумма целочисленного массива:" + Operations.sum(arrayOfInt, 0, arrayOfInt.length - 1));
        System.out.println("Сумма вещественного массива:" + Operations.sum(arrayOfFloat, 0, arrayOfInt.length - 1));
    }
}