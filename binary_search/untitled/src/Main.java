import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int counterEl = 0;
        int find;
        Integer elMas;
        ArrayList<Integer> mas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите массив для поиска через пробел (при окончании введите -1):");
        while (true){
            elMas = Integer.parseInt(sc.next());
            if (elMas == -1){
                break;
            }
            mas.add(elMas);
        }
        System.out.println("Введите число для поиска:");
        find = sc.nextInt();
        BinSort binSearch = new BinSort();
        System.out.println("Элемент найден за " + binSearch.search(find, mas) + " шагов");
    }
}