package me.grapebaba;

import java.util.List;

/**
 * Created by grapebaba on 9/30/17.
 */
class Employee {
    // It's the unique id of each node;
    // unique id of this employee
    public int id;
    // the importance value of this employee
    public int importance;
    // the id of direct subordinates
    public List<Integer> subordinates;
};

public class A690 {
    public int getImportance(List<Employee> employees, int id) {
        int total = 0;
        for (Employee employee : employees) {
            if (employee.id == id) {
                total = total + employee.importance;
                for (Integer sid : employee.subordinates) {
                    total = total + getImportance(employees, sid);
                }
            }
        }
        return total;
    }
}
