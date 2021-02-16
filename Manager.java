public class Manager extends Staff implements Employee{


    public Manager(String name, String position,  int age, int fixSalary) {
        super.name = name;
        super.age = age;
        super.position = position;
        super.fixSalary = fixSalary;
    }

    private static final int min = 115_000; // Минимальное число для диапазона
    private static final int max = 140_000; // Максимальное число для диапазона
    private static final int rnd = rnd(min, max);
    public static int rnd(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }


    @Override
    public int getMonthSalary() {
        fixSalary = 100_000;
        return (rnd / 100 * 5) + fixSalary;
    }
}
