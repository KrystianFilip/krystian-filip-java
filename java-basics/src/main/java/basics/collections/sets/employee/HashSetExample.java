package basics.collections.sets.employee;

import java.util.HashSet;
import java.util.Iterator;

/* Think of this as non-transparent box containing unique objects (non-repeatable). HashSet stores elements of
   a collection in buckets - each bucket contains LinkedLists of objects belonging to the same category. Category
   of an object is set by hashCode method of certain object. The difference between HashSet and HashMap is simple:
   HashMap contains entries and HashSet contains just objects.*/
public class HashSetExample {
    public static void main (String[] args)
    {
        // Creating 5 example Employee objects
        Employee worker1 = new Employee("Steven", "Newmack", 1987, 6, 30);
        Employee worker2 = new Employee("Jennifer", "Nowak", 1988, 2, 28);
        Employee worker3 = new Employee("Robert", "Greenfield", 1987, 6, 15);
        Employee worker4 = new Employee("Monica", "Smith", 1984, 10, 18);
        Employee worker5 = new Employee("Stephanie", "Jackson", 1985, 4, 3);

        // Creating a HashSet and filling it with objects
        HashSet<Employee> workersSet = new HashSet<>();
        workersSet.add(worker1);
        workersSet.add(worker2);
        workersSet.add(worker3);
        workersSet.add(worker4);
        workersSet.add(worker5);

        // Print out every worker from the set.
        // Check condition - print workers born after 1986.
        for(Employee theWorker: workersSet){
            System.out.println(theWorker);
        }
        System.out.println();
        for (Employee worker : workersSet) {
            if(worker.getBirthDate().getYear() >= 1986) {
                System.out.println(worker);
            }
        }
        System.out.println();
        // Check condition, using Iterator interface and while loop.
        Iterator<Employee> iteratorWorkersSet = workersSet.iterator();
        System.out.println(">>>Loop with condition started.");
        while(iteratorWorkersSet.hasNext()) {
            Employee currentWorker = iteratorWorkersSet.next();
            System.out.println(currentWorker);
        }
        System.out.println(">>>Loop ended.");
    }
}
