public class TopManager extends Staff implements Employee{

    public TopManager(String name, String position,  int age, int fixSalary) {
        super.name = name;
        super.age = age;
        super.position = position;
        super.fixSalary = fixSalary;
    }

    @Override
    public int getMonthSalary() {
        fixSalary = 150_000;
        if (  > 10_000_000){
            double salary = fixSalary + (fixSalary * 2.5);
        }
    }
}
