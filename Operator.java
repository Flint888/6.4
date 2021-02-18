public class Operator extends Staff{

    int operatorFixSalary = 50_000;

    public Operator(String position) {
        super(position);
    }

    @Override
    public double getMonthSalary() {
        return operatorFixSalary;
    }
}
