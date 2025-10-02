public class Manager extends Employee {
    private double fixedSalary;
    private double bonus;

    public Manager(String name, String employeeId, String position, double fixedSalary, double bonus) {
        super(name, employeeId, position);
        this.fixedSalary = fixedSalary;
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return fixedSalary + bonus;
    }
}
