import java.util.ArrayList;
import java.util.List;

public class Company {

    private List<Employee> list = new ArrayList<>();

    private static long income = 0;

    void hire(Employee employee) {
        list.add(employee);
        System.out.println(list);
    }

    void hireAll(List<Employee> employees) {
        list.addAll(employees);
    }

    void fire(Employee employee) {
        list.remove(employee);
    }

    public double getIncome() {
        return Company.income;
    }

    public void setIncome(int income) {
        Company.income += income;
    }

    List<Employee> getTopSalaryStaff(int count) {
        return list;
    }

    List<Employee> getLowestSalaryStaff(int count) {
        return list;
    }
}
