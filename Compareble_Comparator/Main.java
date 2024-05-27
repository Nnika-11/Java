package Java.Compareble_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<ComparableTestEstimation> estimations = new ArrayList<>();
        estimations.add(new ComparableTestEstimation("Task A", 5, 1));
        estimations.add(new ComparableTestEstimation("Task B", 2, 3));
        estimations.add(new ComparableTestEstimation("Task C", 8, 2));
        estimations.add(new ComparableTestEstimation("Task E", 6, 2));
        Collections.sort(estimations);

        for (ComparableTestEstimation estimation : estimations) {
            System.out.println(estimation);
        }
    }
}
