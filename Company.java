import java.util.List;

public abstract class Company {

    public static double income = 0;


    void hire() {

    }

    void hireAll() {

    }

    void fire() {

    }

    double getIncome() {
        return income;
    }

    public void setIncome(Double d) {
        income += d;
    }

    List<Employee> getTopSalaryStaff(int count) {
        return null;
    }

    List<Employee> getLowestSalaryStaff(int count) {
        return null;
    }
}
