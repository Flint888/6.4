import java.util.List;

public abstract class Company {

    public static double income;


    void hire() {

    }

    void hireAll() {

    }

    void fire() {

    }

    double getIncome() {
        return income;
    }

    public static void setIncome(Manager manager) {
        double sum = 0;
        sum += manager.getBonus();
    }

    List<Employee> getTopSalaryStaff(int count) {
        return null;
    }

    List<Employee> getLowestSalaryStaff(int count) {
        return null;
    }
}
