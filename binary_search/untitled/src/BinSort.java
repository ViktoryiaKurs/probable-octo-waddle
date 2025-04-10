import java.util.ArrayList;

public class BinSort {
    public int Search(int n, ArrayList<Integer> mas){
        int left = 0;
        int counter = 0;
        int right = mas.size() - 1;
        int founded = n + 1;
        while (founded != n){
            counter++;
            if (mas.get((right + left) / 2) == n){
                founded = n;
                continue;
            }
            else if (mas.get((right + left) / 2) < n){
                left = (right + left) / 2 + 1;
            }
            else if (mas.get((right + left) / 2) > n){
                right = (right + left) / 2 - 1;
            }
        }
        return counter;
    }
}
