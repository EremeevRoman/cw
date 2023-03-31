public class Main {


    public static int generateNumber(int max) {
        java.util.Random random = new java.util.Random();
        return random.nextInt(1, max);
    }

    public static void main(String[] args) {
        Employee[] emp = new Employee[10];
        emp[0] = new Employee("Захаров Фрол Созонович", generateNumber(5), generateNumber(100000));
        emp[1] = new Employee("Молчанов Арсен Альвианович", generateNumber(5), generateNumber(100000));
        emp[2] = new Employee("Морозов Игорь Георгьевич", generateNumber(5), generateNumber(100000));
        emp[3] = new Employee("Овчинников Андрей Никитевич", generateNumber(5), generateNumber(100000));
        emp[4] = new Employee("Бобров Казимир Павлович", generateNumber(5), generateNumber(100000));
        emp[5] = new Employee("Яковлев Тимур Павлович", generateNumber(5), generateNumber(100000));
        emp[6] = new Employee("Зиновьев Владимир Куприянович", generateNumber(5), generateNumber(100000));
        emp[7] = new Employee("Игнатьев Григорий Авксентьевич", generateNumber(5), generateNumber(100000));
        emp[8] = new Employee("Доронин Устин Алексеевич", generateNumber(5), generateNumber(100000));
        emp[9] = new Employee("Балтабай Алибек Нарутович", generateNumber(5), generateNumber(100000));
        int totalSalary = 0;
        int maxSalary = Integer.MIN_VALUE;
        int minSalary = Integer.MAX_VALUE;
        for (Employee r : emp) {
            if (r.getSalary() > maxSalary) {
                maxSalary = r.getSalary();
            }
            if (r.getSalary() < minSalary) {
                minSalary = r.getSalary();
            }
            totalSalary = totalSalary + r.getSalary();
            System.out.println(r.getName() + " " + r.getSalary() + " рублей " + r.getDepartment() + "  отдел");

        }
        float averageSalary = totalSalary / 10f;
        System.out.println(averageSalary + " Средняя зарплата");
        System.out.println(maxSalary + " Максимальная зарплата");
        System.out.println(minSalary + " Минимальная зарплата");
        System.out.println(totalSalary + " Общая сумма затрат на зарплату");


    }

}