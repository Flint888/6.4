public class Manager extends Staff implements Employee{


    public Manager(String position, double fixSalary) {

        setPosition(position);
        setFixSalary(fixSalary);
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
        setFixSalary(100_000);
        setBonus((rnd / 100 * 5) + getFixSalary());
        return getBonus();
    }
}
