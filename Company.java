import java.util.List;

public abstract class Company {

    private static final int min = 115_000; // Минимальное число для диапазона
    private static final int max = 140_000; // Максимальное число для диапазона
    private static final int rnd = rnd(min, max);
    public static int rnd(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }


    void hire() {

    }

    void hireAll() {

    }

    void fire() {

    }

    void getIncome() {

    }

    List<Employee> getTopSalaryStaff(int count) {
        return null;
    }

    List<Employee> getLowestSalaryStaff(int count) {
        return null;
    }
}
