import java.util.Arrays;

public class Employee {
    static int[] id = new  int[10];

      String name;
    public static String[] Employee = new String[]{"Думцева Дарья Васильевна",
            "Воловеповна Наталья Вячеславовна", "Потапов Иван Георгиевич",
            "Кутова Алла Григорьевна", "Гойзман Ася Алепаева", "Фаер Василий Иванович",
            "Иванов Григорий Алексеевич", "Головенько Анасиасия Александровна",
            "Сидоров Иван Васильевич", "Михайло Ирина Анатольевна"};
    //отделы сотрудников
    static int[] department = new int[]{3,4,1,2,5,3,1,5,4,2,};
    static int[] salary = new int[]{25643,34564,53452,12321,65478,34528,55464,
            44529,43675,63451};

    public Employee (int id,String name,int department1,int salary1){
        //this.name = name;
       // String[] Employee = new Employee[id]{String name }
        Employee[id] = name;
        department[id] = department1;
        salary[id] = salary1;

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
