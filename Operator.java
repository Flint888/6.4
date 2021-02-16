public class Operator extends Staff implements Employee {

    public Operator(String position, double fixSalary) {

        super();
    }

    @Override
    public double getMonthSalary() {
        return getFixSalary();
    }
}
