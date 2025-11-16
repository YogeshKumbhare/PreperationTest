package one;

import java.util.Objects;

public class Employee {


    int id;
    String name;
    String salary;
    public Employee(int id, String name, String salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }




    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getSalary());
    }
}
