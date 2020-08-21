package basics.collections.maps.salaries;

import java.util.HashMap;
import java.util.Map;

/*The most common implementation of >>Map<< interface is HashMap. It is a structure of data containing KEY-VALUE pairs which together
are called ENTRIES. HashMap is based on assumption that the entire collection of entries is divided into smaller sub-collections named
BUCKETS - those fall into sub-collections with similar values/attributes/characteristics.
*/
public class HashMapTest {
    public static void main(String[] args) {

        Employee worker1 = new Employee("Jennifer", "Nowak", "12345678901");
        Employee worker2 = new Employee("Sarah", "Taylor", "12345612345");
        Employee worker3 = new Employee("Laura", "Pinelli", "12345698765");
        Employee worker4 = new Employee("Laura", "Pinelli", "12345045678");

        SalaryParameters params1 = new SalaryParameters(5000.0, 3000.0, 0.0, 0.0);
        SalaryParameters params2 = new SalaryParameters(4000.0, 2000.0, 1000.0, 0.0);
        SalaryParameters params3 = new SalaryParameters(4500.0, 3500.0, 0.0, 0.0);
        SalaryParameters params4 = new SalaryParameters(11000.0, 0.0, 2000.0, 1000.0);

        /*HashMap contains list(ArrayList) of buckets and each bucket contains another list(LinkedList) of different
         entry-type objects, that fits certain bucket (uniqueness of keys is being checked not uniqueness of values) */

        HashMap<Employee, SalaryParameters> paymentParameters = new HashMap<Employee, SalaryParameters>();
        paymentParameters.put(worker1, params1);
        paymentParameters.put(worker2, params2);
        paymentParameters.put(worker3, params3);
        paymentParameters.put(worker4, params4);

        System.out.println("Salary of worker #1 equals: " + paymentParameters.get(worker1));
        /* We can use HashMap in cases where to one unique, "permanent" object(key) we are assigning a different object with
        more transitory/changeable character. Good example listed above = salary parameters. */

        /* Map includes two different types of elements - key and value - but the type that represents the whole HashMap
        will be - entry (it defines itself in interface Map) - we can get access to this beauty thanks to entrySet(), getKey(),
        getValue() methods. */
        for(Map.Entry<Employee, SalaryParameters> entry : paymentParameters.entrySet()) {
            System.out.println("Salary of: " + entry.getKey() + " equals: " + entry.getValue());
            if(entry.getValue().getBaseSalary() >= 5000) {
                System.out.println( "The chosen one: " + entry.getKey() + " makes: " +
                        entry.getValue().getBaseSalary() + " as a regular payment.");
            }
        }
        /* Adding some getters to the SalaryParameters class allows us to modify our program to display only
        certain salary parameters - e.g base salary. */
    }
}
