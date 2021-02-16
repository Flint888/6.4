import java.util.ArrayList;
import java.util.List;

public class Manager extends Staff implements Employee{


    public Manager(String position, double fixSalary) {

        super();
        setBonus((rnd / 100 * 5) + getFixSalary());
    }

    private static final double min = 115_000; // Минимальное число для диапазона
    private static final double max = 140_000; // Максимальное число для диапазона
    private static final double rnd = rnd(min, max);
    public static double rnd(double min, double max) {
        max -= min;
        return (Math.random() * ++max) + min;
    }

    @Override
    public double getMonthSalary() {
        return getBonus();
    }
}
