public class Operator extends Staff implements Employee{

    public Operator(String position, double fixSalary) {

        setPosition(position);
        setFixSalary(fixSalary);
    }

    @Override
    public double getMonthSalary() {
        setFixSalary(50_000);
        return getFixSalary();
    }
}
