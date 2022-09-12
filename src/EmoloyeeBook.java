public class EmoloyeeBook {
    //private static String[] Employee = new String[];
   // private static int[] department = new int[];
   // private static int[] salary = new int[]
    public static void allEmployee() {
        for (int i = 0; i < Employee.Employee.length; i++) {
            System.out.println((i+1) +" :  " + Employee.Employee[i] + "  отдел : "
                    + Employee.department[i] + "  зарплата : " + Employee.salary[i]);
        }
    }
     public static int salaryAll(int x) {
        int summ = 0;
        for (int i = 0; i < Employee.salary.length; i++) {
            summ = summ + Employee.salary[i];
        }
        if (x!=0) {System.out.println("Сумма всех зарплат в месяц : " +  summ);}
        return summ;
    }

     public static void minimum() {
        int  min = 100000000;
        for (int i = 0; i < Employee.salary.length; i++) {
            if (min > Employee.salary[i]) {
                min = Employee.salary[i];
            }
        } System.out.println("Минимальная зарплата в месяце : " +  min);
    }
     public void maximum() {
        int  max = 0;
        for (int i = 0; i < Employee.salary.length; i++) {
            if (max < Employee.salary[i]) {
                max = Employee.salary[i];
            }
        } System.out.println("Максимальная зарплата в месяце : " +  max);
    }
    public  void averageSalary() {
        int average = 0;
        average = salaryAll(0) / Employee.salary.length;
        System.out.println("Средняя зарплата в месяце : " +  average);
    }
    public  void allStaff() {
        System.out.println("Список всех сотрудников : ");
        for (int i = 0; i < Employee.Employee.length; i++) {
            System.out.println((i+1) +" :  " + Employee.Employee[i] );
        }
    }
    // Повышенная сложность

    public  void indexing(int x) {
        for (int i = 0; i < Employee.salary.length; i++) {
            Employee.salary[i] = Employee.salary[i] + Employee.salary[i]*x/100;
        }
    }
    public  void departmentMin(int x) {
        int min =100000000;
        for (int i = 0; i < Employee.department.length; i++) {
            if (x == Employee.department[i]) {
                if (min > Employee.salary[i]) {
                    min = Employee.salary[i];
                }
            }
        }  System.out.println("В отделе : " + x +  "Минимальная зарплата в месяце : " +  min);
    }
    public static void departmentMax(int x) {
        int max =0;
        for (int i = 0; i < Employee.department.length; i++) {
            if (x == Employee.department[i]) {
                if (max < Employee.salary[i]) {
                    max = Employee.salary[i];
                }
            }
        }  System.out.println("В отделе : " + x +  "Максмальная зарплата в месяце : " +  max);
    }
    public  void departmentSumm(int x) {
        int summ = 0;
        for (int i = 0; i < Employee.department.length; i++) {
            if (x == Employee.department[i]) {
                summ = summ + Employee.salary[i];

            }
        }  System.out.println("В отделе : " + x +  "Сумма зарплат в месяце : " +  summ);

    }
    public  void departmentAverage(int x) {
        int summ = 0, a = 0;
        for (int i = 0; i < Employee.department.length; i++) {
            if (x == Employee.department[i]) {
                summ = summ + Employee.salary[i];
                a = a++;

            }
        }  System.out.println("В отделе : " + x +  "Средняя зарплата в месяце : " +  summ/a);

    }
    public  void departmentIndexing(int x,int protsent) {
        int summ = 0;
        for (int i = 0; i < Employee.department.length; i++) {
            if (x == Employee.department[i]) {
                Employee.salary[i] = Employee.salary[i] + Employee.salary[i]* protsent/100;

            }
        }  System.out.println("В отделе : " + x +  "Сумма зарплат в месяце : " +  summ);

    }
    public  void departmentAll(int x) {
        System.out.println(" В отделе " + x + " : ");
        for (int i = 0; i < Employee.department.length; i++) {
            if (x == Employee.department[i]) {
                System.out.println("Сотрудник : " + Employee.Employee[i] + " Зарплата : " + Employee.salary[i]);

            }
        }

    }
    public  void less(int x) {
        for (int i = 0; i < Employee.salary.length; i++) {
            if (x > Employee.salary[i]) {
                System.out.println("Сотрудник :  " + Employee.Employee[i] + "id : " + Employee.id[i] + " зарплата : " + Employee.salary[i]);
            }
        }
    }
    public  void more(int x) {
        for (int i = 0; i < Employee.salary.length; i++) {
            if (x <= Employee.salary[i]) {
                System.out.println("Сотрудник :  " + Employee.Employee[i] + "id : " + Employee.id[i] + " зарплата : " + Employee.salary[i]);
            }
        }
    }
    // присвоение значение id
    public  static void  id(int b) {
        int a = 0;
        for (int i = 0; i < Employee.id.length; i++) {
            if (a < Employee.id[i]) {
                a = Employee.id[i];
            }
            Employee.id[b] = a + 1;

        }
    }
    // Добавить нового сотрудника
    public  static void newStaff(String name, int department1, int salary1) {
        for (int i = 0; i < Employee.department.length; i++) {
            if (Employee.department[i] == 0) {
                Employee z = new Employee(i,name,department1,salary1);
                id(i);
            }
        }

    }
    //удалить сотрудника
    public static void deleteStaff(int number) {
        for (int i = 0; i < Employee.department.length; i++) {
            if (Employee.id[i] == number) {
                number = i;
                Employee z = new Employee(number,"",0,0);

            }
        }

    }


}
