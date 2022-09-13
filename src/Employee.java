import java.util.Arrays;
import java.util.Objects;

public class Employee {

    public  int id ;

    public String name;
    //отделы сотрудников
    static double department ;
    static int salary ;

    public Employee(String name, int department, int salary){
        this.name = name;
        this.department = department;
        this.salary = salary;


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getSalary() {
        return salary;
    }

    public static double getDepartment() {
        return department;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee name1 = (Employee) o;
        return id == name1.id && number1 == name1.number1 && Objects.equals(name, name1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, number1, name);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Employee=" + Arrays.toString(name.toCharArray()) +
                '}';
    }


}
