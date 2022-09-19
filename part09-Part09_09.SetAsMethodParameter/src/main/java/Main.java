import java.util.*;

public class Main {
    public static int returnSize(Set a) {
        return a.size();
    }

    public static void main(String[] args) {
        // You can test your method here
        Set<String> names = new HashSet<>();
        names.add("first");
        names.add("first");
        names.add("second");
        names.add("second");
        names.add("second");

        System.out.println(returnSize(names));

    }

    // implement the method returnSize here, which returns
    // the number of elements in the set that it receives as a parameter.

}
