public class Main {
    public static void main(String[] args) {
        ArrayListOperations testList = new ArrayListOperations();
        testList.fillListOfNum();
        testList.getMax();
        System.out.print(", ");
        testList.getMin();
        System.out.println();
        testList.arithmetiMean();
        testList.deleteEvenNumbersOfTheList();
        testList.sort();
    }
}