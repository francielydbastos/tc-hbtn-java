import java.util.*;

public class NumerosDuplicados {

    public static TreeSet<Integer> buscar(int[] list) {
        TreeSet<Integer> returnSet = new TreeSet<>();
        ArrayList<Integer> auxSet = new ArrayList<>();

        for (int number : list) {
            auxSet.add(number);
        }

        for(Integer number : auxSet) {
            if(Collections.frequency(auxSet, number) > 1) {
                returnSet.add(number);
            }
        }
        return returnSet;
    }
}
