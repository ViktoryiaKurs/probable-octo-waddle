import java.util.ArrayList;

public class BinSort {
    public int search(int target, ArrayList<Integer> mas){
        int left = 0;
        int counter = 0;
        int right = mas.size() - 1;
        int middle;
        while (true){
            counter++;
            middle = (right + left) / 2;
            if (mas.get(middle) == target){
                break;
            }
            else if (mas.get(middle) < target){
                left = middle + 1;
            }
            else if (mas.get(middle) > target){
                right = middle - 1;
            }
        }
        return counter;
    }
}
