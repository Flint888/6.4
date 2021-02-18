import java.beans.FeatureDescriptor;

public class Manager extends Staff {
    Company company = new Company();

    private int bonus = (int) ((company.getIncome() / 100) * 5);
    private final int MIN = 115_000;
    private final int MAX = 140_000;
    final int fixSalaryManager = 75_000;                // Фиксированая зарплата менеджера
    private final int generateMoneyCompany = rnd(MIN, MAX);   // Сумма заработанная менеджером для компании
    private int salaryManager = setMonthSalary();       //Месячная зп менеджера

    public Manager(String position) {
        super(position);
        setIncomeMeneger();
    }

    private int rnd(int min, int max) {          // Генерируем сумму заработанную менеджером
        max -= min;
        return (int) (Math.random() * max) + min;
    }

    void setIncomeMeneger() {                             // Метод передает сумму заработанную менеджером для компании
        company.setIncome(generateMoneyCompany);
    }

    private int setMonthSalary() {                     // Получаем месячную зп менеджера с прибыли
        return salaryManager = bonus + fixSalaryManager;
    }

    @Override
    public double getMonthSalary() {
        return salaryManager;
    }
}
