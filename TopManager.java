public class TopManager extends Staff implements Employee {

    public TopManager(String position, double fixSalary) {

        super();
        setBonus((getFixSalary() + (getFixSalary() * 2.5)));
    }

    @Override
    public double getMonthSalary() {
        if (getIncome() > 10_000_000) {
            return getBonus();
        } else return getFixSalary();
    }
}
