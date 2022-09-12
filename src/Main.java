import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

                int c = 0, number =0;

        String []  Employee = new String[10];
        System.out.println("Введите действие :");
        System.out.println("1 :Ввод данных сотрудников");
        System.out.println("2 Операции с данными");
        System.out.println("3 Редактирование данных");
        System.out.println("Введите число :");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();

        switch (a) {
            case 1:
                for (int i = 0; i < 100; i++) {
                    System.out.println("Введите ФИО сотрудника :");
                    Scanner scan1 = new Scanner(System.in);
                    String name = scan1.nextLine();
                    System.out.println("Введите отдел сотрудника :");
                    int department1 = scan.nextInt();
                    System.out.println("Введите зарплату сотрудника :");
                    int salary1 = scan.nextInt();
                    Employee z = new Employee(i,name,department1,salary1);
                    System.out.println("Завершить ввод? : 0 - нет, 1-да");
                    int с = scan.nextInt();
                    if (c == 1) {
                        break;
                    }
                    number ++;
                    EmoloyeeBook.id(i);


                }
                break;
            case 2:
                System.out.println("Введите действие :");
                System.out.println("1 Получить список всех сотрудников с данными");
                System.out.println("2 Посчитать сумму затрат на зарплаты в месяц");
                System.out.println("3 Найти сотрудника с минимальной зарплатой. ");
                System.out.println("Введите число :");
                a = scan.nextInt();
                switch (a) {
                    case 1:

                        EmoloyeeBook.allEmployee();
                        break;
                    case 2:
                        EmoloyeeBook.salaryAll(1);
                        break;
                    case 3:
                        EmoloyeeBook.minimum();
                        break;
                }
                //И так далее не буду расписывать все варианты
                //Очень сложно
            case 3:
                System.out.println("Введите действие :");
                System.out.println("1 Добавить нового сотрудника ");
                System.out.println("2 Удалить сотрудника");
                System.out.println("3 Изменить зарплату. ");
                System.out.println("4 Изменить отдел.  ");
                System.out.println("Введите число :");
                a = scan.nextInt();
                switch (a) {
                    case 1:
                        System.out.println("Введите ФИО сотрудника :");
                        Scanner scan1 = new Scanner(System.in);
                        String name = scan1.nextLine();
                        System.out.println("Введите отдел сотрудника :");
                        int department1 = scan.nextInt();
                        System.out.println("Введите зарплату сотрудника :");
                        int salary1 = scan.nextInt();

                        EmoloyeeBook.newStaff(name,department1,salary1);
                        break;
                    case 2:
                        System.out.println("Введите id сотрудника :");
                        int id1 = scan.nextInt();
                        EmoloyeeBook.deleteStaff(id1);
                        break;
                    case 3:

                        break;
                }


        }

    }
}