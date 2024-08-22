class Employee {
    protected double baseSalary;

    public Employee(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double calculateSalary() {
        return baseSalary;
    }
}

class Manager extends Employee {
    private double bonus;

    public Manager(double baseSalary, double bonus) {
        super(baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + bonus;
    }
}


class Programmer extends Employee {
    private double overtimePay;

    public Programmer(double baseSalary, double overtimePay) {
        super(baseSalary);
        this.overtimePay = overtimePay;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + overtimePay;
    }
}


class Main {
    public static void main(String[] args) {
        Employee manager = new Manager(50000, 10000);
        Employee programmer = new Programmer(40000, 1000);

        System.out.println("Manager Salary: " + manager.calculateSalary());
        System.out.println("Programmer Salary: " + programmer.calculateSalary());
    }
}
