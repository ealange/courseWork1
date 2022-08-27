public class Main {
    static Employee[] empolоyeeBook = new Employee[10];

    public static void main(String[] args) {

//       делаем образец, занимаем 0 элемент массива
        Person personPushkin = new Person("Pushkin", "Alexandr", "Sergeevi");
        Person ivanovII = new Person("Иванов", "Иван", "Иванович");
        Person sidorovSS = new Person("Сидров", "Сидор", "Сидорович");
        Person petrovPP = new Person("Петров", "Петр", "Петрович");
        Person ivanovvII = new Person("Ивановв", "Иван", "Иванович");
        Person sidorovvSS = new Person("Сидровв", "Сидор", "Сидорович");
        Person petrovvPP = new Person("Петровв", "Петр", "Петрович");

        empolоyeeBook[0] = new Employee(personPushkin, 5, 123465);
        empolоyeeBook[1] = new Employee(ivanovII, 2, 11111);
        empolоyeeBook[2] = new Employee(sidorovSS, 1, 22222);
        empolоyeeBook[3] = new Employee(petrovPP, 1, 33333);
        empolоyeeBook[4] = new Employee(ivanovvII, 4, 11110);
        empolоyeeBook[5] = new Employee(sidorovvSS, 3, 22220);
        empolоyeeBook[7] = new Employee(null, 5, 33335);
        printAllEmployee();
        System.out.println("сотрудник с мин.зарплатой: " + getEmployeeMinSalary());
        printFullNameAllEmployee();
        System.out.println("сотрудник с мах.зарплатой: " + getEmployeeMaxSalary());
        System.out.println("Средняя ЗП: " + getAndCalculateAverageSalary());

    }

    public static void printAllEmployee() {
        for (int i = 0; i < empolоyeeBook.length; i++) {
            System.out.println(empolоyeeBook[i]);

        }
    }

    public static int getCalculateSalarySum() {
        int sum = 0;
        for (Employee employee : empolоyeeBook) {
            if (employee != null) {
                sum = sum + employee.getSalary();
            }
        }
        return sum;
    }

    public static double getAndCalculateAverageSalary() {
        double sumSalaryAllEmpl = getCalculateSalarySum();
        if (empolоyeeBook.length != 0) {
            return sumSalaryAllEmpl / empolоyeeBook.length;
        } else {
            return 0;
        }
    }

    public static Employee getEmployeeMinSalary() {
        int minSalary = -1;
        Employee minSalaryEmployee = null;
        int indexMinSalaryEmployee = 0;
        for (int i = 0; i < empolоyeeBook.length; i++) {
            if (empolоyeeBook[i] != null) {
                minSalary = empolоyeeBook[i].getSalary();
                minSalaryEmployee = empolоyeeBook[i];
                indexMinSalaryEmployee = i;
                break;
            }
        }

        for (int i = indexMinSalaryEmployee; i < empolоyeeBook.length; i++) {
            if (empolоyeeBook[i] != null) {
                if (minSalary > empolоyeeBook[i].getSalary()) {
                    minSalary = empolоyeeBook[i].getSalary();
                    minSalaryEmployee = empolоyeeBook[i];

                }
            }

        }

        return minSalaryEmployee;
    }

    public static Employee getEmployeeMaxSalary() {
        int maxSalary = -1;
        Employee maxSalaryEmployee = null;
        int indexMaxSalaryEmployee = 0;
        for (int i = 0; i < empolоyeeBook.length; i++) {
            if (empolоyeeBook[i] != null) {
                maxSalary = empolоyeeBook[i].getSalary();
                maxSalaryEmployee = empolоyeeBook[i];
                indexMaxSalaryEmployee = i;
                break;
            }
        }

        for (int i = indexMaxSalaryEmployee; i < empolоyeeBook.length; i++) {
            if (empolоyeeBook[i] != null) {
                if (maxSalary < empolоyeeBook[i].getSalary()) {
                    maxSalary = empolоyeeBook[i].getSalary();
                    maxSalaryEmployee = empolоyeeBook[i];

                }
            }

        }

        return maxSalaryEmployee;
    }


    public static void printFullNameAllEmployee() {
        for (int i = 0; i < empolоyeeBook.length; i++) {
            if (empolоyeeBook[i] != null && empolоyeeBook[i].getPerson() != null) {
                System.out.println(empolоyeeBook[i].getPerson().toString());
            }
        }
    }
}
