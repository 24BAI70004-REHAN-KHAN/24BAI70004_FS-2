import java.util.Scanner;

class Employee {
    private String name;
    private double basicSalary;

    public String getName() { return name; }
    public void setName(String n) { name = n; }
    public double getBasicSalary() { return basicSalary; }
    public void setBasicSalary(double s) { if (s > 0) basicSalary = s; }
    public double calculateSalary() { return basicSalary; }
}

class PermanentEmployee extends Employee {
    public double calculateSalary() { return getBasicSalary() * 1.2; }
}

class ContractEmployee extends Employee {
    public double calculateSalary() { return getBasicSalary() * 1.1; }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine().trim());
        while (t-- > 0) {
            String type = sc.nextLine().trim();
            Employee e = type.equals("P") ? new PermanentEmployee() : new ContractEmployee();
            e.setName(sc.nextLine().trim());
            e.setBasicSalary(Double.parseDouble(sc.nextLine().trim()));
            System.out.println("Employee: " + e.getName());
            System.out.printf("Final Salary: %.2f%n", e.calculateSalary());
        }
    }
}