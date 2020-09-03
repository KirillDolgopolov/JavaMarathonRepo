package Day11;
/*
Каждый раз когда сотрудник выполняет свою работу
(вызов метод doWork()), ему выплачивается заработная плата (сокр. ЗП) (80 - сборщику, 100 - курьеру).
А также при вызове doWork() у Сборщика,
происходит увеличение значения поля countOrder в классе Warehouse на 1.
При вызове doWork() у Курьера, происходит увеличение переменной balance в классе Warehouse на 1000.
Сотрудникам полагается бонус: когда на складе отгружено 1500 заказов,
заработанная к тому моменту ЗП сборщика утраивается.
Когда складом заработан 1.000.000, заработанная к тому моменту ЗП курьера удваивается.

Для демонстрации и тестирования работы программы с
оздайте склад и по 1 рабочему, вызовите у каждого методы doWork() и bonus(),
столько раз, чтобы каждый из сотрудников получил бонус.
Выведите в консоль баланс и количество выполненных заказов на складе и ЗП каждого из сотрудников.

Рекомендации: для получения данных склада внутри классов сотрудников
реализуйте хранение ссылки на объект Warehouse и передавайте ее с помощью конструктора или сеттера.
*/

public class Task1 {
    public static void main(String[] args) {
        Warehouse amazon=new Warehouse();
        Picker picker = new Picker();
        Courier courier = new Courier();
        System.out.println(amazon);
        System.out.println("Начинаем работу");
        for (int i = 0; i < 500; i++) {
            picker.doWork(amazon);
            picker.bonus(amazon);
            courier.doWork(amazon);
            courier.bonus(amazon);
        }
        System.out.println("Проверка через 500 заказов");
        System.out.println(amazon);
        System.out.println("Salary of Courier = "+courier.getSalary());
        System.out.println("Salary of Picker = " +picker.getSalary());

        for (int i = 0; i < 500; i++) {
            picker.doWork(amazon);
            picker.bonus(amazon);
            courier.doWork(amazon);
            courier.bonus(amazon);}

            System.out.println("Проверка через 1000 заказов");
            System.out.println(amazon);
        System.out.println("Salary of Courier = "+courier.getSalary());
        System.out.println("Salary of Picker = " +picker.getSalary());

            for (int i = 0; i < 500; i++) {
                picker.doWork(amazon);
                picker.bonus(amazon);
                courier.doWork(amazon);
                courier.bonus(amazon);}

                System.out.println("Проверка через 1500 заказов");
                System.out.println(amazon);
        System.out.println("Salary of Courier = "+courier.getSalary());
        System.out.println("Salary of Picker = " +picker.getSalary());

        for (int i = 0; i < 500; i++) {
            picker.doWork(amazon);
            picker.bonus(amazon);
            courier.doWork(amazon);
            courier.bonus(amazon);}

            System.out.println("Проверка через 2000 заказов");
            System.out.println(amazon);
        System.out.println("Salary of Courier = "+courier.getSalary());
        System.out.println("Salary of Picker = " +picker.getSalary());


    }
}
