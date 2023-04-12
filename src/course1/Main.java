package course1;

public class Main {
    public static void getFullInformation(Employee[] employees) {
        for (Employee e : employees) {
            System.out.println(e);
        }
    }

    public static int calculateMonthSalary(Employee[] employees) {
        int sum = 0;
        for (Employee e : employees) {
            sum += e.salary;
        }
        System.out.println(sum);
        return sum;
    }

    public static int getMinimalSalary(Employee[] employees) {
        int minSalary = Integer.MAX_VALUE;
        for (Employee e : employees) {
            if (e.salary < minSalary) {
                minSalary = e.salary;
            }
        }
        System.out.println(minSalary);
        return minSalary;
    }

    public static int getMaxSalary(Employee[] employees) {
        int maxSalary = Integer.MIN_VALUE;
        for (Employee e : employees) {
            if (e.salary > maxSalary) ;
            maxSalary = e.salary;
        }
        System.out.println(maxSalary);
        return maxSalary;
    }


    public static double getAverageSalary(Employee[] employees) {
        int sum = 0;
        for (Employee e : employees) {
            sum += e.salary / employees.length;
        }
        System.out.println(sum);
        return sum;
    }


    public static void getEmployeesList(Employee[] employees) {
        for (Employee e : employees) {
            System.out.println(e.name);
        }
    }

    public static void main(String[] args) {
        Employee[] employees = new Employee[10];

        Employee annaLi = new Employee("Li Anna Pavlovna", 1, 55_000);
        Employee ivanIvanov = new Employee("Ivanov Ivan Ivanovich ", 2, 100_000);
        Employee olgaLi = new Employee("Li Olga Pavlovna ", 3, 45_000);
        Employee pavelPavlov = new Employee("Pavlov Pavel Pavlovich ", 3, 76_700);
        Employee pavelIvanov = new Employee("Ivanov Pavel Pavlovich ", 5, 76_700);
        Employee annaIvanova = new Employee("Ivanova Anna Ivanovna ", 3, 110_500);
        Employee yanaPoe = new Employee("Poe Yana Pavlovna ", 1, 120_000);
        Employee svetlanaErmakova = new Employee("Ermakova Svetlana Nikolaevna ", 1, 90_000);
        Employee galinaSergeeva = new Employee("Sergeeva Galina Nikolaevna ", 1, 90_000);
        Employee evgeniyaOrlova = new Employee("Orlova Evgeniya Vladimirovna ", 1, 120_000);

        employees[0] = annaLi;
        employees[1] = ivanIvanov;
        employees[2] = olgaLi;
        employees[3] = pavelPavlov;
        employees[4] = pavelIvanov;
        employees[5] = annaIvanova;
        employees[6] = yanaPoe;
        employees[7] = svetlanaErmakova;
        employees[8] = galinaSergeeva;
        employees[9] = evgeniyaOrlova;

        getFullInformation(employees);
        System.out.println();
        calculateMonthSalary(employees);
        System.out.println();
        getAverageSalary(employees);
        System.out.println();
        getMinimalSalary(employees);
        System.out.println();
        getMaxSalary(employees);
        System.out.println();
        getEmployeesList(employees);
    }
}

