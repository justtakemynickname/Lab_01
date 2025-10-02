public class Main {
    public static void main(String[] args) {
        EmployeeSystem system = new EmployeeSystem();

        // Создание сотрудников разных типов
        Worker w1 = new Worker("Иван Иванов", "W001", "Рабочий", 500, 160);
        Worker w2 = new Worker("Петр Петров", "W002", "Рабочий", 450, 150);

        Manager m1 = new Manager("Анна Смирнова", "M001", "Менеджер", 50000, 10000);
        Manager m2 = new Manager("Ольга Сидорова", "M002", "Менеджер", 60000, 15000);

        // Добавление сотрудников
        system.addEmployee(w1);
        system.addEmployee(w2);
        system.addEmployee(m1);
        system.addEmployee(m2);

        // Отображение зарплат
        system.displaySalaries();
    }
}
