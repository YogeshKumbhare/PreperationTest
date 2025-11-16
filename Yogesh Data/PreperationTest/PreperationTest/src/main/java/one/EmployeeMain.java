package one;

import java.util.HashMap;

public class EmployeeMain implements Cloneable{
    public static void main(String[] args) {
        HashMap<Employee, String> employeeHashMap = new HashMap<>();

       Employee e1 =  new Employee(1,"YOGESH","5000");
        Employee e2 =  new Employee(1,"YOGESH","5000");

        System.out.println(e1.hashCode());
        System.out.println(e2.hashCode());

        employeeHashMap.put(e1,"PUNE");
        employeeHashMap.put(e2,"PUNE");
         final String str = "test";
         final String str1 = "test4";
        System.out.println(str.hashCode());
        System.out.println(str1.equals(str));
        //System.out.println(employeeHashMap);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");

        employeeHashMap.forEach((k , v) -> System.out.println( "key :" + k.name + " " + k.salary + " " + "value :" + v));

    }
}
