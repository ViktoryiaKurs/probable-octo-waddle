package Lambda;

import java.util.function.Predicate;

public class LambdaStringCheck {
    public static void main(String[] args) {
        String emptyString="";
        String validString ="Ok";

        Predicate <String> isNotEmpty = s -> (s!= null) && !s.isEmpty();
    }
}
