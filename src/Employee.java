import java.util.Arrays;

public class Employee {

    public static int[] id = new int[10];
    int number1 = 0;

    // Данные в массивы для тестовой работы
    public static String[] Employee = new String[10];
    //отделы сотрудников
    static int[] department = new int[10];
    static int[] salary = new int[10];

    public  Employee (int number,String name, int department1, int salary1){
        Employee[number] = name;
        department[number] = department1;
        salary[number] = salary1;


    }

    public String[] getEmployee() {
        return Employee;
    }

    public void setEmployee(String[] employee) {
        Employee = employee;
    }

    public int[] getSalary() {
        return salary;
    }

    public void setSalary(int[] salary) {
        this.salary = salary;
    }

    public int[] getDepartment() {
        return department;
    }

    public void setDepartment(int[] department) {
        this.department = department;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Arrays.equals(Employee, employee.Employee) && Arrays.equals(department, employee.department) && Arrays.equals(salary, employee.salary);
    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(Employee);
        result = 31 * result + Arrays.hashCode(department);
        result = 31 * result + Arrays.hashCode(salary);
        return result;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Employee=" + Arrays.toString(Employee) +
                '}';
    }


}
