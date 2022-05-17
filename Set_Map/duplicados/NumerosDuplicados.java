import java.util.*;

public class NumerosDuplicados {

    public static TreeSet<Integer> buscar(int[] list) {
        TreeSet<Integer> returnSet = new TreeSet<>();
        HashSet<Integer> auxSet = new HashSet<>();

        for (int number : list) {
            if (auxSet.contains(number)) {
                returnSet.add(number);
            }
            auxSet.add(number);
        }
        return returnSet;
    }
}
