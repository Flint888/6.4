public class TopManager extends Staff {
    Company company = new Company();
    int fixSalaryTopManager = 150_000;

    public TopManager(String position) {
        super(position);
    }

    private int setMonthSalary() {
        int topSalaryTopManager = (int) (fixSalaryTopManager + (fixSalaryTopManager * 2.5));
        if (company.getIncome() > 10_000_000) {
            return topSalaryTopManager;
        }
        return fixSalaryTopManager;
    }

    @Override
    public double getMonthSalary() {
        return setMonthSalary();
    }
}


