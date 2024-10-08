package LatihanSoal;

public class FullTime extends Teacher {
    private final int annualSalary;
    private final String unit;

    public FullTime(String name, int age, String subject, int annualSalary, String unit) {
        super(name, age, subject);
        this.annualSalary = annualSalary;
        this.unit = unit;
    }

    public void print() {
        super.print();
        System.out.println("Annual Salary: " + annualSalary);
        System.out.println("Unit: " + unit);
    }
}
