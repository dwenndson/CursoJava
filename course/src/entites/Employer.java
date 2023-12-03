package course.src.entites;

public class Employer {
    public String name;
    public Double salary;
    public Double tax = 1000.00;

    public void increaseSalary(double percente) {
        this.salary += percente / 100 * this.salary ;
    }
    private Double netSalary() {
        return this.salary - this.tax;
    }
    public String toString() {
        return name + ", $ " + String.format("%.2f", netSalary());
    }
}
