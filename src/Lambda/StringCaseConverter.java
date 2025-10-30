package Lambda;

import java.util.ArrayList;
import java.util.List;

public class StringCaseConverter {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("VIKA");
        names.add("hanna");

        names.replaceAll(String::toLowerCase);
        System.out.println(names);

        names.replaceAll(String::toUpperCase);
        System.out.println(names);

    }
}
