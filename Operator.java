public class Operator extends Staff implements Employee{

    public Operator(String name, String position,  int age, int fixSalary) {
        super.name = name;
        super.age = age;
        super.position = position;
        super.fixSalary = fixSalary;
    }

    @Override
    public int getMonthSalary() {
        fixSalary = 50_000;
        return fixSalary;
    }
}
