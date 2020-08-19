package basics.collections.iterables;

import java.util.ArrayList;

public class IterableTest {
    public static void main(String[] args) throws java.lang.Exception {
        ArrayList<String> theList = new ArrayList<String>();
        theList.add("object1");
        theList.add("object2");
        theList.add("object3");
        theList.add("object4");
        theList.add("object5");

        for(String theObject : theList) {
            System.out.println(theObject);
        }
    }
}
