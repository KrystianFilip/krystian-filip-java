package testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {
    public ArrayList<Integer> exterminate(ArrayList<Integer> theList) {
        ArrayList<Integer> evenList = new ArrayList<>();
        for (int even : theList) {
            if (even % 2 == 0) {
                evenList.add(even);
            }
        }
    return evenList;
    }
}
