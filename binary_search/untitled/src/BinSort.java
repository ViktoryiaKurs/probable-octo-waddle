import java.util.ArrayList;

public class BinSort {
    public int search(int target, ArrayList<Integer> mas){
        int left = 0;
        int counter = 0;
        int right = mas.size() - 1;
        int middle = (right + left) / 2;
        while (true){
            counter++;
            if (mas.get(middle) == n){
                break;
            }
            else if (mas.get(middle) < n){
                left = middle + 1;
            }
            else if (mas.get(middle) > n){
                right = middle - 1;
            }
        }
        return counter;
    }
}
